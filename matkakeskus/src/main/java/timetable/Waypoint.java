package timetable;

import java.time.LocalDateTime;

public class Waypoint {
private Stop fromStop;
private Stop toStop;
private LocalDateTime travelTime;
	
	
	public Waypoint(Stop fromStop, Stop toStop, LocalDateTime travelTime) {
		super();
		this.fromStop = fromStop;
		this.toStop = toStop;
		this.travelTime = travelTime;
	}

	public Stop getFromStop() {
		return fromStop;
	}
	
	public void setFromStop(Stop fromStop) {
		this.fromStop = fromStop;
	}
	
	public Stop getToStop() {
		return toStop;
	}
	
	public void setToStop(Stop toStop) {
		this.toStop = toStop;
	}
	
	public LocalDateTime getTravelTime() {
		return travelTime;
	}
	
	public void setTravelTime(LocalDateTime travelTime) {
		this.travelTime = travelTime;
	}
	
	public void setWaitingTime(Stop stop, LocalDateTime time) {
		
	}
	
	
}
