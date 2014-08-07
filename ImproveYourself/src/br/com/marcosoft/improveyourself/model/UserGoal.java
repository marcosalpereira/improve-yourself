package br.com.marcosoft.improveyourself.model;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.marcosoft.improveyourself.model.Event.EventType;

public class UserGoal {
	private final User user;
	private final Goal goal;
	private final Set<Event> events;

	public UserGoal(User user, Goal goal) {
		this.user = user;
		this.goal = goal;
		events = new LinkedHashSet<Event>();
	}

	public void addEvent(EventType type) {
		events.add(new Event(type));
	}
	
	public User getUser() {
		return user;
	}
	
	public Goal getGoal() {
		return goal;
	}

	public String getDescription() {
		return goal.getDescription();
	}
	
	public String getStatus() {
		return "TODO";
	}
}
