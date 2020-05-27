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

import com.chala.model.Address;
import com.chala.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping()
	public Address postAddress(@RequestBody Address addressId) {
		return addressService.saveAddress(addressId);
	}
	
	@GetMapping("/Fegn")
	public List<Address> getAddress() {
		return addressService.findAllAddress();
	}
	
	@GetMapping("/{id}")
	public Address getAddressById(@PathVariable("id") Long addressId) {
		return addressService.findAddress(addressId);
	}
	
	@PutMapping("{id}")
	public Address updateAddress(@RequestBody Address addressId, @PathVariable("id") Long id) {
		return addressService.saveAddress(addressId);
	}
	
	@DeleteMapping("/{id}") 
	public void deleteAddress(@PathVariable("id") Long addressId) {
		addressService.deleteAddress(addressId);
	}
	
	
/*	private static List<Address> addressesWithList = Arrays.asList(new Address());
	private static List<Address> addressesWithCollections = Collections.singletonList(new Address());
	*/
	
}
