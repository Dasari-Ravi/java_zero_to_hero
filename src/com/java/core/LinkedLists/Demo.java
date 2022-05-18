package com.java.core.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import com.java.core.autoboxing.linkLists;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "Hyderabad");
		addInOrder(placesToVisit, "Mumbai");
//		addInOrder(placesToVisit, "Delhi");
		addInOrder(placesToVisit, "Banglore");
		addInOrder(placesToVisit, "Pune");
		addInOrder(placesToVisit, "Chennai");
		addInOrder(placesToVisit, "trivandrum");
		addInOrder(placesToVisit, "Delhi");

		addInOrder(placesToVisit, "Amristar");

		addInOrder(placesToVisit, "Hyderabad");
		visit(placesToVisit);

		printList(placesToVisit);
//		placesToVisit.add("Hyderabad");
//		placesToVisit.add("Mumbai");
//		placesToVisit.add("Banglore");
//		placesToVisit.add("Pune");
//		placesToVisit.add("chennai");
//		placesToVisit.add("trivandrum");
//		placesToVisit.add("Delhi");
//
//		printList(placesToVisit);
//		placesToVisit.add(1, "Srinagar");
//		printList(placesToVisit);
//		placesToVisit.remove(4);
//		printList(placesToVisit);
	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("===================================");
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();

		while (stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if (comparison == 0) {
				// do not add the entry
				System.out.println(newCity + "already exist in the lists");
			} else if (comparison > 0) {
				// add the new entry
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;

			} else if (comparison < 0) {

			}
		}
		stringListIterator.add(newCity);
		return true;
	}

	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit= false;
		ListIterator<String> listIterator = cities.listIterator();

		if (cities.isEmpty()) {
			System.out.println("no cities to visit ");
		} else {
			System.out.println("now visiting "+listIterator.next());
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 1:
				System.out.println("Holidays over");
				quit=true;
				break;
			case 2:
				if(listIterator.hasNext()) {
					System.out.println(" now visting "+listIterator.next());
				}else {
					System.out.println(" Reached the destinatiotn");
				}
				break;
			case 3: if(listIterator.hasPrevious()) {
				System.out.println("now visiting "+listIterator.hasPrevious());
				
			}else {
				System.out.println("we are starting from intial state");
			}
			break;
			case 4:
				printMenu();
				break;

			}
		}

	}
	
		 private static void printMenu() {
		        System.out.println("Available actions:\npress ");
		        System.out.println("01- to quit\n" +
		                "2 - go to next city\n" +
		                "3 - go to previous city\n" +
		                "4- print menu options");
		    



	}

}
