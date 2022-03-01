package com.java.core.oops.composition;

public class Composition {
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);

		Monitor theMonitor = new Monitor("27inch breast", "Acer", 27,new Resloution(2250, 1440));

		Motherboard theMotherboard = new Motherboard("BJ-200", "asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.powerup();
		
		
		
	}

}
