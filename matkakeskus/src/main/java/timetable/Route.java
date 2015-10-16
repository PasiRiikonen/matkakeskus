package timetable;

import java.util.*;
import java.time.LocalDateTime;

public class Route {
 private ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>();
 private LocalDateTime departureTime;
 private Bus bus;
	 
	public ArrayList<Waypoint> getWaypoints() {
		return waypoints;
	}
	public void setWaypoints(ArrayList<Waypoint> waypoints) {
		this.waypoints = waypoints;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	public void printTimetable() {
		
	}
	
/*	
	public LocalDateTime getWaitingTime(Stop stop) {
		//return ;
	}
	
	public LocalDateTime getDepartureTime(Stop depStop) {
		
	}
	
	public LocalDateTime getArrivalTime(Stop arrStop) {
		
	}
	*/
 
}
