package com.userregistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Well Come In User Registration Program...");
		Scanner sc = new Scanner(System.in);
		
		
		List<String> Contacts = new ArrayList<>();
		
		System.out.println("Enter FirstName :");
		String firstName = sc.next();
		System.out.println("Enter LastName :");
		String lastName = sc.next();
		System.out.println("Enter Address :");
		String address = sc.next();
		System.out.println("Enter City :");
		String city = sc.next();
		System.out.println("Enter State :");
		String state = sc.next();
		System.out.println("Enter Zip :");
		String zip = sc.next();
		System.out.println("Enter Phone Number :");
		String phoneNumber = sc.next();
		System.out.println("Enter Email ID :");
		String email = sc.next();
		
		Contacts.add(firstName);
		Contacts.add(lastName);
		Contacts.add(address);
		Contacts.add(city);
		Contacts.add(state);
		Contacts.add(zip);
		Contacts.add(phoneNumber);
		Contacts.add(email);
		
		for(String s:Contacts)
		{
			System.out.println(s);
		}
}

}
