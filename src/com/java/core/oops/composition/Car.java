package com.java.core.oops.composition;

public class Car extends Velhicle {
	private int doors;
	private int EngineCapacity;
	
	
	public Car(String name, int doors, int EngineCapacity) {
		super(name);
		this.doors = doors;
		this.EngineCapacity = EngineCapacity;
	}

}
