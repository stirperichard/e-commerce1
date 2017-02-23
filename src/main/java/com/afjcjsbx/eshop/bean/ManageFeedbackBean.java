package com.afjcjsbx.eshop.bean;

import com.afjcjsbx.eshop.controller.feedback.ManageFeedbackController;
import com.afjcjsbx.eshop.entity.feedback.Review;
import com.afjcjsbx.eshop.entity.catalogue.Product;

import java.util.List;

/**
 * Created by Davide on 13/02/2017.
 */
public class ManageFeedbackBean {
	/**
	 * La bean ha come attributi gli input dell'utente, inviatigli dallo strato view, in questo caso sarà una pagina JSP
	 */
    private int productName; // reviewed product
	private String username; // TODO assumiamo ora di doverlo passare dalla view, possiamo fare in modo di saperlo già? Sì, tramite session
    private String password;
    private int rating;
    private String comment;

	public int getProductId() {
		return productName;
	}

	public void setProductId(int productName) {
		this.productName = productName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean validate() {
        // Syntax check
		if (this.comment == null || (this.rating < 1 || this.rating > 5))
			return false;

        return true;
    }






	/*private String username;
	private String password;
	private String commento;
	private int idLocazione;

	setters e getters

	*//**
	 * Metodo per lasciare un feedback su di una locazione
	 * 
	 * @return true se il feedback � stato inserito correttamente, false
	 *         altrimenti
	 *//*
	public boolean commentaLocazione() {
		return ControllerFeedback.getInstance().commentaLocazione(this);
	}

	*//**
	 * Ricerca di una locazione passandogli il suo nome
	 * 
	 * @param nomeLocazione
	 *            nome della locazione da ricercare
	 * @return ritorna la locazione con quel nome, null altrimenti
	 *//*
	public Locazione cercaLocazioneDaNome(String nomeLocazione) {
		return ControllerFeedback.getInstance().cercaLocazioneDaNome(nomeLocazione);
	}

	*//**
	 * Metodo per cercare i feedback su una determinata locazione
	 * 
	 * @param locazioneId
	 *            id della locazione su cui effettuare la ricerca
	 * @return ritorna la lista dei feedback di una locazione, null altrimenti
	 *//*
	public List<Feedback> dammiFeedback(int locazioneId) {

		return ControllerFeedback.getInstance().dammiFeedback(locazioneId);
	}

	*//**
	 * Controllo sull'autenticazione di un'utente
	 * 
	 * @return true se le credenziali sono corrette, false altrimenti
	 *//*
	public boolean verificaUtente() {

		return ControllerFeedback.getInstance().verificaUtente(this);
	}*/

}
