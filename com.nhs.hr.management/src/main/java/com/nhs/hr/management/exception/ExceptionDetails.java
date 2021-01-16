package com.nhs.hr.management.exception;

import java.sql.Timestamp;

/**
 * POJO class to store the Exception or Error details.
 * 
 * @author Anoop Abraham
 *
 */
public class ExceptionDetails {

	public Timestamp timeStamp;
	public int status;
	public String message;
	public String details;

	/**
	 * Constructor
	 * 
	 * @param timeStamp
	 * @param status
	 * @param message
	 * @param details
	 */

	public ExceptionDetails(Timestamp timeStamp, int status, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.message = message;
		this.details = details;
	}

	/**
	 * @return the timeStamp
	 */
	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

}
