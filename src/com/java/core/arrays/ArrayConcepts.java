package com.java.core.arrays;

import java.util.Scanner;

public class ArrayConcepts {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myInt =getInt(5);
		for(int i=0;i<myInt.length;i++) {
			System.out.println("Element "+i+" value is "+myInt[i]);
			
			
			
		}
		System.out.println("average of numbers "+getAverage(myInt));
	}

	public static int[] getInt(int number) {
	System.out.println("Enter "+number+" integer value.\r");	
	int[] values=new int[number];
	
	for(int i=0; i<values.length;i++) {
		values[i]=sc.nextInt();
	}
	return values;
	}
	public static double getAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		return (double) sum/(double)array.length;
	}
}















//int[] arrayInt=new int[10];//{1,2,3,4,5,6,7,8,9}; ;
//;
//// it is simple declaration of array.
//// Int because we are assigning int datatype to the arrayInt variable of size 2.
//
///// int[] arrayInt=new int[10];
//// it is type of array declaration to the variable called arrayInt of size 10;
//
//// arrayInt[1]=20;
//// this is way to axis the value in the array.Always indexing Starts from 0;
////arrayInt=
////double arraydouble[];
////double[] arrayDouble = new double[10];
//printarray(arrayInt);
//
//
//
//
//}
//public static void printarray(int[] array) {//Declaring a method in array
//for(int i=0;i<array.length;i++) {
//	array[i]=i*1;
//	System.out.println("Element of "+i+", value is  "+array[i]);
//}
