package com.mindgate.domain;

public class Account
{
	private int accountNumber;
	private String name;
	private double balance;
	
	public void setaccountNumber(int accNumber)
	{
		accountNumber=accNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setName(String accName) {
		name= accName;
	}
	public String getName()
	{
		return name;
	}

	public void setbalance(double accBalance) {
		balance = accBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean withdraw(double amount)
	{
		if(amount >0 && amount <= balance)
		{
			balance-=amount;
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public boolean deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			return true;
		}
		else
		{
			return false;
		}
	}

}
