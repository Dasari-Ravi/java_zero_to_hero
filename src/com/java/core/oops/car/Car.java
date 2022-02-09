package com.java.core.oops.car;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String colour;
	private String engine;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		String validmodel=model.toLowerCase();
		if(validmodel.equals("Slavia")||validmodel.equals("nexon")){
				 
		this.model = model;
	}
	 else {
		model="unknown";
	}
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
