package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Current;
import com.mindgate.domain.Savings;

public class BankingApplicationMain7 {

	public static void main(String[] args) {

		System.out.println("ACCOUNT MENU");
		System.out.println("----------------");
		System.out.println("1. SAVINGS");
		System.out.println("2. CURRENT");
		System.out.println();
		System.out.println("Enter your Choice here!!!");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		System.out.println("Enter the Account number:");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name:");
		String name = scanner.nextLine();
		System.out.println("Enter the balance:");
		double balance = scanner.nextDouble();
		scanner.nextLine();

		boolean accountStatus; // to check which type of account is created
		Savings savings = new Savings();
		Current current = new Current();

		if (choice.equalsIgnoreCase("savings")) {
			System.out.println("Do you want to open Salary account say True OR False");
			boolean isSalary = scanner.nextBoolean();

			if (isSalary) {
				savings = new Savings(isSalary, accountNumber, name, balance);
				System.out.println("Salary Account is Created successfully..");
			} else {
				savings = new Savings(isSalary, accountNumber, name, balance);
				System.out.println("Savings Account is Created successfully..");
			}
			accountStatus = true;
		} else {
			System.out.println("Enter your Overdraft Balance ::");
			double overdraftBalance = scanner.nextDouble();

			current = new Current(accountNumber, name, balance, overdraftBalance);
			System.out.println("Current Account is Created Successfully..");
			accountStatus = false;

		}

		System.out.println("Your Account is now opened ");

		String continuechoice;
		do {
			System.out.println("--------Transaction Menu-------");
			System.out.println("Choose Options!!!");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");

			int options = scanner.nextInt();

			switch (options) {
			case 1:
				if (accountStatus) {
					System.out.println("Enter the withdraw amount:");
					double withdrawAmount = scanner.nextDouble();
					scanner.nextLine();
					boolean status = savings.withdraw(withdrawAmount);
					if (status) {
						System.out.println("Your Transaction is Successfull!!!");
						System.out.println("Accout Balance is::" + savings.getBalance());
					} else {
						System.out.println("Transaction Failed!!!");
						System.out.println("Accout Balance is::" + savings.getBalance());
					}
					break;
				} else {
					System.out.println("Enter the withdraw amount:");
					double withdrawAmount = scanner.nextDouble();
					scanner.nextLine();
					boolean status = current.withdraw(withdrawAmount);
					if (status) {
						System.out.println("Your Transaction is Successfull!!!");
						System.out.println("Accout Balance is::" + current.getBalance());
					} else {
						System.out.println("Transaction Failed!!!");
						System.out.println("Accout Balance is::" + current.getBalance());
					}
					break;
				}

			case 2:
				if (accountStatus) {
					System.out.println("Enter the deposit amount:");
					double depositAmount = scanner.nextDouble();
					scanner.nextLine();
					boolean status = savings.deposit(depositAmount);
					if (status) {
						System.out.println("Your Transaction is Successfull!!!");
						System.out.println("Savings Account Balance is ::" + savings.getBalance());
					} else {
						System.out.println("Transaction Failed!!!");
						System.out.println("Savings Account Balance is ::" + savings.getBalance());
					}
					break;
				} else {
					System.out.println("Enter the deposit amount:");
					double depositAmount = scanner.nextDouble();
					scanner.nextLine();
					boolean status = current.deposit(depositAmount);
					if (status) {
						System.out.println("Your Transaction is Successfull!!!");
						System.out.println("Current Account Balance is ::" + current.getBalance());
					} else {
						System.out.println("Transaction Failed!!!");
						System.out.println("Current Account Balance is ::" + current.getBalance());
					}
					break;
				}
			case 3:
				if (accountStatus) {
					System.out.println("Account Balance is ::" + savings.getBalance());
					break;
				} else {
					double total = current.getBalance() + current.getOverdraftBalance();
					System.out.println("Account Balance is :" + total);
					break;
				}
			default:
				System.out.println("Enter the Valid Options");
				break;
			}
			System.out.println("Want to Continue yes or no ?");
			continuechoice = scanner.next();
		} while (continuechoice.equalsIgnoreCase("yes"));

		System.out.println("Thank You!!!");
	}
}
