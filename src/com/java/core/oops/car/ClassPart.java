package com.java.core.oops.car;

public class ClassPart {
	public static void main(String[] args) {
		Car Skoda = new Car();
		Car maruthi = new Car();
		
		Skoda.setModel("Slavia");
		
		maruthi.setModel("nexon");
		
		maruthi.setDoors(4);
		
		
		System.out.println("model of skoda " + Skoda.getModel());
		
		
		System.out.println("model of maruthi " + maruthi.getModel());
		
		
		System.out.println("Doors of maruthi " + maruthi.getDoors());

	}

}
