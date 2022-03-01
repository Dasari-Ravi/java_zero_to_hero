package com.java.core.oops.test;

public class OppsTest {
	public static void main(String[] args) {
		HamBurger hamburger = new HamBurger("Basic", "sussik", 23.00, "White");
		double price = hamburger.ItemizeHamBurger();
		hamburger.addHamBurgerAddition1("tomato", 4.0);
		hamburger.addHamBurgerAddition2(" lacctice", 3.0);
		hamburger.addHamBurgerAddition3("potato", 5.0);
		hamburger.addHamBurgerAddition4("cheese", 4.0);
		System.out.println("total burger price " + hamburger.ItemizeHamBurger());

		HealthyBurger healthyBurger = new HealthyBurger("chicky", 4.0);
		healthyBurger.ItemizeHamBurger();
		healthyBurger.addHamBurgerAddition1("egg",3.0);
		healthyBurger.addhealthAddition1("eteel", 2.0);
		
		System.out.println("total healthy price is "+healthyBurger.ItemizeHamBurger());
		
		DeluxeBurger db=new DeluxeBurger();
		db.addHamBurgerAddition3("you should do this ", 0.00);
		db.ItemizeHamBurger();
		//db.addHamBurgerAddition1("thumbs",20.0);
		//db.addHamBurgerAddition2("bingo",4.0);
		//System.out.println("total price for delux burger "+db.ItemizeHamBurger());
	}

}
