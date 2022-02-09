package com.java.core.datatypes.string;

public class StringDatatype {
	public static void main(String[] args) {
		// there are 8 types of datatypes they are:

		// interger

		// boolean

		// byte

		// char

		// short

		// long

		// float

		// double
		String mystring = "this is read ";
		System.out.println("my string = " + mystring);
		mystring = mystring + "this is my string";
		System.out.println("hello is working " + mystring);
		mystring = mystring + "\u00A9 2019";
		System.out.println("hello is working " + mystring);
		String mynumberstring = "250.55";
		mynumberstring = mynumberstring + "210.22";
		System.out.println(mynumberstring);
		String laststring = "10";
		int myint = 10;
		laststring = laststring + myint;
		System.out.println("my last string" + laststring);
		double mydoublevalue = 271.2d;
		laststring = laststring + mydoublevalue;
		System.out.println("my last string" + laststring);

	}
}