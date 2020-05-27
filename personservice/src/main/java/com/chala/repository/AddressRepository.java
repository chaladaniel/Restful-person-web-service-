package com.chala.repository;

import org.springframework.data.repository.CrudRepository;

import com.chala.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
