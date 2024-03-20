package com.hospital;



import java.util.List;
import java.util.Scanner;

import com.hospital.entity.Patient;

import static com.hospital.AllOperation.*;

public class MainOperation {
	
static Scanner sc=new Scanner(System.in);

public static void mainOps()
{
	while(true) {
	System.out.println("Press 1.Patient Details\nPress 2.Doctor Deatils"
			+ "\nPress 3.to appointment\n"+ "Press 4 for quit");
	int input=sc.nextInt();

	switch(input)
	{
		case 1:
			PatientOperations();
			System.out.println("=======================================");
	          break;

		case 2:System.exit(0);
		
		default:
				System.out.println("wrong input");
	}
	}

}

public static void main(String[] args)
{
	
	mainOps();

}
}
