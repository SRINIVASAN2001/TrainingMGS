package com.mindgate.main;

import com.mindgate.domain.Account;

public class BankingApplicationMain4 {

	public static void main(String[] args) {
		
		
		System.out.println("******************");
		Account account=new Account();
		new Account(); //Temporary purpose we can call it directly(one time)
		
		Account account1=new Account(101,"Srini",10000); //parameterized
		System.out.println("******************");
	}
	
	
//	alt +shift +s then enter "o" to open para constructor
//
//	alt +shift + s then enter "r" to open getter and setters
//
//	ctrl + space then enter to open default constructor
//
//	ctrl + shift + f to align the text

}
