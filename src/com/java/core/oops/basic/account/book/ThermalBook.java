package com.java.core.oops.basic.account.book;


public class ThermalBook {
	public static void main(String[] args) {
		Book rskhurmi = new Book();
		Book rajput = new Book();

		System.out.println("cost of rskhurmi " + rskhurmi.getCost());
		rskhurmi.setCost(645);
		rajput.setCost(768);
		rskhurmi.setLessons("seven");

		System.out.println("cost of rskhurmi " + rskhurmi.getCost());

		System.out.println("lessons in it " + rskhurmi.getLessons());

	}
	// Account bobsAccount=new Account();
	// bobsAccount.

}
