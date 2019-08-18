//WAP to Find the Factorial of Number using Recursive Function..
package com.hefshine.variable;

import java.util.Scanner;

public class FactorialRecursion
{

	static int fact(int number)
	{
		if(number==0)
		{
			return 1;
		}
		else
		{
			return (number*fact(number-1));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number..");
		int num=sc.nextInt();
		
		int factorial=fact(num);
		
		System.out.println("Factorial of "+num+" is "+factorial);
		
		

	}

}
