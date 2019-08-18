//WAP to Display Prime Number Between 1 to 100..

class PrimeNumbers
{
   public static void main (String[] args)
   {		
	int i,j;
	boolean isPrime=true;
       for ( i = 1; i <= 100; i++)         
       { 		  	  
         
          for( j=2; j<i; j++)
	  {
             if(i%j==0)
	     {
 		isPrime=false;
		break;
	     }
	  }
	}
	
	  if (isPrime==true)
	{
		//System.out.println("prime number between 1 to 100");
		System.out.println(i+" ");
	}
	
   }
}