package com.appointment.person;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name = "persontable")
public class Person {
	@Id 
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@Column (name = "pid")
//	private Integer pId;
	@Column(name = "pemail")
	private String pEmail;
	@Column(name = "ppassword")
	private String pPassword;
	
	
	public Person() {
		super();
	}

	public Person(/*Integer pId,*/ String pEmail, String pPassword) {
		super();
//		this.pId = pId;
		this.pEmail = pEmail;
		this.pPassword = pPassword;
	}
	
//	public Integer getpId() {
//		return pId;
//	}
//	public void setpId(Integer pId) {
//		this.pId = pId;
//	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpPassword() {
		return pPassword;
	}
	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}

//	@Override
//	public String toString() {
//		return "Person [pId=" + pId + ", pEmail=" + pEmail + ", pPassword=" + pPassword + "]";
//	}	
	
	
	
}
