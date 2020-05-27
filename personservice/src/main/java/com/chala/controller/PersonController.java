package com.chala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chala.model.Person;
import com.chala.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@PostMapping()
	public Person postPerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@GetMapping()
	public List<Person> getPerson() {
		return personService.findPersonAll();
	}
	
	@GetMapping("/{id}")
	public Person getPersonById(@PathVariable("id")Long person) {
		return personService.findPersonOne(person);
	}
	
	@PutMapping("/{id}")
	public Person putPerson(@RequestBody Person person, @PathVariable("id") Long id) {
		return personService.savePerson(person);
	}
	
	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable("id") Long personId) {
		personService.deletePersonOne(personId);
	}
}
