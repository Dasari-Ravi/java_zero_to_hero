package com.java.core.statement;

import java.util.Scanner;

public class statement {
	public static void main(String[] args) {
		Scanner max = new Scanner(System.in);
		int a = max.nextInt();
		int b = max.nextInt();
		int c = max.nextInt();

		max.close();

		if (a > b && a > c) {
			System.out.println(a);

			} else if(b>a &&b>c) {
				System.out.println(b);

			
		}
			else {
				System.out.println(c);
			}

	}

}
