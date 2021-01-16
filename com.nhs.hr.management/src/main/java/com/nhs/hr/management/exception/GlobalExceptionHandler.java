package com.nhs.hr.management.exception;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Exception handler class to all the global and specific exceptions in the NHS
 * HR management application.
 * 
 * @author Anoop Abraham
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * Method to handle the specific Exception EntityNotFoundException.class
	 * 
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<?> handleGitHubAnalysisFailedException(EntityNotFoundException exception) {
		ExceptionDetails exceptionDetails = new ExceptionDetails(new Timestamp(System.currentTimeMillis()),
				HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage(), exception.getClass().getName());
		return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * Method to handle the Global Exception.class
	 * 
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception exception) {
		ExceptionDetails exceptionDetails = new ExceptionDetails(new Timestamp(System.currentTimeMillis()),
				HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage(), exception.getClass().getName());
		return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
