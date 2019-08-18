//WAP to check Given number is Palindrome or Not..

import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int digit=0,rev=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=sc.nextInt();

		int temp=num;
		while(num>0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if(temp==rev)

		System.out.println(rev+ " is palinddrome");

		else

		System.out.println(rev +"is not palindrome");
	}
}