package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Savings;

public class BankingApplicationMain5 {
	
	
	public static void main(String[] args)
	{
		
		Scanner scanner =new Scanner(System.in);
	
		System.out.println("Enter the Account number :");
		int accountNumber = scanner.nextInt();scanner.nextLine();
		
		System.out.println("Enter the name :");
		String name = scanner.nextLine();
		
		System.out.println("Enter the balance :");
		double balance = scanner.nextDouble();scanner.nextLine();
		
		System.out.println("Enter the type of Account Savings(False) OR Salary(True)");
		boolean isSalary=scanner.nextBoolean();
		
		Savings savings= new Savings(isSalary, accountNumber, name, balance);
		
		System.out.println("Enter the Amount to Withdraw :");
		double amount=scanner.nextDouble();
		
		boolean result=savings.withdraw(amount);
		System.out.println(result);

	}

}
