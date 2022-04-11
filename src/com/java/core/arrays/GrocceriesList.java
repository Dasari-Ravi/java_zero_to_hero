package com.java.core.arrays;

import java.util.ArrayList;

public class GrocceriesList {
	private int[] mynumber;
	private ArrayList<String> grocery = new ArrayList<String>();

	public void addGroccery(String items) {
		grocery.add(items);
	}

	public void printGrocceryList() {
		System.out.println("you have " + grocery.size() + " items in your grocery list ");
		for (int i = 0; i < grocery.size(); i++) {
			System.out.println((i + 1) + "." + grocery.get(i));
		}
	}

	public void modifyGrocceryitem(int position, String newitem) {
		grocery.set(position, newitem);
		System.out.println("Grocery item " + (position + 1) + " has been modified");
	}

	public void removeGroceryitem(int position) {
		String theItem = grocery.get(position);
		grocery.remove(position);
		//it removes the item position from grocery package;
		//when we have three items like 1=cheese
		//2=butter;
		//3=chilles
		//when we remove specific position from groceryList then it may be adjusted to remaining sequence
	}

	public String findItem(String searchItem) {
		// boolean exists=grocery.contains(searchItem);
		//contains method search the item in the grocceries and return true if even it find one item in the groceries;
		
		
		int position = grocery.indexOf(searchItem);
		//this calls return the position of the item 
		//if the this method doesn't find the item we are searching for then it may return -1;;;
		if(position>=0) {
			return grocery.get(position);
		
		}
		return null;

	}
}
