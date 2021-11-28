package com.flightapp.flight.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Flighttbl")
public class Flight {

	@Id
	private String flightNo;
	private String airlineName;
	private int seatCapacity;
	private String  date;
	private String source;
	private String destination;
	private String trip;
	private double price;
	
	public Flight() {
		
	}

	public Flight(String flightNo, String airlineName, int seatCapacity, String date, String source,
			String destination, String trip, double price) {
		super();
		this.flightNo = flightNo;
		this.airlineName = airlineName;
		this.seatCapacity = seatCapacity;
		this.date = date;
		this.source = source;
		this.destination = destination;
		this.trip = trip;
		this.price = price;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public String setFlightNo(String flightNo) {
		return this.flightNo = flightNo;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airlineName=" + airlineName + ", seatCapacity=" + seatCapacity
				+ ", date=" + date + ", source=" + source + ", destination=" + destination + ", trip=" + trip
				+ ", price=" + price + "]";
	}
	
	
}
