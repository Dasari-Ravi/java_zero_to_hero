package com.java.core.inputoutput;

import java.util.Scanner;

public class UserEntry {
	public static void main(String[] args) {
		Scanner Details = new Scanner(System.in);

		System.out.println("enter your birth year");
		boolean hasnextint = Details.hasNextInt();
		if (hasnextint) {
			int birthyear = Details.nextInt();// integer
			System.out.println("date of birth: " + birthyear);
			System.out.println("enter your name");
			Details.nextLine();// for enter
			String name = Details.next();// string

			System.out.println("your name is:  " + name);
			System.out.println("enter the year of pass");
			int yearofpass = Details.nextInt();
			System.out.println("passed year: " + yearofpass);
			int age = 2021 - birthyear;
			if (age >= 0 && age <= 100) {
				System.out.println("age: " + age);
			} else {
				System.out.println("invalid year of birth");
			}

			// System.out.println("");

		}
		else {
			System.out.println("enter valid year of birth");
		}
		

		Details.close();
	}

}
