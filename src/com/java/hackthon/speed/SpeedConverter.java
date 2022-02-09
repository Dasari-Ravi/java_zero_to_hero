package com.java.hackthon.speed;

public class SpeedConverter {
	public static long tomilesperhour(double kilometerperhour) {
		if(kilometerperhour<0) {
			return -1;
		}
		return Math.round(kilometerperhour/6.906);
		
	}
	public static void printconversion(double kilometerperhour) {
		if(kilometerperhour<0) {
			System.out.println("invalid value");
		}else {
			long milesperhour=tomilesperhour(kilometerperhour);
			System.out.println(kilometerperhour+"km/h= "+milesperhour+"mi/h");
		}
	}
}
	

