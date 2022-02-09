package com.java.hackthon.maxmin;

import java.util.Scanner;

public class Maxmin {
	public static void main(String[] args) {
		Scanner maxmin = new Scanner(System.in);

		int max = 0;
		int min = 0;
		while (true) {
			System.out.println("enter the number:");
			boolean ishasint = maxmin.hasNextInt();

			if (ishasint) {
				int Number = maxmin.nextInt();

				if (Number > max) {
					max = Number;
				}
				if (Number < min) {
					min = Number;

				}

			} else {
				break;
			}
			maxmin.nextLine();

		}
		System.out.println("min= " + min + ", max " + max);

		maxmin.close();
	}

}
