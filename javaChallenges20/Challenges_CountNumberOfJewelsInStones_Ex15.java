package javaChallenges20;

import java.util.Scanner;

public class Challenges_CountNumberOfJewelsInStones_Ex15 
{

	public static void main(String[] args) 
	{
		/*
		 Java Problem (15/20)

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
		 */
Scanner obj=new Scanner(System.in);
System.out.println("Enter String jewels");
String jewels=obj.nextLine();
System.out.println("Enter String stones");
String stones=obj.nextLine();
int count=0;
for(int i=0;i<stones.length();i++)
{
	for(int j=0;j<jewels.length();j++)
	{
		if(stones.charAt(i)==jewels.charAt(j))
			count++;
	}
	}
System.out.println("Output");
System.out.println("*******");
System.out.println("count :"+count);
	}

}
