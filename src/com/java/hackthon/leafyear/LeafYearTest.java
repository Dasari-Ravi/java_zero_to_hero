package com.java.hackthon.leafyear;

import java.util.Scanner;

public class LeafYearTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// input takes
		System.out.println("please enter a year");
		int year = scanner.nextInt();
		System.out.println("year " + year);
		isleapyear(year);

//		char myname='A';///ctrl+/
//		switch(myname) {
//		case 'c':
//			System.out.println("letter is A");
//			break;	
//		case 'B':
//			System.out.println("letter is B");
//			break;
//			default:
//				System.out.println("no letter range");
//					
//				break;
		scanner.close();
//			}

	}

	public static int isleapyear(int year) {
		if (year >= 1 && year < 9999) {
			int result = year % 4;
			System.out.println("result " + result);

			if (result == 0) {
				System.out.println("is a leap year");
			} else {
				System.out.println("not a leap year");
			}

		} else {
			System.err.println(" you have entered invalid year number");
		}
		return 0;

	}
}
