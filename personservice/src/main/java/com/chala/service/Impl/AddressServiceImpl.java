package com.chala.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chala.exception.ResourceNotFoundException;
import com.chala.model.Address;
import com.chala.repository.AddressRepository;
import com.chala.service.AddressService;

@Service  
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address addressId) {
		return addressRepository.save(addressId);
	}

	@Override
	public Address findAddress(Long addressId) {
		return addressRepository.findById(addressId).orElseThrow(() -> new ResourceNotFoundException("Address not found"));
	}

	@Override
	public List<Address> findAllAddress() {
		return (List<Address>)addressRepository.findAll();
	}

	@Override
	public void deleteAddress(Long addressId) {
		addressRepository.deleteById(addressId);
		
	}
}
