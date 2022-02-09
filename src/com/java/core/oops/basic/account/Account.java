package com.java.core.oops.basic.account;

public class Account {
	private String number;
	private double balance;
	private String customername;
	private String customeremail;
	private String phonenumber;

	public Account() {
		System.out.println("default construtor");
	}

	public Account(String number, double balance, String customername, String customeremail, String phonenumber) {
		System.out.println("construtor contains parameters");
		this.number = number;
		this.balance = balance;
		this.customername = customername;
		this.customeremail = customeremail;
		this.phonenumber = phonenumber;
	}

	public Account(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}

	public void deposit(double depositbalance) {
		this.balance += depositbalance;
		System.out.println(" deposit balance" + depositbalance + " total balance" + this.balance);
	}

	public void withdrawal(double withdrawalammount) {
		if (this.balance - withdrawalammount <= 0) {
			System.out.println(" only" + this.balance + " is avalible. withdrawal not process");

		} else {
			this.balance -= withdrawalammount;
			System.out.println(" withdrawal" + withdrawalammount + " is avalible balance" + this.balance);

		}

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
