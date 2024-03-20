package com.hospital;

import static com.hospital.AllOperation.PatientInputs;

import com.hospital.service.PatientService;
import com.hospital.service.DoctorService;
import com.hospital.service.AppointmentService;
import com.hospital.serviceImpl.PatientServiceImpl;
//import com.student.entity.Student;
import com.hospital.entity.Patient;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static com.hospital.MainOperation.*;

import com.hospital.entity.Patient;
import com.hospital.entity.Doctor;
import com.hospital.entity.Appointment;

import com.hospital.exception.ResourceNotFoundException;


public class AllOperation {
	

static PatientService patientService=new PatientServiceImpl();
//static DoctorService doctorService=new DoctorServiceImpl();
//static CourseService courseService=new CourseServiceImple();
//static InstructorService instructorService=new InstructorServiceImpl();

static Scanner sc=new Scanner(System.in);


public static Patient PatientInputs() 
{
	sc.nextLine();
	System.out.println("Enter Patients id");
	int patient_id=sc.nextInt();
	
	System.out.println("Enter Name");
	String name=sc.next();

	System.out.println("Enter Address");
	String address=sc.next();
	
	System.out.println("Enter Phone number");
	String phone_no=sc.next();
	
;
	
	return new Patient(patient_id, name, address, phone_no);
}
	public static Void PatientOperations()
	{
		while(true) {
			System.out.println("Press 1.Add Patient Details\nPress 2.Retrieve All Patient Data\n"
					+ "Press 3.Update Patient Data\nPress 4.Delete Patient Data\n"
					+ "Press 5.To getback to the main menu");
			int input=sc.nextInt();	
			
			switch(input) {
			case 1:
				Patient patient=PatientInputs();
				Patient savedEntity=patientService.createPatient(patient);
				System.out.println("Patient Data has been saved successfully"+ savedEntity);
				break;
			
			case 2:
				List<Patient> Patient=patientService.getAllPatient();
				for(Patient pat:Patient)
				{
					System.out.println("Course ID: " + pat.getPatient_id());
	                System.out.println("Course Name: " + pat.getName());
	                System.out.println("Course Description: " + pat.getAddress());
	                System.out.println("Course Description: " + pat.getAddress());
					//System.out.println(pat);
				}
				break;
				
			case 3:sc.nextLine();
			System.out.println("Enter Patient Id to update the infromation");
		       int pId=sc.nextInt();
		       Patient s=patientService.getPatient(pId);
	           if(s!=null) {
		       Patient std=updatedPatientData();
		     //service
		       Patient updatedInfo=patientService.updatePatient(pId, std);
		       System.out.println("Patient Data has been updated Successfully"+ updatedInfo);
		       }
		       
		       else
		       {
		    	   throw new ResourceNotFoundException("Patient Id not found");
		       }
		       
			break;
			
			case 4:
				System.out.println("Enter Patient Id to delete the infromation");
			       int id=sc.nextInt();
			       int message=patientService.deletePatient(id);
			       System.out.println(message);
				break;
			case 5:mainOps();
			}
			
		}
		}
	private static Patient updatedPatientData() {
		// TODO Auto-generated method stub
		sc.nextLine();
		sc.nextInt();
		System.out.println("Enter patient id");
		int patient_id=sc.nextInt();
		
		System.out.println("Enter First Name");
		String name=sc.nextLine();

		System.out.println("Enter Last Name");
		String address=sc.nextLine();
		
		System.out.println("Enter Gender");
		String phone_no=sc.nextLine();
		
	
		return new Patient(patient_id,name, address, phone_no);
	}
		
		
}

