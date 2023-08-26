package interview25Problems;

import java.util.Scanner;

public class Ex13SmallestOfThreeNumbers {

	public static void main(String[] args) 
	{
		// Program To Find Smallest Of Three Numbers
				System.out.println("Interview Program To Find Smallest Of Three Numbers");
				System.out.println("**************************************************");
				Scanner obj=new Scanner(System.in);
				System.out.println("Please enter Number a");
				int a=obj.nextInt();
				System.out.println("Please enter Number b");
				int b=obj.nextInt();
				System.out.println("Please enter Number c");
				int c=obj.nextInt();
				if(a<b)
				{
					if(a<c)
					{
						System.out.println("a "+a+" is Smallest Of Three Numbers");
					}
					else
					{
						System.out.println("c "+c+" is Smallest Of Three Numbers");
					}
				}
				else
				{
					if(b<c)
					{
						System.out.println("b "+b+" is Smallest Of Three Numbers");
					}
					else
					{
						System.out.println("c "+c+" is Smallest Of Three Numbers");
					}
					
				}
obj.close();
	}
}
