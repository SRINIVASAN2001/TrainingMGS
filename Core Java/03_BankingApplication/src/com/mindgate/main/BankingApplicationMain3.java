package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.domain.Account;

public class BankingApplicationMain3 {

	public static void main(String[] args) {

		System.out.println("Main Start");
		
		String continuechoice="";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Account number:");
		int accNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name:");
		String Name = scanner.nextLine();
		System.out.println("Enter the balance:");
		double balance = scanner.nextDouble();
		scanner.nextLine();

		Account account = new Account();
		account.setaccountNumber(accNumber);
		account.setName(Name);
		account.setbalance(balance);

		do {
			System.out.println("Choose Options!!!");
			System.err.println("1.Withdraw");
			System.err.println("2.Deposit");
			System.err.println("3.Check Balance");

			int options = scanner.nextInt();

			switch (options) {
			case 1:
				System.out.println("Enter the withdraw amount:");
				double amount1 = scanner.nextDouble();
				scanner.nextLine();
				boolean status = account.withdraw(amount1);
				if (status) {
					System.out.println("Your Transaction is Successfull!!!");
					System.out.println("Accout Balance is::" + account.getBalance());
				} else {
					System.out.println("Transaction Failed!!!");
					System.out.println("Accout Balance is::" + account.getBalance());
				}
				break;
			case 2:
				System.out.println("Enter the deposit amount:");
				double amount2 = scanner.nextDouble();
				scanner.nextLine();
				status = account.withdraw(amount2);
				if (status) {
					System.out.println("Your Transaction is Successfull!!!");
					System.out.println("Account Balance is ::" + account.getBalance());
				} else {
					System.out.println("Transaction Failed!!!");
					System.out.println("Account Balance is ::" + account.getBalance());
				}
				break;
			case 3:
				System.out.println("Account Balance is ::" + account.getBalance());
				break;
			default:
				System.out.println("Enter the Valid Options");
				break;
			}
			System.out.println("Want to Continue yes or no ?");
			continuechoice=scanner.next();
		} while (continuechoice.equalsIgnoreCase("yes"));

	}

}
