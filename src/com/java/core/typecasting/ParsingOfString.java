package com.java.core.typecasting;

import java.util.Scanner;

public class ParsingOfString {
	public static void main(String[] args) {
		// int number;
		String mynumberstring = "2018";
		System.out.println("My number string " + mynumberstring);

		int number = Integer.parseInt(mynumberstring);
		System.out.println("number= " + number);

		mynumberstring += 1;
		number += 1;
		System.out.println("my number string " + mynumberstring);
		System.out.println("my number " + number);

		String mynumberstrings = "2018.55654";
		System.out.println("My number string " + mynumberstring);

		double mynumber = Double.parseDouble(mynumberstrings);
		System.out.println("number= " + number);

		mynumberstrings += 1;
		mynumber += 1;
		System.out.println("my number string " + mynumberstrings);
		System.out.println("my number " + mynumber);

		Scanner scanner = new Scanner(System.in);

	}

}
