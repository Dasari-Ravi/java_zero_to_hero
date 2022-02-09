package com.java.hackthon.emi;

import java.util.Scanner;

public class EmI {
	private static int Accountnumber;
	private static String car;
	private static int salary;
	private static String typeoflaon;
	private static int account_balance;
	private static String business;
	private static String home;

	public static void main(String[] args) {

		Scanner details = new Scanner(System.in);
		Accountnumber = details.nextInt();
		boolean s1 = String.valueOf(Accountnumber).startsWith("1");
		if (s1 == false) {
			System.out.println("inavlid account number");
		}
		salary = details.nextInt();

		if (salary > 25000) {

			account_balance = details.nextInt();
			if (account_balance <= 1000) {
				System.out.println("insufficent balance in your account");
			} else {
				typeoflaon = details.next();
			}

			if (typeoflaon == car) {
				System.out.println("500000\n36");

			} else if (typeoflaon == business) {
				System.out.println("1000000\n60");

			} else if (typeoflaon == home) {
				System.out.println("1500000\n80");
			}

		}

		details.close();

	}
}
