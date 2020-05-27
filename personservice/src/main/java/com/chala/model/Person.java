package com.chala.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Person {
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personId;    
	private String dateOfBirth;
	private String firstName;    
	private String lastName;     
	private int socialSecurityNumber;
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Address> address;
	
	public Person() {	
	}
	/*
	 * public static void main(String[] args) { Person pr = new Person();
	 * System.out.println(pr.getAddress()); System.out.println(pr.getDateOfBirth());
	 * System.out.println(pr.getFirstName()); System.out.println(pr.getLastName());
	 * System.out.println(pr.getSocialSecurityNumber()); }
	 */
	
	/*
	 * public Person(Long personId1, String dateOfBirth, String firstName, String
	 * lastName, int socialSecurityNumber, List<Address> address) { super();
	 * this.personId = personId1; this.dateOfBirth = dateOfBirth; this.firstName =
	 * firstName; this.lastName = lastName; this.socialSecurityNumber =
	 * socialSecurityNumber; this.address = address; }
	 */

	public Person(Long personId, String dateOfBirth, String firstName, String lastName, int socialSecurityNumber, List<Address> address) {
		super();
		this.personId = personId;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address=address;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", socialSecurityNumber=" + socialSecurityNumber + ", address=" + address
				+ "]";
	}

}
