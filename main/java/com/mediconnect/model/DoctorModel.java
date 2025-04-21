package com.mediconnect.model;

public class DoctorModel {
	Integer doctor_id;
	String doctorFirstName;
	String doctorLastName;
	String doctorEmail;
	String doctorPhoneNumber;
	String doctorAddress;
	String doctorGender;
	String doctorSpecialization;
	String doctorExperience;
	
	
	
	public DoctorModel(Integer doctor_id, String doctorFirstName, String doctorLastName, String doctorEmail,
			String doctorPhoneNumber, String doctorAddress, String doctorGender, String doctorSpecialization,
			String doctorExperience) {
		this.doctor_id = doctor_id;
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.doctorEmail = doctorEmail;
		this.doctorPhoneNumber = doctorPhoneNumber;
		this.doctorAddress = doctorAddress;
		this.doctorGender = doctorGender;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorExperience = doctorExperience;
		
	}
	public Integer getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(Integer doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}
	public void setDoctorPhoneNumber(String doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}
	public String getDoctorAddress() {
		return doctorAddress;
	}
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public String getDoctorExperience() {
		return doctorExperience;
	}
	public void setDoctorExperience(String doctorExperience) {
		this.doctorExperience = doctorExperience;
	}
	
	
}
