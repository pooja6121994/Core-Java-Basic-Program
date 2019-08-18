
//WAP to Reverse given number..
public class ReverseNum
{
	public static void main(String args[])
	{
		int n=12345;
		int reverse=0;
		while(n!=0)
		{
			
			reverse=reverse*10;
			reverse=reverse+ n%10;
			n=n/10;
			
		}
		System.out.println("Reverse number is="+reverse);
	}
}
