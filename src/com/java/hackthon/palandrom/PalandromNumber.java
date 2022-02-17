package com.java.hackthon.palandrom;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalandromNumber {
	public static int temp;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String NumberInput = input.next();
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher numberMatcher = pattern.matcher(NumberInput);
		boolean NumberInputDecimal = NumberInput.contains(".");
		if (numberMatcher.find() && !NumberInputDecimal) {
			int number = Integer.valueOf(NumberInput);
			int sum = 0;

			//sum = 0;

			temp = number;
			while (number >= 1) {
				sum = number % 10 + sum * 10;

				number = number / 10;
				
				}
			//System.out.println(sum);
			if (sum==temp) {
				System.out.println(sum + " is a palindrome ");
			}else
				
			{
				System.out.println(sum + " is not a palindrome ");
			}
			
			
			
			

			

			input.close();
			
		}
		
		

	}
}
