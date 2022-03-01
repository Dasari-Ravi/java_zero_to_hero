package com.java.core.opps.composition.challenge;

public class Home {
	public static void main(String[] args) {
		Wall wall1 = new Wall("east");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");

		Celling celling = new Celling(12, "white");

		Bed bed = new Bed("queen", 2, 78, 45, 23);

		Lamp lamp = new Lamp("modern", true, 68);

		Bedroom bedroom = new Bedroom("ravi", wall1, wall2, wall3, wall3, celling, bed, lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();

	}

}
