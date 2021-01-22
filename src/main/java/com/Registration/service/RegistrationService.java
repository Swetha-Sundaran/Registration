package com.Registration.service;

import com.Registration.model.Admin;
import com.Registration.model.Donor;
import com.Registration.model.Requestor;

public interface RegistrationService {
	public Admin createAdmin(Admin admin);
	public Requestor createRequestor(Requestor requestor);
	public Donor createDonor(Donor donor);

}
