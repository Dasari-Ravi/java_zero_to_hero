package com.java.core.arrayListchallenge;

import java.util.ArrayList;

public class mobilePhone {
	private String myNumber;
	private ArrayList<Contacts> mycontacts;

	public mobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.mycontacts = new ArrayList<Contacts>();

	}

	public boolean addNewContact(Contacts contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("cantact is already in file");
			return false;
		}
		mycontacts.add(contact);
		return true;
	}

	public boolean updateContact(Contacts oldContact,Contacts newContact) {
		int foundPosition=findContact(oldContact);
		if(foundPosition<0) {
			System.out.println(oldContact.getName() + ", was not found");
			return false;
					
		}
		this.mycontacts.set(foundPosition,newContact);
		System.out.println(oldContact.getName() +", was replaced with "+newContact.getName());
		return true;
	}

	private int findContact(Contacts contact) {
		return this.mycontacts.indexOf(contact);

	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.mycontacts.size(); i++) {
			Contacts contact = this.mycontacts.get(i);
			if (contact.getName().equals(contactName)) {
				return i;

			}

		}
		return -1;

	}

}
