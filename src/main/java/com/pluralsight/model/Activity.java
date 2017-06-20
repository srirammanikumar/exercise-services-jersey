package com.pluralsight.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity {

	private String Id;
	private int duration;
	private String description;
	private User user;
	
	@XmlElement(name = "desc")
	public String getDescription() {
		return description;
	}

	public int getDuration() {
		return duration;
	}

	public String getId() {
		return Id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setId(String id) {
		Id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
