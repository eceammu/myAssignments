package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindSquareRoot_Ex1
{
/*
 * Java Challenge (1/20)

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
s
Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
------------------------------------------------------------------------------------------------------------------------------------------
 */
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a Integer x: ");
	int x=obj.nextInt();
	System.out.println("Given Number to Find Square Root iS:"+x);
	int rootValue;
	for(int i=1;i<=x;i++)
	{
		if((i*i)==x)
		{
			rootValue=i;
			System.out.println("Output");
			System.out.println("*******");
			System.out.println("Square Root of X="+x+" is:"+rootValue );
			break;
		}
		else 
			if((i*i)>x)
			{
				rootValue=i-1;
				System.out.println("Output");
				System.out.println("*******");
				System.out.println("Square Root of X="+x+" is:"+rootValue );
				break;
			}
	}
	obj.close();
	}
}