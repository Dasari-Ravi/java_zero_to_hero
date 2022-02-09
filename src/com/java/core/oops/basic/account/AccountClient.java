package com.java.core.oops.basic.account;

public class AccountClient { 
	///**
	// * @param args
	// */
	public static void main(String[] args) {
		Account bobsAccount=new Account("254595",0.0,"ravi","dasariravi@gamil.com","9542347454");
		System.out.println(bobsAccount.getBalance());
		System.out.println(bobsAccount.getCustomeremail());
		//bobsAccount.withdrawal(100.0);
		//bobsAccount.deposit(1000.0);
		//bobsAccount.withdrawal(200);
		//bobsAccount.setBalance(125554);
		//bobsAccount.setCustomername("Ravi");
		//bobsAccount.setCustomeremail("dasariravi014@gmail.com");
		//bobsAccount.setNumber("9542375784");
	}
}


