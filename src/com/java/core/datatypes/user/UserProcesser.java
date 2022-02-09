package com.java.core.datatypes.user;

import java.util.Scanner;

public class UserProcesser {

	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.userId);
		System.out.println(user.userName);
		System.out.println(user.schoolName);
		User user1 = new User();
		user1.userId=508;
		user1.userName="Shiva";
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.schoolName);
		
		System.out.println("Please Enter name");
		
		Scanner inputData=new Scanner(System.in);
		String intFata=inputData.next();
		System.out.println("USER Entered Data:"+intFata);
				
	}

}
