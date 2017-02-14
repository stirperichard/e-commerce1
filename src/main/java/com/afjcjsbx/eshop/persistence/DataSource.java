package com.afjcjsbx.eshop.persistence;

import com.afjcjsbx.eshop.exceptions.DatabaseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Davide on 13/02/2017.
 */
public final class DataSource {
	/**
	 * Riferimento all'unica istanza della connessione.
	 */
	static private Connection connection = null;

	/**
	 * Instaura una nuova connessione con il database 
	 * 
	 * @throws SQLException in caso di problemi con la connessione al DB.
	 */
	static private void connetti() throws SQLException {
		try {
			/*
			 * Carica driver per connessione a DB
			 */
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://" + DBConstants.DB_SERVER_LOCALE + "/",
					DBConstants.UTENTE_DB, DBConstants.PASSWORD_DB);

			Statement stmt = connection.createStatement();

			/*
			 * Crea DB se non esiste
			 */
			String sql = "CREATE DATABASE IF NOT EXISTS " + DBConstants.NOME_DB;
			stmt.executeUpdate(sql);
			connection.setCatalog(DBConstants.NOME_DB);

		} catch (ClassNotFoundException e) {
			System.out.println("Necessario driver per connessione a database MySql!");
			throw new SQLException();
		}
	}

	/**
	 * Restituisce un reference alla connessione attivata con il DB. Se la
	 * connessione non e' stata ancora stabilita, viene instaurata.
	 * 
	 * @return Riferimento alla connessione con DB.
	 * @throws DatabaseException
	 *             Nel caso non sia possibile connettersi al DB.
	 */
	static public Connection getConnection() throws DatabaseException {

		if (connection == null) {
			try {
				connetti();
			} catch (SQLException e) {
				throw new DatabaseException("Impossibile stabilire una connessione con il database: " + e.getMessage());
			}
		}

		return connection;
	}

}