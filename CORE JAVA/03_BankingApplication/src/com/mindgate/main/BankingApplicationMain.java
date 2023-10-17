package com.mindgate.main;

import com.mindgate.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		System.out.println("---------------------------------");
//		Account account=new Account();
//		account.accountNumber=101; //private
		
		
		Account account1 =new Account();
		account1.setaccountNumber(1012);
		account1.setName("Rajesh");
		account1.setbalance(15000);
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getName());
		System.out.println(account1.getBalance());
		
		Account account2 =new Account();
		account2.setaccountNumber(1012);
		account2.setName("Ashwin");
		account2.setbalance(20000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
		
		Account account3 =new Account();
		account3.setaccountNumber(103);
		account3.setName("Vijay");
		account3.setbalance(30000);
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getName());
		System.out.println(account3.getBalance());
		
		System.out.println("---------------------------------");
		
			System.out.println("MAIN END");
	}

}
