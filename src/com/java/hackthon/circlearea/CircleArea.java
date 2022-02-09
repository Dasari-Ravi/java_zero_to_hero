package com.java.hackthon.circlearea;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner circle=new Scanner(System.in);
		
		int radius=circle.nextInt();
		
		double pi=3.14;
		
		double area=pi*radius*radius;
		
		
		circle.close();
		
		System.out.println(area);
	}

}
