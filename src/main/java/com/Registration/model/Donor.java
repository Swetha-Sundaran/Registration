package com.Registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Donor")
public class Donor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Patient_id;
	@Column(name = "Donar_Name")
	private String donorName;

	@Column(name = "BloodGroup")
	private String bloodGroup;
	@Column(name = "City")
	private String city;
	@Column(name = "Time")
	private String time;
	@Column(name = "Blood_Glucose_Level")
	private String bloodGlucoseLevel;
	@Column(name = "Donor_Status")
	private String approveDonor;
	@Column(name = "userName", length = 20)
	private String userName;
	@Column(name = "password", length = 20)
	private String password;
}
