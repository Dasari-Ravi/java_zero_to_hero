package com.java.core.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

}
