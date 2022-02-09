package com.java.hackthon.evennumber;

public class EvenNumberTest {
	public static void main(String[] args) {
	int number=123;
	isEvennumber(number);
	
	System.out.println("it is excueted");
	
		
	}
	public static boolean isEvennumber(int number) {
		if(number%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
