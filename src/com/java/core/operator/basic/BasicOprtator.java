package com.java.core.operator.basic;

public class BasicOprtator {
	public static void main(String[] args) {
		int result = 1 + 2;// 1+2=3
		System.out.println("1+2=" + result);
		int mypeviousresult = result;
		System.out.println("mypeviousresult=" + mypeviousresult);

		result = result - 1;
		System.out.println("3-1=" + result);
		System.out.println(mypeviousresult);
		System.out.println(result);// result and myperviousresults are independent;

		result = result * 10;
		System.out.println("result=" + result);
		result = result / 5;
		System.out.println("20/5=" + result);

		result = result % 3;
		System.out.println("4%3=" + result);

		result++;
		System.out.println("1+1=" + result);

		result--;// 2-1=1
		System.out.println("2-1=" + result);
		// result=result+2;
		result = result += 2;
		System.out.println("1+2=" + result);

		result = result *= 10;
		System.out.println("3*10=" + result);

		result = result / 3;
		System.out.println("30/3=" + result);

		// result=result-2
		result -= 2;// 10-2
		System.out.println("10-2=" + result);

		boolean myvalue = true;
		if (myvalue == true) {
			System.out.println("my value is true");
			System.out.println("my value is false");
		}
		int topScore = 0;
		if (topScore < 100) {
			System.out.println("You got the high score!");
		}

		int secondTopScore = 95;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}

		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}
	}
}
