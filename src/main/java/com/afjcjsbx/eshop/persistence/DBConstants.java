package com.afjcjsbx.eshop.persistence;

/**
 * Created by Davide on 13/02/2017.
 */
public final class DBConstants { // TODO adattare le costanti al nostro problema e rinominare in inglese
	/**
	 * Host locale su cui e' in esecuzione il server MySql.
	 */
	static public final String DB_SERVER_LOCALE = "localhost";
	/**
	 * Host remoto su cui e' in esecuzione il server MySql.
	 */
	static public final String DB_SERVER_REMOTO = "localhost:3307";
	/**
	 * Nome del database MySql utilizzato dall'applicazione.
	 */
	static public final String NOME_DB = "invenioDB";
	/**
	 * Nome utente per accesso al server MySql.
	 */
	// static public final String UTENTE_DB = "Qualsiasi";
	static public final String UTENTE_DB = "root";
	/**
	 * Password per accesso al server MySql.
	 */
	// static public final String PASSWORD_DB = null;
	static public final String PASSWORD_DB = "password";

	static public final String TABELLA_UTENTI = "Utenti";
	static public final String TABELLA_SERVIZI = "Servizi";
	static public final String TABELLA_ANNUNCI = "Annunci";
	static public final String TABELLA_NOTIFICHE = "Notifiche";
	static public final String TABELLA_SCADENZE = "Scadenze";
	static public final String TABELLA_BED_AND_BREAKFAST = "BedAndBreakfast";
	static public final String TABELLA_CASE_VACANZE = "CaseVacanze";
	static public final String TABELLA_PRENOTAZIONI = "Prenotazioni";
	static public final String TABELLA_LOCAZIONI = "Locazioni";
	static public final String TABELLA_IMMAGINI = "Immagini";
	static public final String TABELLA_CONVERSAZIONI = "Conversazione";
	static public final String TABELLA_MESSAGGIO = "Messaggio";
	static public final String TABELLA_FEEDBACK = "Feedback";

}
