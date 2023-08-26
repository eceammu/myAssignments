package interview25Problems;

import java.util.Scanner;

public class Ex2OddOrEven 
{
	public static void main(String[] args) 
	{
        //Program To Find Odd Or Even
		System.out.println("Interview Program 2");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number To Find Odd Or Even");
		int number=obj.nextInt();
		if((number%2)==0)
		{
			System.out.println("Given Number is a EVEN number");
		}
		else
			
		{
			System.out.println("Given Number is a ODD number");
		}
		obj.close();
	}

}
