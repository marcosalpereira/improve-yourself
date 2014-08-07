package br.com.marcosoft.improveyourself.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class User {
	private final String password;
	private final String name;
	private final Set<UserGoal> goals;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.goals = new LinkedHashSet<UserGoal>();
	}

	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void assigngGoal(Goal goal) {
		goals.add(new UserGoal(this, goal));
	}

}
