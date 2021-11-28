package com.flightapp.airline.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.airline.exception.RecordAlreadyPresentException;
import com.flightapp.airline.exception.RecordNotFoundException;
import com.flightapp.airline.models.Airline;
import com.flightapp.airline.security.services.AirlineService;

@RestController
@RequestMapping("/api/v1.0/flight/airline")
public class AirlineController {
	@Autowired(required = true)
	AirlineService airlineService;

	@GetMapping("/viewAirline/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Airline viewAirline(@PathVariable("id") String airlineCode) {
		return airlineService.viewAirline(airlineCode);
	}

	@GetMapping("/allAirline")
	public Iterable<Airline> viewAllAirline() {
		return airlineService.viewAllAirline();
	}

	@PostMapping("/addAirline")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addAirline(@RequestBody Airline airline) {
		airlineService.addAirline(airline);
	}

	@PutMapping("/updateAirline")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyAirline(@RequestBody Airline airline) {
		airlineService.modifyAirline(airline);
	}

	@DeleteMapping("/deleteAirline/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void removeAirline(@PathVariable("id") String airlineCode) {
		airlineService.removeAirline(airlineCode);
	}
}
