package com.nhs.hr.management.exception;

/**
 * Exception to handle the failure of fetching the entity for the input
 * parameters, from database.
 * 
 * @author Anoop Abraham
 *
 */
public class EntityNotFoundException extends RuntimeException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * 
	 * @param message
	 */
	public EntityNotFoundException(String message) {
		super(message);
	}

}
