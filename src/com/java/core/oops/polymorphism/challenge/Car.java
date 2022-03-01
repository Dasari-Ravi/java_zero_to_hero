package com.java.core.oops.polymorphism.challenge;

public class Car {
	private boolean engine;
	private int Cylinders;
	private int Wheels;
	private String name;

	public Car(int cylinders, String name) {
		Cylinders = cylinders;
		this.name = name;
		this.Wheels = 4;
		this.engine = true;
	}

	public int getCylinders() {
		return Cylinders;
	}

	public String getName() {
		return name;
	}

	public String StartEngine() {
		return "car->start engine()";
	}

	public String Accelerate() {
		return "car->accelerate()";
	}

	public String Brake() {
		return "car->Break()";
	}

	class Mitsubshi extends Car {

		public Mitsubshi(int cylinders, String name) {
			super(cylinders, name);

		}

		@Override
		public String Accelerate() {
			return super.Accelerate("Mitsubshi-> Accelerate()");
		}

		@Override
		public String Brake() {
			return super.Brake("Mitsubshi->Brake()");
		}

		@Override
		public String StartEngine() {
			return super.StartEngine("Mitsubshi->start engine()");
		}

	}

	public static void main(String[] args) {
		Car car = new Car(8, "Base car");
		System.out.println(car.Brake());
		System.out.println(car.Accelerate());
		System.out.println(car.StartEngine());

		Mitsubshi mitsubshi=new Mitsubshi() {
			
		}
			System.out.println(mitsubshi.StartEngine());
			System.out.println(mitsubshi.Accelerate());
			System.out.println(mitsubshi.Brake());
		
			

		
	}

}
