package com.java.hackthon.palandrom;

import java.util.Scanner;

public class PalandromNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;

		sum = 0;

		int temp = number;
		while (number >= 1) {
			sum = number % 10 + sum * 10;

			number = number / 10;

		}

		if (temp == sum) {
			System.out.println(number + " is a palindrome ");
		}

		input.close();
	}

}
