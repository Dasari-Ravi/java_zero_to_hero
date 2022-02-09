package com.java.core.oops.inheritance;

public class Dog extends Animal {
	private int eyes;
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getTails() {
		return tails;
	}
	public void setTails(int tails) {
		this.tails = tails;
	}
	public int getTeeth() {
		return teeth;
	}
	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}
	public String getCoat() {
		return coat;
	}
	public void setCoat(String coat) {
		this.coat = coat;
	}

	private int legs;
	private int tails;
	private int teeth;
	private String coat;
	
	public Dog(String name,  int size, int weight,int eyes,int legs,int tails,int teeth,String coat) {
		super(name, 1,1, size, weight);
		
		this.eyes=eyes;
		this.legs=legs;
		this.tails=tails;
		this.teeth=teeth;
		this.coat=coat;
		
		
				
		
	}
	private void chew() {
		System.out.println("dog.chew()");
	}
	@Override
	public void eat() {
		
		System.out.println("dog.eat()");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("dog.walk()");
		super.move(6);
	}
	
	public void run() {
		System.out.println("dog.run()nnono");
		move(5);
	}
	
		
	

	

}

