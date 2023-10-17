package com.mindgate.domain;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("Default constructor of Savings");
	}

	public Savings(boolean isSalary, int accountNumber, String name, Double balance) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Parameterized Constructor of Savings");
	}

	@Override
	public boolean withdraw(double amount) {

		if (isSalary)
		{
			if(amount > 0 && amount <= getBalance())
			{
				setbalance(getBalance() - amount);
				return true;
			}	
		}
		else
		{
			if(amount > 0 && amount <= getBalance())
			{
				double defaultamount = 500;
				double checkamount = getBalance() - amount;
				
				if(checkamount > defaultamount)
				{	
					setbalance(getBalance() - checkamount);
					return true;
				}	
			}	
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {

		if (amount > 0) {

			setbalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public boolean getSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

}
