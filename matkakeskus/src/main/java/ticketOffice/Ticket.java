package ticketOffice;

import timetable.*;
import java.time.LocalDateTime;

public class Ticket {
private double price;
private Stop departureStop;
private Stop arrivalStop;
private Bus bus;
private LocalDateTime departureTime;
private LocalDateTime arrivalTime;
private String ticketType;

public void setDeparture(Stop stop, LocalDateTime depTime) {
	this.departureStop = stop;
	this.departureTime = depTime;
}

public void setArrival(Stop stop, LocalDateTime arrTime) {
	this.arrivalStop = stop;
	this.arrivalTime = arrTime;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Bus getBus() {
	return bus;
}

public void setBus(Bus bus) {
	this.bus = bus;
}

public String getTicketType() {
	return ticketType;
}

public void setTicketType(String ticketType) {
	this.ticketType = ticketType;
}

public Stop getDepartureStop() {
	return departureStop;
}

public void setDepartureStop(Stop departureStop) {
	this.departureStop = departureStop;
}

public Stop getArrivalStop() {
	return arrivalStop;
}

public void setArrivalStop(Stop arrivalStop) {
	this.arrivalStop = arrivalStop;
}

public LocalDateTime getDepartureTime() {
	return departureTime;
}

public void setDepartureTime(LocalDateTime departureTime) {
	this.departureTime = departureTime;
}

public LocalDateTime getArrivalTime() {
	return arrivalTime;
}

public void setArrivalTime(LocalDateTime arrivalTime) {
	this.arrivalTime = arrivalTime;
}

}
