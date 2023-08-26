package interview25Problems;

import java.util.Scanner;

public class Ex12LargestOfThreeNumbers {

	public static void main(String[] args) {
		// Program To Find Largest Of Three Numbers
		System.out.println("Interview Program To Find Largest Of Three Numbers");
		System.out.println("**************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter Number a");
		int a=obj.nextInt();
		System.out.println("Please enter Number b");
		int b=obj.nextInt();
		System.out.println("Please enter Number c");
		int c=obj.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a "+a+" is Largest Of Three Numbers");
			}
			else
			{
				System.out.println("c "+c+" is Largest Of Three Numbers");
			}
		}
	else
	{
		if(b>c)
		{
			System.out.println("b "+b+" is Largest Of Three Numbers");
		}
		else
		{
			System.out.println("c "+c+" is Largest Of Three Numbers");
		}
	}
obj.close();
}
}
