package com.java.core.oops.inheritance.car;

public class Car extends Velhicle {
	
	private int wheels;
	private int doors;
	private int gears;
	
	
	private boolean manual;
	
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean manual) {
		super(name, size);
		this.setWheels(wheels);
		this.setDoors(doors);
		this.setGears(gears);
		this.setManual(manual);
		this.setCurrentGear(1);
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	
	
	

}
