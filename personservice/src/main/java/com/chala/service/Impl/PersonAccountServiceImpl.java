package com.chala.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chala.feign.MyFeign;
import com.chala.model.Account;
import com.chala.model.Person;
import com.chala.model.PersonAccount;
import com.chala.service.PersonAccountService;
import com.chala.service.PersonService;

@Service
public class PersonAccountServiceImpl implements PersonAccountService {

	@Autowired
	MyFeign myFeign;
	
	@Autowired
	PersonService personService;
	
	@Override
	public PersonAccount findPersonWithAccount(Long id) {
		PersonAccount response = new PersonAccount();
		
		Person person = personService.findPersonOne(id);  
		response.setPersonId(person.getPersonId());
		response.setFirstName(person.getFirstName());
		response.setLastName(person.getLastName());
		response.setSocialSecurityNumber(person.getSocialSecurityNumber());
		response.setAddress(person.getAddress());
		response.setDateOfBirth(person.getDateOfBirth());
		
		List<Account> accounts = myFeign.findAccountByHolderId(id);
		response.setAccounts(accounts);
		
		return response;
	}
}