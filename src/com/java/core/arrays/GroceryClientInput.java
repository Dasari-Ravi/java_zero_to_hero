package com.java.core.arrays;

import java.util.Scanner;

public class GroceryClientInput {
	private static Scanner scanner = new Scanner(System.in);
	private static GrocceriesList grocceryList = new GrocceriesList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstruction();
		while (!quit) {
			System.out.println("enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				grocceryList.printGrocceryList();
				break;
			case 2:
				additem();
				break;
			case 3:
				modifyitem();
				break;
			case 4:
				removeitem();
				break;
			case 5:
				searchforitem();
				break;
			case 6:
				quit=true;
				break;
				

			}

		}
	}

	



	





	public static void printInstruction() {
		System.out.println("hhwfojwok");
		
		
	}
    public  static void additem() {
    	System.out.print("enter grocery item");
    	grocceryList.addGroccery(scanner.nextLine());
		
		
	}
    public static void modifyitem() {
    	System.out.print("enter item number: ");
    	grocceryList.modifyGrocceryitem(scanner.nextInt(),scanner.nextLine());
    	scanner.nextLine();
    	
    }
	public static void removeitem() {
		System.out.print("enter item number: ");
		grocceryList.removeGroceryitem(scanner.nextInt());
		
		
	}
	public static void searchforitem() {
		System.out.println("item to search for: ");
		String serachItem=scanner.nextLine();
		if(grocceryList.findItem(serachItem)!=null) {
			System.out.println("item "+serachItem+" found in the grocery list ");
		}
		else {
			System.out.println(serachItem+" not found in the shopping list");
		}
		
	}
    

	

}
