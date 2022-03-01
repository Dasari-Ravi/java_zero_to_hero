package com.java.core.oops.test;

public class HamBurger {
	private String name;
	private String meat;
	private double price;
	private String breadRollsType;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public HamBurger(String name, String meat, double price, String breadRollsType) {

		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollsType = breadRollsType;
	}

	public void addHamBurgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addHamBurgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addHamBurgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addHamBurgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double ItemizeHamBurger() {
		double HamburgerPrice = this.price;
		System.out.println(this.name + " hamBurger" + " on a " + this.breadRollsType + " roll " +" with " +this.meat+" price is " + this.price);

		if (this.addition1Name != null) {
			HamburgerPrice += this.addition1Price;
			System.out.println("added " + addition1Name + " for an Extra " + addition1Price);
		}

		if (this.addition2Name != null) {
			HamburgerPrice += this.addition2Price;
			System.out.println("added " + addition2Name + " for an Extra " + addition2Price);
		}
		if (this.addition3Name != null) {
			HamburgerPrice += this.addition3Price;
			System.out.println("added " + addition3Name + " for an Extra " + addition3Price);
		}
		if (this.addition4Name != null) {
			HamburgerPrice += this.addition4Price;
			System.out.println("added " + addition4Name + " for an Extra " + addition4Price);
		}
		return HamburgerPrice;

	}

}
