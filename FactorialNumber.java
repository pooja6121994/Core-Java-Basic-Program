
//WAP to Find the Factorial of Given Number..
import java.util.Scanner;

class FactorialNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number ");
		int num=sc.nextInt();

		int fact=1;

		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial is "+fact);
	
	
	}
}