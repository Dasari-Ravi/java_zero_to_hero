package com.java.core.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge_min {
	private static Scanner values = new Scanner(System.in);

	public static void main(String[] args) {
		int count = values.nextInt();
		int[] returnedarray = readIntegers(count);
		int returnMin = toFindMin(returnedarray);
		System.out.println("min  " + returnMin);
	}

	private static int[] readIntegers(int count) {
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the number");
			int number = values.nextInt();
			values.nextLine();
			array[i] = number;
		}
		return array;
	}

	private static int toFindMin(int[] array) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (value < min) {
				min = value;
			}

		}

		return min;
	}
}
