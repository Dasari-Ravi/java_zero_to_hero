package com.java.hackthon.palindrome;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(palindrome(178));
		// palindrome(121);
	}

	public static boolean palindrome(int number) {
		int result = 0;
		int input = number;
		boolean isPalem = false;
		while (input > 0) {
			int rem = input % 10;
			result = (result * 10) + rem;
			input = input / 10;
		}
		if (number != result) {
			isPalem = false;
			// int sum=0
		}

		if (result == number) {
			isPalem = true;
		}
		return isPalem;
	}

}
