
//WAP to check whether Given Number is Prime or not.

import java.util.Scanner;

class PrimeNum
{
   public static void main(String args[])
   {		
	
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");       //capture the input in an integer
	
	int num=scan.nextInt();
      
	for(int i=2;i<num;i++)
	{
           
	   if(num%i==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}