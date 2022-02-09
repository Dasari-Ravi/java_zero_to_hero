package com.java.core.oops.inheritance;

import java.util.Scanner;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Dog dog = new Dog("rio", 2, 1, 4, 32, 1, 5, "silkly"); dog.eat(); dog.run();
		 * dog.walk(); dog.setTeeth(45);
		 * System.out.println("dog teeth "+dog.getTeeth());
		 */

		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else if (N % 2 == 0) {
			if (2 <= N && N <= 5) {
				System.out.println("Not Weird");
			} else if (6 <= N && N <= 20) {
				System.out.println("Weird");
			} else if (N > 20) {
				System.out.println("Not Weird");
			}
		}

	}

}
