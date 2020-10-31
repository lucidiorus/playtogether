package com.lucidiovacas.playtogether;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(name = "email_address")
	private String emailAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + "]";
	}
	
}
