package com.java.hackthon.division;

import java.util.Scanner;

public class DivisibleByNumber {

	private static int sum;
	private static int number;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean hasnextint = input.hasNextInt();
		if (hasnextint) {
			number = input.nextInt();
			// sum=0;
			int n = number;
			while (number > 0) {
				int output = number % 10;
				sum += output;
				number = number / 10;

			}

			if (sum % 3 == 0) {
				System.out.println(n + " is divisable by sum of its digits");
			} else {
				System.out.println(n + " not divisable by sum of its digits ");
			}

		}

		input.close();

	}

}
