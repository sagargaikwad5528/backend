package com.flightapp.airline.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airline2")
public class Airline
{
	@Id
	private String airlineCode;
	private String airlineLocation;
	private String airlineName;
	private String source;
	private String destination;
	private String startDate;
	private String endDate;
	private int businessClassSeats;
	private int nonbusinessClassSeats;
	private double ticketCost;
	private int noOFRows;
	private String meal;
	
	
	public Airline() {
		
	}
	
	public Airline(String airlineCode, String airlineLocation, String airlineName, String source, String destination,
			String startDate, String endDate, int businessClassSeats, int nonbusinessClassSeats, double ticketCost,
			int noOFRows, String meal) {
		super();
		this.airlineCode = airlineCode;
		this.airlineLocation = airlineLocation;
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.startDate = startDate;
		this.endDate = endDate;
		this.businessClassSeats = businessClassSeats;
		this.nonbusinessClassSeats = nonbusinessClassSeats;
		this.ticketCost = ticketCost;
		this.noOFRows = noOFRows;
		this.meal = meal;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getAirlineLocation() {
		return airlineLocation;
	}

	public void setAirlineLocation(String airlineLocation) {
		this.airlineLocation = airlineLocation;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getBusinessClassSeats() {
		return businessClassSeats;
	}

	public void setBusinessClassSeats(int businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}

	public int getNonbusinessClassSeats() {
		return nonbusinessClassSeats;
	}

	public void setNonbusinessClassSeats(int nonbusinessClassSeats) {
		this.nonbusinessClassSeats = nonbusinessClassSeats;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getNoOFRows() {
		return noOFRows;
	}

	public void setNoOFRows(int noOFRows) {
		this.noOFRows = noOFRows;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	@Override
	public String toString() {
		return "Airline [airlineCode=" + airlineCode + ", airlineLocation=" + airlineLocation + ", airlineName="
				+ airlineName + ", source=" + source + ", destination=" + destination + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", businessClassSeats=" + businessClassSeats + ", nonbusinessClassSeats="
				+ nonbusinessClassSeats + ", ticketCost=" + ticketCost + ", noOFRows=" + noOFRows + ", meal=" + meal
				+ "]";
	}
	
	
	
	
	
}
