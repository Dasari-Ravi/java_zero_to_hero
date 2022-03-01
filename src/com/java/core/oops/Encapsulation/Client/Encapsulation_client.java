package com.java.core.oops.Encapsulation.Client;

public class Encapsulation_client {
	public static void main(String[] args) {
		//this code can be excuted if we decomment the Encapsulation_palyer class
		/*
		 * Encapsulation_Player player = new Encapsulation_Player(); player.name="Ravi";
		 * player.health=34; player.weapon="sword";
		 * 
		 * int damage=10; player.looseHealth(damage);
		 * 
		 * System.out.println("remaining health "+player.healthRemaining());
		 * 
		 * damage=35; player.looseHealth(damage);
		 * 
		 * System.out.println("remaining health "+player.healthRemaining());
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		//this Statements are from encapsulation_EnhancePlayer Class.decomment that first
		/*
		 * Encapsulation_EnhancePlayer player=new Encapsulation_EnhancePlayer("Ravi",
		 * 15, "sword"); System.out.println("intial health "+player.getHealth());
		 */
		
		
		
		EncapsulationChallenge_Printer printer=new EncapsulationChallenge_Printer(50,false);
		System.out.println("intial pages "+printer.getPagesPrinter());
		int pagesPrinted=printer.printPages(4);
		System.out.println("pages printed "+pagesPrinted+" new total for the printer= "+printer.getPagesPrinter());
		pagesPrinted=printer.printPages(2);
		System.out.println("pages printed "+pagesPrinted+" new total for the printer= "+printer.getPagesPrinter());
	}

}
