package com.flightapp.flight.exception;

public class ScheduledFlightNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScheduledFlightNotFoundException(String str) {
		super(str);
	}

}