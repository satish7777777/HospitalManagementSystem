package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@Column(name="Appointment_id",length=50)
	int appointment_id;
	
	@Column(name="Patient_Id",length=50)
	int patient_id;
	
	@Column(name="Doctor_id",length=50)
	int doctor_id;
	
	@Column(name="Date",length=50)
	String date;
	public Appointment(int appointment_id, int patient_id, int doctor_id, String date) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.date = date;
	}
	
	public int getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
