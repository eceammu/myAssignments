package interview25Problems;

import java.util.Scanner;

public class Ex4FactorialOfGivenNumber 
{

	public static void main(String[] args) 
	{
		        // Program To find Factorial Of Given Number
				long factorial=1;
				System.out.println("Interview Question 4:Program To find Factorial Of Given Number");
				System.out.println("***************************************************************");
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter a number(To find Factorial Of Given Number)");
				int number=obj.nextInt();
				for(int i=number;i>=1;i--)
				{
					factorial=factorial*i;
				}
				System.out.println("Factorial Of Number"+number +" is :"+factorial);
				obj.close();
	}

}
