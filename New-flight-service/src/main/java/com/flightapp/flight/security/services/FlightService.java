package com.flightapp.flight.security.services;


import org.springframework.http.ResponseEntity;

import com.flightapp.flight.models.Flight;



public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(String flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(String flightNumber);
	
	

}
