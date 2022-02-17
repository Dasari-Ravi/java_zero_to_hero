package com.java.core.keywords;

public class keywords {
	public static void main(String[] args) {
		// 1km=1000meters
		int kms = 12 * 1000;// other than datatype everything in the line is an expression
		System.out.println("the value= " + kms);
		//double kilo = 1000 * 12;
		// if(kilo==12000) {
		// System.out.println("the expression");//the component within the bracket is an
		// expression
		// }
		int score = 109;
		if (score < 1100) {
			System.out.println("you have high score");
			score = 0;
		} else if (score > 108) {
			System.out.println("you got right");
		} else
			System.out.println("i am there ");

	}

}
