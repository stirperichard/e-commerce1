package com.afjcjsbx.eshop.bean;

import com.afjcjsbx.eshop.controller.feedback.ManageFeedbackControl;
import com.afjcjsbx.eshop.entity.feedback.Review;
import com.afjcjsbx.eshop.entity.catalogue.Product;

import java.util.List;

/**
 * Created by Davide on 13/02/2017.
 */
public class FeedbackBean {
	/**
	 * La bean ha come attributi gli input dell'utente, inviatigli dallo strato view, in questo caso sarà una pagina JSP
	 */
	private String username; // TODO assumiamo ora di doverlo passare dalla view, possiamo fare in modo di saperlo già?
    //private String password;
    private int rating;
    private String comment;

	/*private String username;
	private String password;
	private String commento;
	private int idLocazione;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}

	public int getIdLocazione() {
		return idLocazione;
	}

	public void setIdLocazione(int idLocazione) {
		this.idLocazione = idLocazione;
	}*/

	/**
	 * Metodo per lasciare un feedback su di una locazione
	 * 
	 * @return true se il feedback � stato inserito correttamente, false
	 *         altrimenti
	 */
	public boolean commentaLocazione() {
		return ControllerFeedback.getInstance().commentaLocazione(this);
	}

	/**
	 * Ricerca di una locazione passandogli il suo nome
	 * 
	 * @param nomeLocazione
	 *            nome della locazione da ricercare
	 * @return ritorna la locazione con quel nome, null altrimenti
	 */
	public Locazione cercaLocazioneDaNome(String nomeLocazione) {
		return ControllerFeedback.getInstance().cercaLocazioneDaNome(nomeLocazione);
	}

	/**
	 * Metodo per cercare i feedback su una determinata locazione
	 * 
	 * @param locazioneId
	 *            id della locazione su cui effettuare la ricerca
	 * @return ritorna la lista dei feedback di una locazione, null altrimenti
	 */
	public List<Feedback> dammiFeedback(int locazioneId) {

		return ControllerFeedback.getInstance().dammiFeedback(locazioneId);
	}

	/**
	 * Controllo sull'autenticazione di un'utente
	 * 
	 * @return true se le credenziali sono corrette, false altrimenti
	 */
	public boolean verificaUtente() {

		return ControllerFeedback.getInstance().verificaUtente(this);
	}

}
