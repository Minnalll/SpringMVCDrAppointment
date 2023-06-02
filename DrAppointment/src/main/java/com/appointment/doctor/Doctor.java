package com.appointment.doctor;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Component
	@Entity
	@Table(name="doctor")
	public class Doctor {
		@Id
		@Column(name = "demail")
		private String dEmail;
		@Column(name = "dname")
		private String dName;
		@Column(name = "dspecialization")
		private String dSpecialization;
		@Column(name = "ddegree")
		private String dDegree;
		@Column(name = "dstate")
		private String dState;
		@Column(name = "dcity")
		private String dCity;
		@Column(name = "dpassword")
		private String dPassword;
		
		public Doctor() {
			super();
		}

		public Doctor(String dEmail, String dName, String dSpecialization, String dDegree, String dState, String dCity,
				String dPassword) {
			super();
			this.dEmail = dEmail;
			this.dName = dName;
			this.dSpecialization = dSpecialization;
			this.dDegree = dDegree;
			this.dState = dState;
			this.dCity = dCity;
			this.dPassword = dPassword;
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

		public String getdDegree() {
			return dDegree;
		}

		public void setdDegree(String dDegree) {
			this.dDegree = dDegree;
		}

		public String getdState() {
			return dState;
		}

		public void setdState(String dState) {
			this.dState = dState;
		}

		public String getdCity() {
			return dCity;
		}

		public void setdCity(String dCity) {
			this.dCity = dCity;
		}

		public String getdPassword() {
			return dPassword;
		}

		public void setdPassword(String dPassword) {
			this.dPassword = dPassword;
		}

		@Override
		public String toString() {
			return "Doctor [dEmail=" + dEmail + ", dName=" + dName + ", dSpecialization=" + dSpecialization
					+ ", dDegree=" + dDegree + ", dState=" + dState + ", dCity=" + dCity + ", dPassword=" + dPassword
					+ "]";
		}

}
