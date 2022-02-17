package com.java.hackthon.circlearea;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CircleArea {

	public static void main(String[] args) {
		Scanner circle = new Scanner(System.in);

		String radiusInput = circle.next();
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher radiusMatcher = pattern.matcher(radiusInput);
		boolean radiusInputDecimal = radiusInput.contains(".");
		if (radiusMatcher.find() && !radiusInputDecimal) {
			int radius = Integer.valueOf(radiusInput);
			
			double area = Math.PI * radius * radius;
			
			System.out.println(area);
		}
		circle.close();

	}

}
