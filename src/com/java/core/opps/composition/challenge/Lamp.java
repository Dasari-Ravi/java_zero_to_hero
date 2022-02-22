package com.java.core.opps.composition.challenge;

public class Lamp {
	private String Sytle;
	private boolean battery;
	private int globRating;
	public Lamp(String sytle, boolean battery, int globRating) {
		
		this.Sytle = sytle;
		this.battery = battery;
		this.globRating = globRating;
	}
	
	public void turnOn() {
		System.out.println("Lamp->turnOn");
		
	}
	public String getSytle() {
		return Sytle;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getGlobRating() {
		return globRating;
	}
	
	

}
