package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindFirstNonrepaetingCharacterIndex_Ex10 
{
	public static void main(String[] args) 
	{
		/*
		 Java Problem (10/20)

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
leetcode
Output: 0
Example 1:

Input: s = ""
Output: 0
Example 2:


Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
----------------------------------------------------------------------------------------------------
		 */
		System.out.println("Enter a String");
		Scanner obj=new Scanner(System.in);
		String sentence=obj.nextLine();
		char ch;
		int count;
		boolean flag=false;
		for(int i=0;i<sentence.length();i++)
		{
			ch=sentence.charAt(i);
			count=0;
			for(int j=0;j<sentence.length();j++)
			{
				if(ch==sentence.charAt(j))
				{
					count++;
					//System.out.println(ch+"i "+i+sentence.charAt(j)+"j"+j);
					//continue;
				}
			}
				System.out.println(ch+" "
						+ "occurs "+count+" times in the given sentence");
				if(count==1)
				{
					System.out.println("Output");
					System.out.println("*******");
					System.out.println("First non-repeating character in the given string \""+sentence+"\" is :"+ch+" and its index is :"+i);
					flag=true;
					break;
				}		
		}
		if(flag==false)
		{
			System.out.println("Output");
			System.out.println("*******");
			System.out.println("Zero non-repeating character in the given String :so return -1");
		}
			
	}

}
