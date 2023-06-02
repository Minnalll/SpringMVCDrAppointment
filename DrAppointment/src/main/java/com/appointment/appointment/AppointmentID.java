package com.appointment.appointment;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentID extends Appointment{
	@Autowired
	private Appointment app;
	
	public String appID() {
		String getdEmail = app.getdEmail();
		LocalDate getdAppDate = app.getdAppDate();
		String slot = app.getSlot();
		return "getdEmail"+"getdAppDate"+"slot";		
	}
}
