package com.java.core.oops.inheritance.car;

public class Velhicle {

	private String name;
	private String size;

	private int currentVelocity;
	private int currentDirection;

	public Velhicle(String name, String size) {
		this.name = name;
		this.size = size;

		this.currentVelocity = 0;
		this.currentDirection = 0;
	}

	public void steer(int direction) {
		
		currentDirection+=direction;
		
		System.out.println("steer at"+currentDirection+"degrees");
	}
	
	public void move(int velocity,int direction) {
		
		currentDirection=direction;
		currentVelocity=velocity;
		
		System.out.println("velhicle.move() moves "+currentVelocity+" in direction"+currentDirection);
		
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}
	

	
	

}
