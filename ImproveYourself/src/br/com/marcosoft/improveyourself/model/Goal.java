package br.com.marcosoft.improveyourself.model;

import java.util.Date;
import java.util.UUID;

public class Goal {
	private final String id;
	private final String description;
	private final Date creation;
	private final User creator;

	public Goal(String description, User creator) {
		this.description = description;
		this.creator = creator;
		creation = new Date();
		id = UUID.randomUUID().toString();
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public Date getCreation() {
		return creation;
	}

	public User getCreator() {
		return creator;
	}

}
