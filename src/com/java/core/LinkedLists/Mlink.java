package com.java.core.LinkedLists;

import java.util.ArrayList;

import com.java.core.autoboxing.linkLists;

public class Mlink {
	public static void main(String[] args) {
		Customer customer = new Customer("Ravi", 56.2);
		Customer AnotherCustomer;
		AnotherCustomer = customer;

		AnotherCustomer.setBalance(45.2);

		System.out.println("Balance for customer " + customer.getName() + " is Rs." + customer.getBalance());
		
		ArrayList<Integer>IntList=new ArrayList<Integer>();
		IntList.add(1);
		IntList.add(3);
		IntList.add(4);
		
		for(int i=0;i<IntList.size();i++) {
			System.out.println(i+" : "+IntList.get(i));

		}
		IntList.add(1, 8);
		System.out.println("After the modification");
		
		for(int i=0;i<IntList.size();i++) {
			System.out.println(i+" : "+IntList.get(i));

		}
		
		
	}

}
