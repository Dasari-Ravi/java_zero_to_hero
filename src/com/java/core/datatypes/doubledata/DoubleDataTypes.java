package com.java.core.datatypes.doubledata;

public class DoubleDataTypes {
	public static void main(String[] args) {

		float myMinfloatvalue = Float.MIN_VALUE;
		float mymaxfloatvalue = Float.MAX_VALUE;
		System.out.println("Float minimum value= " + myMinfloatvalue);
		System.out.println("Float maximum value= " + mymaxfloatvalue);
		double MyMindoublevalue = Double.MIN_VALUE;
		double Mymaxdoublevalue = Double.MAX_VALUE;
		System.out.println("double minimum value= " + MyMindoublevalue);
		System.out.println("double maximum value= " + Mymaxdoublevalue);
		int myIntvalue = 5 / 3;
		float myFloatvalue = 5f / 3f;
		double myDoublevalue = 5.00 / 3.00;
		System.out.println("myIntvalue= " + myIntvalue);
		System.out.println("myFloatvalue= " + myFloatvalue);
		System.out.println("myDoublevalue= " + myDoublevalue);
		double Mypounds = 200d;
		double myconvertedkilograms = Mypounds * 0.45359237;
		System.out.println("myconvertedKilograms= " + myconvertedkilograms);
		double pi = 3.1234d;
		double anothernumber = 3_000_44556_59725d;
		System.out.println(pi);
		System.out.println(anothernumber);

	}

}
