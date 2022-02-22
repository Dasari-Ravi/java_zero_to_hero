package com.java.hackthon.input;

import java.util.Scanner;

public class Client_Input {
	private static int i;
	private static double x;
	//private static String letter;
	
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		String letter;
		boolean hasnextint=Input.hasNext();
		if(hasnextint) {
			i =Input.nextInt();
			System.out.println("Int: " + i);
			
		}
		 
		 x= Input.nextDouble();
		 letter=Input.nextLine();
		 
		 
		 System.out.println("String: " + letter);
	     System.out.println("Double: " + x);
	     
		 
		
		
		
		
		
		Input.close();
		
	}

}
