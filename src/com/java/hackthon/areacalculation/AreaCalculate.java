package com.java.hackthon.areacalculation;

public class AreaCalculate {
	public static void main(String[] args) {
		double areaofcircle = area(3.4);
		System.out.println("area of circle " + areaofcircle);
	}

	public static int area(double radius) {
		double areaofcircle = radius * radius * Math.PI;
		System.out.println("area of circle " + areaofcircle);
		if (radius < 0) {
			return 0;

		}
		return 0;
	}

	public static int area(double x, double y) {
		double areaofrectangle = x * y;
		System.out.println("area of rectangle " + areaofrectangle);
		return 0;

	}

	public static void switchbreak(int score) {
		score = 13;
		switch (score = 13) {
		case 1:
			System.out.println("your value is 13");
			break;
		case 2:
			System.out.println("your value 12");
			break;
		case 3:
			System.out.println("your value is 11");
			break;
		}
	}

}
