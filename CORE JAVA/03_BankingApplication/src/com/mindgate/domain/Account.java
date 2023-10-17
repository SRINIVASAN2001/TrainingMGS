package com.mindgate.domain;

public abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {

		System.out.println("Default Constructor of Account");
	}

	public Account(int accountNumber,String name,double balance)
	{
		System.out.println("Parameterized Constructor of Account");
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}

	public void setaccountNumber(int accNumber) {
		accountNumber = accNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setName(String accName) {
		name = accName;
	}

	public String getName() {
		return name;
	}

	public void setbalance(double accBalance) {
		balance = accBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public abstract boolean withdraw(double amount);
	
	public abstract boolean deposit(double amount);

//	public boolean withdraw(double amount) {
//		if (amount > 0 && amount <= balance) {
//			balance -= amount;
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public boolean deposit(double amount) {
//		if (amount > 0) {
//			balance += amount;
//			return true;
//		} else {
//			return false;
//		}
//	}

}
