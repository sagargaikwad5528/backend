package com.flightapp.airline.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightapp.airline.exception.RecordAlreadyPresentException;
import com.flightapp.airline.exception.RecordNotFoundException;
import com.flightapp.airline.models.Airline;
import com.flightapp.airline.repository.AirlineRepository;

@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	AirlineRepository airlineDao;

	/*
	 * view all Airlines
	 */
	@Override
	public Iterable<Airline> viewAllAirline() {
		return airlineDao.findAll();
	}

	/*
	 * view airline by airlineCode
	 */
	@Override
	@Cacheable(key="#id", value="airlineCode")
	public Airline viewAirline(String airlineCode) {
		Optional<Airline> findById = airlineDao.findById(airlineCode);
		if (findById.isPresent()) {
			return findById.get();
		}
			
			//return new ResponseEntity<Airline>(airline, HttpStatus.OK)}
		else
			throw new RecordNotFoundException("Airline with airline code: " + airlineCode + "not exists");
	    }
		/*catch(RecordNotFoundException e)
		{
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
        }*/

	/*
	 * add a airline
	 */
	@Override
	public ResponseEntity<?> addAirline(Airline airline) {
		Optional<Airline> findById = airlineDao.findById(airline.getAirlineCode());
		try {
		if (!findById.isPresent()) {
			airlineDao.save(airline);
			return new ResponseEntity<Airline>(airline,HttpStatus.OK);
		} 
		else
			throw new RecordAlreadyPresentException(
					"Airline with code : " + airline.getAirlineCode() + " already present");
	     }
		catch(RecordAlreadyPresentException e)
		{
			return new ResponseEntity<Airline>(airline,HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * modify an Airline
	 */
	@Override
	public Airline modifyAirline(Airline airline) {
		
		Optional<Airline> findById = airlineDao.findById(airline.getAirlineCode());
		if (findById.isPresent()) {
			airlineDao.save(airline);
		} 
		else
			throw new RecordNotFoundException("Airline with code: " + airline.getAirlineCode() + " not exists");
		return airline;
	}

	/*
	 * remove an airline
	 */
	@Override
	public String removeAirline(String airlineCode) {
		Optional<Airline> findById = airlineDao.findById(airlineCode);
		if (findById.isPresent()) {
			airlineDao.deleteById(airlineCode);
			return "Airline removed";
		} else
			throw new RecordNotFoundException("Airline with code: " + airlineCode + " not exists");

	}
}
