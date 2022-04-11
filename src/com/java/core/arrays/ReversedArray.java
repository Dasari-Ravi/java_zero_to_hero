package com.java.core.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
private static Scanner tim=new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] array= {1,23,5};
		System.out.println("array before reversed "+Arrays.toString(array));
		reversedArray(array);
		System.out.println("array after reversed "+Arrays.toString(array));
		
	}
 private static void  reversedArray(int[] array) {
	 int maxArray=array.length-1;
	 int halfofArray=array.length/2;
	 for(int i=0;i<halfofArray;i++) {
		 int temp=array[i];
		 array[i]=array[maxArray-i];
		 array[maxArray-i]=temp;
	 }
	 
	 
 }
}
