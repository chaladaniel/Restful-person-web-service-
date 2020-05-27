package com.chala.repository;

import org.springframework.data.repository.CrudRepository;

import com.chala.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> { 
	
	/*
	 * List<Person> findByFirstName(String firstName);
	 * 
	 * List<Person> findByAddressCity(String city);
	 */
	
}

