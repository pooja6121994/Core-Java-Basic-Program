//WAP to check given number is Armstrong number or not..
import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int r=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(temp==sum)
		System.out.println(sum+ " is armstrong");
		else
		System.out.println(sum +"is not armstrong");
	}
}