package br.com.marcosoft.improveyourself.model;

import java.util.Date;

public class Event {
	public enum EventType {
		ASSIGNED, TEMPTATION, FAIL
	}

	private final EventType type;
	private final Date date;

	public Event(EventType type) {
		this.type = type;
		this.date = new Date();
	}

	public Date getDate() {
		return date;
	}

	public EventType getType() {
		return type;
	}

}
