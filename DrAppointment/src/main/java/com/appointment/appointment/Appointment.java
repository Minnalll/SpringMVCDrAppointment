package com.appointment.appointment;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "appid")
	private String appId;
	@Column(name = "pemail")
	private String pEmail;
	@Column(name = "demail")
	private String dEmail;
	@Column(name = "dname")
	private String dName;
	@Column(name = "dspecialization")
	private String dSpecialization;
	@Column(name = "dappdate")
	private LocalDate dAppDate;
	@Column(name = "slot")
	private String slot;
	@Column(name = "status")
	private String status;
	
	public Appointment() {
		super();
	}

	public Appointment(String appId, String pEmail, String dEmail, String dName, String dSpecialization,
			LocalDate dAppDate, String slot, String status) {
		super();
		this.appId = appId;
		this.pEmail = pEmail;
		this.dEmail = dEmail;
		this.dName = dName;
		this.dSpecialization = dSpecialization;
		this.dAppDate = dAppDate;
		this.slot = slot;
		this.status = status;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdSpecialization() {
		return dSpecialization;
	}

	public void setdSpecialization(String dSpecialization) {
		this.dSpecialization = dSpecialization;
	}

	public LocalDate getdAppDate() {
		return dAppDate;
	}

	public void setdAppDate(LocalDate dAppDate) {
		this.dAppDate = dAppDate;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [appId=" + appId + ", pEmail=" + pEmail + ", dEmail=" + dEmail + ", dName=" + dName
				+ ", dSpecialization=" + dSpecialization + ", dAppDate=" + dAppDate + ", slot=" + slot + ", status="
				+ status + "]";
	}
	
}
