package com.flightapp.airline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.airline.models.Airline;


@Repository
public interface AirlineRepository extends CrudRepository<Airline, String> {

}
