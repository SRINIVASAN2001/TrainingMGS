package com.mindgate.util;

public class Calculations {
	public int addition (int number1,int number2)
	{
		System.out.println("Number1 :"+number1);
		System.out.println("Number2 :"+number2);
		
		int result=number1 + number2;
//		System.out.println("Addition is: "+result);
		return result;
	}
	
	public int subtraction (int number1,int number2)
	{
		System.out.println("Number1 :"+number1);
		System.out.println("Number2 :"+number2);
		
		int result=number1 - number2;
//		System.out.println("Subtraction is: "+result);
		return result;
	}
	
	public int multiplication (int number1,int number2)
	{
		System.out.println("Number1 :"+number1);
		System.out.println("Number2 :"+number2);
		
		int result=number1 * number2;
//		System.out.println("Multiplication is: "+result);
		return result;
	}
	
	public int division (int number1,int number2)
	{
		System.out.println("Number1 :"+number1);
		System.out.println("Number2 :"+number2);
		
		int result=number1 / number2;
//		System.out.println("Division is: "+result);
		return result;
	}
}
