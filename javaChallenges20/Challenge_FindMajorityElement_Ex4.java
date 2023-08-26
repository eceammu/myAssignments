package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindMajorityElement_Ex4 
{
	public static void main(String[] args) 
	{
		/*
		 Java Problem (4/20)

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than n / 2 times. 
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
		int occurence=0;
		int count;
		System.out.println("Enter  the size of array");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if((n%2)==0)
			occurence=n/2;
		else
			occurence=n/2+1;
		System.out.println("Majority Occurence Value of array "+occurence);
		int[] nums=new int[n];
		System.out.println("Assume that the majority element always exists in the array");
		System.out.println("Enter Eelements in the array");
		for(int i=0;i<n;i++)
		{
			nums[i]=obj.nextInt();
		}
		int y;
		for(int i=0;i<n;i++)
		{
			y=nums[i];
			count=0;
			for(int j=0;j<n;j++)
			{
				if(y==nums[j])
					count++;
			}
			System.out.println("y "+y +" occurs "+count+" times in the given array");
			if(count>=occurence)
			{
				System.out.println("Output");
				System.out.println("*******");
				System.out.println("The majority element is "+y+" ,it occures "+count +" times in the givn array");
				break;
			}
			
		}
	}
	

}
