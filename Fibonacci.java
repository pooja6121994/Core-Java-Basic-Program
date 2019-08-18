//WAP to generate Fibonacci series...

import java.util.Scanner;

class Fibonacci
{
	public static void main(String args[])
	{
		int n=10;
		int t1=0,t2=1;
		int sum=0;
		int i=1;

		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter any number");
		//int num=sc.nextInt();
		//int temp=num;

		while(i<=n)
		{
			System.out.print(t1+ " ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
			i=i+2;

			
		}
	
	}
}