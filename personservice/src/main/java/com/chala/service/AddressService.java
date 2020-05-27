package com.chala.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.chala.model.Address;

@Validated
public interface AddressService {
	
	public Address saveAddress(Address addressId);
	
	public Address findAddress(Long addressId);
	
	List<Address> findAllAddress();
	
	void deleteAddress(Long addressId);
}
