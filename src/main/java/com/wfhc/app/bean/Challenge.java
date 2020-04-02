package com.wfhc.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wfhc_table")
public class Challenge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "u_name")
	private String name;
	
	@Column(name = "challenge")
	private String challenge;
	
	@Column(name = "unique_code")
	private String uri;
	
	public Challenge() {
		super();
	}

	public Challenge(int id, String name, String challenge, String uri) {
		super();
		this.id = id;
		this.name = name;
		this.challenge = challenge;
		this.uri = uri;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}