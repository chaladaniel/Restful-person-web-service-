package com.chala.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.chala.model.Person;

@Validated
public interface PersonService {
	
    Person findPersonOne(Long personId);
	
	List<Person> findPersonAll();
	
	Person savePerson(Person person);
	
	void deletePersonOne(Long personId);

	
}
