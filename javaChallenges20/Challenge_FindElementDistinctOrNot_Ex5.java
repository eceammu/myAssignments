package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindElementDistinctOrNot_Ex5 
{
	public static void main(String[] args) 
	{
		/*
		 Java Problem (5/20)

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
		boolean isOccursMoreThanTwice=false;
		int count;
		System.out.println("Enter  the size of array");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter Elements in the array");
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
			if(count>1)
			{
				isOccursMoreThanTwice=true;
				break;
			}
	}
		System.out.println("Output");
		System.out.println("*******");
		System.out.println("Given an integer array nums, return true if any value appears at least twice in the array,");
		System.out.println(" and return false if every element is distinct. RETURN VALUE :"+ isOccursMoreThanTwice);
	}
}
