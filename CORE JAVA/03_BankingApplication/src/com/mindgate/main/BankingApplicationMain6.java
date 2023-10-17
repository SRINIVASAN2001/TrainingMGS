package com.mindgate.main;
import java.util.Scanner;

import com.mindgate.domain.Current;

public class BankingApplicationMain6 {

	public static void main(String[] args) {
		Current current=new Current(101, "Srini",10000, 50000);
		
		System.err.println("----------USER INFORMATION-------");
		System.out.println("Accunt number = "+current.getAccountNumber());
		System.out.println("Name = "+current.getName());
		System.out.println("Initial Balance = "+current.getBalance());
		System.out.println("Initial Overdraft Balance = "+current.getOverdraftBalance());
		System.out.println();
		
//		System.out.println();
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the amount: ");
//		//double amount=scanner.nextDouble();
//		//boolean result=current.withdraw(amount);
//		//if(result)
//		//{
////			System.out.println(result);
////			System.out.println("Balance = "+current.getBalance()); //5000
////			System.out.println("Overdraft Balance = "+current.getOverdraftBalance());//50000
////		}
		
//		System.out.println();
//		System.out.println("withdraw = 500");
//		current.withdraw(500);
//		System.out.println("Balance = "+current.getBalance());
//		System.out.println("Overdraft Balance = "+current.getOverdraftBalance());

        System.out.println("-----------WITHDRAW--------------");
        System.out.println("---------------------------------");
        System.out.println("withdraw=5000");
        current.withdraw(5000);
        System.out.println("Balnce= "+current.getBalance());//5000
        System.out.println("OverdraftBalance="+current.getOverdraftBalance());//50000
        
        System.out.println("");
        System.out.println("withdraw=15000");
        current.withdraw(15000);
        System.out.println("Balnce= "+current.getBalance());//0
        System.out.println("OverdraftBalance="+current.getOverdraftBalance());//40000
        
        System.out.println(" ");
        System.out.println("withdraw=5000");
        current.withdraw(5000);
        System.out.println("Balnce= "+current.getBalance());//0
        System.out.println("OverdraftBalance="+current.getOverdraftBalance());//35000
        
        
        System.out.println("--------DEPOSIT------------------");
        System.out.println("---------------------------------");
        System.out.println("deposit=5000");
        current.deposit(5000);
        System.out.println("Balance= "+current.getBalance());//0
        System.out.println("OverdraftBalance="+current.getOverdraftBalance());//40000
        
        System.out.println(" ");
        System.out.println("deposit=20000");
        current.deposit(20000);
        System.out.println("Balance= "+current.getBalance());//10000
        System.out.println("OverdraftBalance="+current.getOverdraftBalance());//50000
        
        System.out.println(" ");
        System.out.println("deposit=5000");
        current.deposit(5000);
        System.out.println("Balance= "+current.getBalance());//15000
        System.out.println("OverdraftBalance="+current.getOverdraftBalance());//50000
		
		System.out.println("---------------------------------------------------");
		
		
	}

}
