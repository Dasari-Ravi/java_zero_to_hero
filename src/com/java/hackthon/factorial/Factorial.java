package com.java.hackthon.factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		int i=1;
		int y=1;
		
		for(i=1;i<=x;i++) {

			 y=y*i;
			
		}
		System.out.println(y);
		   

		

		num.close();

	}

}
