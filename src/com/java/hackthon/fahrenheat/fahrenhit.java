package com.java.hackthon.fahrenheat;

import java.util.Scanner;

public class fahrenhit {

	public static void main(String[] args) {

		Scanner celsius = new Scanner(System.in);
		int F = celsius.nextInt();
		
				double C = ((F - 32) / 9) * 5;
				System.out.println(C);
			

		celsius.close();

	}

}
