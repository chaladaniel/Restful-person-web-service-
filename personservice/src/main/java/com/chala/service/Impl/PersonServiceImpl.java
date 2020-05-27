package com.chala.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chala.exception.ResourceNotFoundException;
import com.chala.model.Person;
import com.chala.repository.PersonRepository;
import com.chala.service.PersonService;

@Service 
@Transactional
public class PersonServiceImpl implements PersonService  { /*, AccountService {*/
		
	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Person findPersonOne(Long dateOfBirth) {
		return personRepository.findById(dateOfBirth).orElseThrow(() -> new ResourceNotFoundException("Person not found"));
	}

	@Override
	public List<Person> findPersonAll() {
		return (List<Person>)personRepository.findAll();
	}

	@Override
	public Person savePerson(Person account) {
		return personRepository.save(account);
	}

	@Override
	public void deletePersonOne(Long dateOfBirth) {
		personRepository.deleteById(dateOfBirth);
		
	}
	
}
