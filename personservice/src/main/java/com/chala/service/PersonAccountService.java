package com.chala.service;

import org.springframework.validation.annotation.Validated;

import com.chala.model.PersonAccount;

@Validated
public interface PersonAccountService {
	 PersonAccount findPersonWithAccount(Long id);
}
