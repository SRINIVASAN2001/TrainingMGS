package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;

public class BankingApplicationMain2 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Account number:");
		int accNumber=scanner.nextInt();scanner.nextLine();
		System.out.println("Enter the name:");
		String Name=scanner.nextLine();
		System.out.println("Enter the balance:");
		double balance=scanner.nextDouble();scanner.nextLine();
		
		Account account = new Account();
		account.setaccountNumber(accNumber);
		account.setName(Name);
		account.setbalance(balance);
		
		
		System.out.println("Enter the withdraw amount:");
		double amount1=scanner.nextDouble();scanner.nextLine();
		boolean status=account.withdraw(amount1);
		if(status)
		{
			System.out.println("Your Transaction is Successfull!!!");
			System.out.println("Accout Balance is::"+account.getBalance());
		}
		else
		{
			System.out.println("Transaction Failed!!!");
			System.out.println("Accout Balance is::"+account.getBalance());
		}
		
		
		System.out.println("Enter the deposit amount:");
		double amount2=scanner.nextDouble();scanner.nextLine();
		status=account.withdraw(amount2);
		if(status)
		{
			System.out.println("Your Transaction is Successfull!!!");
			System.out.println("Account Balance is ::"+account.getBalance());
		}
		else
		{
			System.out.println("Transaction Failed!!!");
			System.out.println("Account Balance is ::"+account.getBalance());
		}
		
		
		
		
		System.out.println("Main End");
	}

}
