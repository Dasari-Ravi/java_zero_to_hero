package com.java.core.oops.test;

public class HealthyBurger extends HamBurger {
	private String healthyExtra1Name;
	private double healthyExtra1price;

	private String healthyExtra2Name;
	private double healthyExtra2price;
	
	public HealthyBurger(String meat, double price) {
		super("healthy", meat, price, "brown tye");
		}
	public void addhealthAddition1(String name,double price) {
		this.healthyExtra1Name=name;
		this.healthyExtra1price=price;
	}
	public void addhealthAddition2(String name,double price) {
		this.healthyExtra2Name=name;
		this.healthyExtra2price=price;
	}
	@Override
	public double ItemizeHamBurger() {
		double hamburgerPrice= super.ItemizeHamBurger();
		if(this.healthyExtra1Name!=null) {
			hamburgerPrice+=healthyExtra1price;
			System.out.println("added " + healthyExtra1Name + " for an Extra " + this.healthyExtra1price);
		}
		if(this.healthyExtra2Name!=null) {
			hamburgerPrice+=healthyExtra2price;
			System.out.println("added " + healthyExtra2Name + " for an Extra " + this.healthyExtra2price);
		}
		return hamburgerPrice;
		}
	}
	


	
