package com.cg.placementmanagement;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.placementmanagement.entities.College;
import com.cg.placementmanagement.service.CollegeService;
import com.cg.placementmanagement.service.CollegeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		//Doing object creation for CRUD operations
		CollegeService cs=new CollegeServiceImpl();

		
		//Creating or adding college data to college database
		College college=new College(103, "Technoserve", "C2TC", "Online");
		cs.addCollege(college);
		
		//Retrieving the data
		int id1;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Please enter college identity code to print that college details: ");
		id1=sc.nextInt();
		System.out.println();
		List<College> li= cs.searchCollege(id1);
		for(College c : li)
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e+ "\n Please enter correct data to Add..!");
		}

		//Retrieve all data Operation
		System.out.println("\n" + "Printing All Data From Books " + "\n");
		List<College> li4=cs.getAllData();
		Iterator<College> it=li4.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		//Update college data operation
		int id2;
		try {
		System.out.print("\n" + "Please enter college identity code to update that college Location: ");
		id2=sc.nextInt();
		System.out.println();
		College c1=cs.updateCollege(id2,college);
		System.out.println(c1);
		}
		catch (Exception e) {
			System.out.println(e+ "\n Please enter correct Update data..!");
		}
		
		//Delete id Operation
		try {
		System.out.print("\n" + "Please enter college identity code to Delete that data: ");
		int id3=sc.nextInt();
		System.out.println();
		System.out.print(cs.deleteCollege(id3, college) + "\n" + "\n"+ "deleted successfully");
		}
		catch(Exception e) {
			System.out.println(e+ "Invalid input: Please enter valid data to delete that entire row..!");
		}
		sc.close();
			
	}

}
