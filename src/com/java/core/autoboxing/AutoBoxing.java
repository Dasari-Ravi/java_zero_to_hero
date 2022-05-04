package com.java.core.autoboxing;

import java.util.ArrayList;

class intClass{
	private int myValue;

	public intClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}

	}

public class AutoBoxing {
	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];

		ArrayList<String> StrArrayList=new ArrayList<String>();
		StrArrayList.add("devender");
		StrArrayList.add("karthik");
		StrArrayList.add("jaideep");
		System.out.println(StrArrayList);
		
		ArrayList<intClass> intClassArray=new ArrayList<intClass>();
		intClassArray.add(new intClass(56));
		System.out.println(intArray);
		
		
		
//		StrArrayList.remove(1);
//		System.out.println(StrArrayList);
//		
//		StrArrayList.iterator();
//	System.out.println(StrArrayList);
	}

}
