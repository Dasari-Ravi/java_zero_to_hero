package com.java.core.arrayListchallenge;

import java.util.ArrayList;

public class mobilePhone {
	private String myNumber;
	private ArrayList<Contacts> mycontacts;
	
	public mobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.mycontacts=new ArrayList<Contacts>();
		
	}
	public boolean addNewContact(Contacts contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("cantact is already in file");
			return false;
		}
		mycontacts.add(contact);
		return true;
		
		
		private int findContact(Contacts contact) {
			return this.mycontacts.indexOf(contact);
			
		}
		
	}
	
	

}
