package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindHappyNumber_Ex3 
{

	public static void main(String[] args) 
	{
		/*
		Java Challenge (3/20)

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Example 2:

Input: n = 2
Output: false
Explanation:
2*2=4
4*4=16
1*1+6*6=37
3*3+7*7=58
5*5+8*8=89
8*8+9*9=145
1*1+4*4+5*5=42
4*4+2*2=20
2*2+0*0=4
Cycle Repeats..............
-------------------------------------------------------------------
*/
		 
System.out.println("Enter the number to check happy number");
Scanner obj=new Scanner(System.in);		
int n=obj.nextInt();
int sum;
int digit=0;
boolean isHappy=false;
for(int i=0;i<100;i++)
{
	sum=0;
	do
	{
		digit=n%10;
		//System.out.println("Digit is :"+digit);
		sum=sum+(digit*digit);
		n=n/10;
		}while(n!=0);
	//System.out.println("Sum is :"+sum);
	n=sum;
	if(sum==1)
	{
		isHappy=true;
		break;
	}
		
	}
System.out.println("Output");
System.out.println("*******");
System.out.println("Return true if n is a happy number, and false if not : "+isHappy);
		obj.close();

	}

}
