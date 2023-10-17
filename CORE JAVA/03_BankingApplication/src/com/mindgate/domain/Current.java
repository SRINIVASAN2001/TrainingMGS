package com.mindgate.domain;

public class Current extends Account
{
	private double overdraftBalance;
	private double overdraft =50000;
	
	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		if(amount > 0 && amount <= getBalance() && getBalance()!=0)
		{
			setbalance(getBalance()-amount);
			return true;
		}
		if(amount > 0 && amount >= getBalance() && overdraftBalance !=0 && amount <= getOverdraftBalance() + getBalance())
		{
			amount= amount - getBalance();
			setOverdraftBalance(overdraftBalance - amount);
			setbalance(0);
			return true;	
		}
		else
		{
			System.out.println("You exceed your limit!!");
		}
		return false;
	}
	
	@Override
	public boolean deposit(double amount) {
		
		if(amount > 0 && getOverdraftBalance()==overdraft) //overdraft=50000
		{
			setbalance(getBalance() + amount);
			return true;
		}
		if(amount > 0 && getOverdraftBalance() + amount < overdraft)
		{
			setOverdraftBalance(getOverdraftBalance() + amount);
			
		}
		if(amount > 0 && getOverdraftBalance() + amount > overdraft)
		{
			double newoverdraft = overdraft - getOverdraftBalance();
			amount = amount - newoverdraft;
			setbalance(getBalance()+amount);
			setOverdraftBalance(newoverdraft + getOverdraftBalance() );
			return true;
			
			
		}
		return false;
	}
	

	

}
