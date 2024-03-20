package com.hospital.dao;

import java.util.List;

import com.hospital.entity.Doctor;

public interface DoctordDao {

	Doctor createDoctor(Doctor doctor);
	List<Doctor> getAllDoctor();
	Doctor getStudent(int Doctor_id);
	Doctor updateDoctor(int doctor_id);
	int deleteDoctor(int patient_id);

}
