package com.java.core.oops.test;

public class DeluxeBurger extends HamBurger {

	public DeluxeBurger() {
		super("Deluxe","susage&bacon",14.2, "white");
		super.addHamBurgerAddition1("chips",12.2);
		super.addHamBurgerAddition2("drinks",5.3);
		
	}

	@Override
	public void addHamBurgerAddition1(String name, double price) {
		
		System.out.println("you should not any other item");
	}

	@Override
	public void addHamBurgerAddition2(String name, double price) {
		
		System.out.println("you should not any other item");
	}

	@Override
	public void addHamBurgerAddition3(String name, double price) {
		
		System.out.println("you should not any other item");
	}

	@Override
	public void addHamBurgerAddition4(String name, double price) {
		
		System.out.println("you should not any other item");
	}
	
	

}
