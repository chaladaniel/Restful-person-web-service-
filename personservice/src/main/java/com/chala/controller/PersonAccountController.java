package com.chala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chala.model.PersonAccount;
import com.chala.service.PersonAccountService;

@RestController
public class PersonAccountController {
	
	@Autowired
	PersonAccountService personAccountService;
	
	@GetMapping("/person/account/{id}")
	public PersonAccount getPersonWithAccount(@PathVariable Long id) {
		return personAccountService.findPersonWithAccount(id);
	}

}
