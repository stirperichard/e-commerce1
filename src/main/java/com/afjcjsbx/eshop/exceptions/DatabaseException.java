package com.afjcjsbx.eshop.exceptions;

import java.sql.SQLException;

/**
 * Eccezione per problemi relativi alla connessione con il database.
 */
public class DatabaseException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg)
	{
		super(msg);
	}
	
	public DatabaseException(String msg, SQLException sqlEx)
	{
		super(msg + " [" + sqlEx.getMessage() + "]");
	}

}
