package com.mindgate.main;

import java.util.Scanner;

public class HelloWorldMain 
{
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		
		String message="Mindgate java training";
		System.out.println(message);
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter your messsage");
		message=scanner.nextLine();
		System.out.println("Message Entered::"+message);

	}

}
