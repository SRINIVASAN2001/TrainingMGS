package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.service.loginService;
import com.mindgate.service.loginServiceInterface;

public class LoginDetailsMain {

	public static void main(String[] args) {

		loginServiceInterface loginServiceInterface = new loginService();

		Scanner scanner = new Scanner(System.in);

		System.out.println("--> LOGIN DETAILS <--");
		System.out.println("-------------------------------");
		System.out.println("Enter the Login ID: ");
		String loginId = scanner.next();
		System.out.println("Enter the password");
		String password = scanner.next();
		System.out.println("-------------------------------");

		String res = loginServiceInterface.validateLoginDetails(loginId, password);
		if (loginServiceInterface.checkLoginCount()!=3) {
			if(res != null)
				System.out.println("Hello " + res + " Welcome Back!!");
			else
				System.out.println("!!!INVALID USERNAME/PASSWORD!!!");
		} else {
			System.err.println("!!!You Exceeded your limit!!!");
		}
	}

}
