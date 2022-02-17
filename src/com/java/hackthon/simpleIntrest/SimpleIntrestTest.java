package com.java.hackthon.simpleIntrest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleIntrestTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String principalInput = scanner.next();
		String interestInput = scanner.next();
		String timeInput = scanner.next();
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher principalMatcher = pattern.matcher(principalInput);
		Matcher timeMatcher = pattern.matcher(timeInput);
		boolean principalInputDecimal = principalInput.contains(".");
		boolean timeInputDecimal = timeInput.contains(".");
		if (principalMatcher.find() && timeMatcher.find() && !principalInputDecimal && !timeInputDecimal) {
			int principal = Integer.valueOf(principalInput);
			double interest = Double.valueOf(interestInput);
			int time = Integer.valueOf(timeInput);
			double total_ammount = (principal * interest * time) / 100;
			System.out.println(total_ammount);
		}
		scanner.close();
	}
}
