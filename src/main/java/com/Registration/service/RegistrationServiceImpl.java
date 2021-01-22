package com.Registration.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import org.springframework.beans.factory.annotation.Autowired;
import com.Registration.model.Admin;
import com.Registration.model.Donor;
import com.Registration.model.Requestor;
//import com.Registration.repository.RegistrationRepository;
@Service("service")
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
    public Requestor createRequestor(Requestor requestor) 
    {
		URI uri = URI.create("http://localhost:9094/createrequestor");
        return this.restTemplate.postForEntity(uri, requestor, Requestor.class).getBody();
        
    }
	@Override
    public Admin createAdmin(Admin admin) {
		URI uri = URI.create("http://localhost:9092/createadmin");
        return this.restTemplate.postForEntity(uri, admin, Admin.class).getBody();
        
	}
	@Override
    public Donor createDonor(Donor donor) {
		URI uri = URI.create("http://localhost:9090/createdonor");
        return this.restTemplate.postForEntity(uri, donor, Donor.class).getBody();
        
	}
    
}
