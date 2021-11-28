package com.flightapp.airline.security.services;

import org.springframework.http.ResponseEntity;

import com.flightapp.airline.models.Airline;

public interface AirlineService {
	public Iterable<Airline> viewAllAirline();

	public Airline viewAirline(String airlineCode);

	public ResponseEntity<?> addAirline(Airline airline);

	public Airline modifyAirline(Airline airline);

	public String removeAirline(String airlineCode);
}
