package com.java.core.whilestatement;

public class WhileDoTest {
	public static void main(String[] args) {
		int number = 0;
		while (number < 15) {
			number++;
			if (number < 5) {
				System.out.println("number is " + number);
				continue;
			}
			System.out.println("number is greater than 5 ");

			if (number > 10) {
				System.out.println("outer number " + number);
				break;

			}

		}

	}

}
