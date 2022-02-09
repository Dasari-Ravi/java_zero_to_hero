package com.java.hackthon.sequence;

import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int x = num.nextInt();

		int i = 1;
		int y = 0;
		int z = 0;

		while (i <= x) {
			y += z;
			if (z == 5) {
				break;
			}
			System.out.println(z);
		}

		num.close();

	}

}
