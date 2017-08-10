package com.realdolmen.candyshop.domain;

import javax.persistence.*;
import java.util.Date;

// TODO: Make person a JPA entity
@Entity
public class Person {
    // TODO: add property 'id' (Long) which will be the auto-generated primary key
	@Id
	@GeneratedValue
	private Integer id;
	
	private String firstName;
	private String lastName;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

    // TODO: add properties 'firstName' and 'lastName' (String)
}
