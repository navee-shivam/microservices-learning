package com.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.model.Address;

@RestController
public class AddressController {

	@GetMapping("getAddress")
	public Address getAddress() {
		return Address.builder().id(1).address("Erode").build();
	}
	
}
