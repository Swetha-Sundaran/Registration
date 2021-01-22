package com.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Registration.model.Admin;
import com.Registration.model.Donor;
import com.Registration.model.Requestor;
import com.Registration.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@PostMapping(value = "/createrequestor")
    public ResponseEntity<Requestor> createRequestor(@RequestBody Requestor requestor) {
        return new ResponseEntity<Requestor>(service.createRequestor(requestor), HttpStatus.OK);
    }
	@PostMapping(value = "/createdonor")
    public ResponseEntity<Donor> createDonor(@RequestBody Donor donor) {
        return new ResponseEntity<Donor>(service.createDonor(donor), HttpStatus.OK);
        
    }@PostMapping(value = "/createadmin")
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
        return new ResponseEntity<Admin>(service.createAdmin(admin), HttpStatus.OK);
    }
	

}
