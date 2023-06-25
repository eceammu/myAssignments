package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args)
	
	{
		int firstNumber,secondNumber,sumOfTwo,i;
		firstNumber=0;
		secondNumber=1;
		System.out.println("Fibonacci Series is " );
		for(i=1;i<12;i++)
		{
			
		System.out.println(firstNumber );
		sumOfTwo=firstNumber+secondNumber;
		firstNumber=secondNumber;
		secondNumber=sumOfTwo;
	}
}
}
