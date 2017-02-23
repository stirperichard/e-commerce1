package com.afjcjsbx.eshop.controller.feedback;

import com.afjcjsbx.eshop.entity.feedback.Review;
import com.afjcjsbx.eshop.exceptions.DatabaseException;
import com.afjcjsbx.eshop.persistence.ReviewDAO;
import com.afjcjsbx.eshop.persistence.ReviewDAOImpl;

import java.util.List;

/**
 * Controller is Singleton.
 */
public class ManageFeedbackController {

	private static ManageFeedbackController instance;

	public synchronized static ManageFeedbackController getInstance() {
		if (instance == null)
			instance = new ManageFeedbackController();
		return instance;
	}

    private ManageFeedbackController() {
    }

    public void addProductReview(int productId, String username, int rating, String comment) throws DatabaseException { // parametri passati attraverso i bean del feedback e del login

		ReviewDAO dao = ReviewDAOImpl.getInstance();

        Review review = new Review(productId, username, rating, comment);

        dao.storeReview(review);
    }

    public List<Review> retrieveProductReviews(int productId) throws DatabaseException {
        ReviewDAO dao = ReviewDAOImpl.getInstance();

        List<Review> reviewsList = dao.findReviewsByProductId(productId);

        return reviewsList;
    }

    public List<Review> retrieveReviewsFromUser(String username) throws DatabaseException {
        ReviewDAO dao = ReviewDAOImpl.getInstance();

        List<Review> reviewsList = dao.findReviewsByUsername(username);

		return reviewsList;
    }

	public static void main(String[] args) throws DatabaseException {
        ManageFeedbackController.getInstance().addProductReview(2, "Luca", 4, "PROVA");
	}

}



    /**
	 * Aggiunge un commento alla locazione se l'utente ha effettuato almeno una
	 * prenotazione
	 * 
	 * @param feedbackBean
	 *            bean contenente l'id della locazione,il nickname di chi vuole
	 *            commentare e il commento
	 * @return true se il commento viene effettuato correttamente, false
	 *         altrimenti
	 *//*
	public boolean commentaLocazione(FeedbackBean feedbackBean) {
		if (feedbackBean.getCommento() == null || feedbackBean.getIdLocazione() == 0
				|| feedbackBean.getNickname() == null)
			return false;
		try {

			List<Prenotazione> pren = PrenotazioneDAO.getInstance()
					.cercaPrenotazioniDaIdUtente(feedbackBean.getNickname());
			boolean prenotato = false;
			int idLoc=0;
			for (Prenotazione p : pren) {
				if (p.getLocazioneId() == feedbackBean.getIdLocazione()) {
					prenotato = true;
					idLoc=p.getLocazioneId();
					break;
				}
			}
			if (prenotato){
				Notifica notif=new Notifica();
				notif.setUtenteMittente(feedbackBean.getNickname());
				Locazione loc;
				try {
					loc = Locazione.cercaLocazioneDaId(idLoc);
				} catch (SQLException e) {
					loc=null;
				}
				notif.setUtenteDestinatario(loc.getProprietario().getNickName());
				notif.setOggettoNotifica("Nuovo Feedback ricevuto");
				notif.setMessaggio("L'utente "+feedbackBean.getNickname()+" ha lasciato un feedback sulla tua locazione: "+loc.getNomeLoc());
				notif.salva();
				return Feedback.commentaLocazione(new Feedback(feedbackBean.getIdLocazione(), new UtenteCliente(feedbackBean.getNickname()), feedbackBean.getCommento()));
			}return false;
		} catch (DatabaseException e) {
			return false;
		}

	}

	*//**
	 * Verifica se l'utente e la password sono corretti
	 * 
	 * @param feedbackBean
	 *            bean contenente il nome utente e la password
	 * @return true se la combinazione � corretta
	 *//*
	public boolean verificaUtente(FeedbackBean feedbackBean) {
		try {
			if (feedbackBean.getNickname().equals("") || feedbackBean.getPassword().equals(""))
				return false;
			return UtenteGenerico.esisteUtente(feedbackBean.getNickname(), feedbackBean.getPassword());
		} catch (DatabaseException e) {
			return false;
		}

	}

	*//**
	 * Ricerca della locazione corrispondente ad un determinato nome
	 * 
	 * @param nomeLocazione
	 *            nome della locazione da cercare
	 * @return la locazione corrispondente, null altrimenti
	 *//*
	public Locazione cercaLocazioneDaNome(String nomeLocazione) {

		try {
			if (nomeLocazione.equals(""))
				return null;
			return Locazione.cercaLocazioneDaNome(nomeLocazione);
		} catch (DatabaseException e) {
			return null;

		}

	}

	*//**
	 * Controllo che restituisce la lista di feedback di una certa locazione
	 * 
	 * @param locazioneId
	 *            id della locazione su cui cercare i feedback
	 * @return la lista dei Feedback, null in caso non sono presenti
	 *//*
	public List<Feedback> dammiFeedback(int locazioneId) {
		try {
			if (locazioneId == 0)
				return null;
			return Feedback.dammiFeedback(locazioneId);

		} catch (DatabaseException e) {
			return null;

		}
	}*/
