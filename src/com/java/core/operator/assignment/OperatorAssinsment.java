package com.java.core.operator.assignment;

public class OperatorAssinsment {
	public static void main(String[] args) {
		int myintvalue = 40;
		if (myintvalue == 40) {
			System.out.println("this is an error");
			System.out.println("please correct one number");
		}
		boolean iscar = false;
		if (!iscar) {
			System.out.println("this is not going to happen");
		}
		int ageofclient = 20;
		boolean iseighteenorover = ageofclient == 20 ? true : false;
		if (iseighteenorover) {
			System.out.println("true");
		}
		// So operand one - ageOfClient is equal to 20,

//we're using the equals to operator,

//so that's the condition we're checking for

//and that condition, remember, needs to return true or false.

//Operand two - true here is the value to assign

//to the variable isEighteenOrOver

//if the condition in operand one is true.

//And operand three, which is assigned to false,

//that's the value that's going to be assigned

//to the variable isEighteenOrOver

//if the condition in operand one was false.

//Now in this particular case isEighteenOrOver

//is assigned the value true and

//that's because the age of the client has the value 20

//and our condition for operand one ageOfClient is equal

//to 20 returns true.
		double firstdoublevalue = 20.00d;
		double seconddoublevalue = 80.00d;
		double myvalue = (firstdoublevalue + seconddoublevalue) * 100.00d;
		System.out.println("my value is= " + myvalue);
		double myreminder = myvalue % 40.00d;
		System.out.println("myreminder = " + myreminder);
		boolean isnoreminder = (myreminder == 0) ? true : false;
		System.out.println("isnoreminder= " + isnoreminder);
		if (!isnoreminder) {
			System.out.println(" got some reminder");
		}

	}
}
