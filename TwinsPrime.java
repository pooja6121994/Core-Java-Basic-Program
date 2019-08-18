
//Display 1 to 100 Twins Prime Number
package com.hefshine.variable;

public class TwinsPrime 
{

	public static void main(String[] args) 
	{
		int  LastPrime=1;
		int j;
		for(int i=2;i<=100;i++)
		{
			for( j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				if((i-LastPrime)==2)
				{
					System.out.println("("+(i-2)+","+i+")");
				}
				LastPrime=i;
			}
		}
		

	}

}


