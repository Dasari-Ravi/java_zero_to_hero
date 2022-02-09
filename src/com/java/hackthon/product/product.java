package com.java.hackthon.product;

import java.util.Scanner;

public class product {
	private static int x;
	private static int y;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean firstentry=input.hasNextInt();
		if(firstentry) {
			x=input.nextInt();
			y=input.nextInt();
			 if(x>y) {
					int z=x*y;
					
					System.out.println(z);
			
		}
		
			
		
		
		input.close();
		
		
	}
	}

}
