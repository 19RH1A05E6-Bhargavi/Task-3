package com.Transport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Tranport")
@Entity

public class Transport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "SOurce")
	private String source;

	@Column(name = "Destination")
	private String destination;
	
	@Column(name = "passenger")
	private String passenger;

	public Transport() {
		
	}

	public Transport(int id, String name, String source, String destination, String passenger) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.passenger = passenger;
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

	public String getSource() {
		return source;
	}

	public void setAadhar(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setMobile_num(String destination) {
		this.destination = destination;
	}

	public String getPassenger() {
		return passenger;
	}

	public void setCrime(String passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Criminal [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", passenger=" + passenger + "]";
	}
	
	
}