package week1.day1;

public class FindNumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int number,i;
		int elseLoopEnter=0;
		number=11;
		System.out.println("Given number to find out, it is prime or not is " +number);
		for(i=2;i<(number);i++)
		{
			if((number%i)==0)
{
				
				System.out.println ("given number "+number+" is divisible by  "+i+" so ,the number is NOT PRIME ");
		}
			
			else
			{
				System.out.println ("given number "+number+" is  not divisible by  "+i );
				elseLoopEnter=2;
			}
		}
		if (elseLoopEnter==2)
		System.out.println (" so ,the number is  PRIME ");
		

	}

}
