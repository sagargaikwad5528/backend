package com.flightapp.flight.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.flight.exception.RecordAlreadyPresentException;
import com.flightapp.flight.exception.RecordNotFoundException;
import com.flightapp.flight.models.Flight;
import com.flightapp.flight.security.services.FlightService;



@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightController {
	
	
	@Autowired(required = true)
	FlightService flightService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/addFlight")
	//@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}

	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@GetMapping("/allFlight")
	public Iterable<Flight> viewAllFlight() {
		return flightService.viewAllFlight();
	}
	
	
	
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@GetMapping("/viewFlight/{id}")
	//@ExceptionHandler(RecordNotFoundException.class)
	public Flight viewFlight(@PathVariable("id") String flightNo) {
		return flightService.viewFlight(flightNo);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/updateFlight")
	//@ExceptionHandler(RecordNotFoundException.class)
	public void modifyFlight(@RequestBody Flight flight) {
		flightService.modifyFlight(flight);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/deleteFlight/{id}")
	//@ExceptionHandler(RecordNotFoundException.class)
	public void removeFlight(@PathVariable("id") String flightNo) {
		flightService.removeFlight(flightNo);
	}
}
