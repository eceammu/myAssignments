package javaChallenges20;

import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Challenge_FindSumOfAllUniqueElementsOfArray_Ex17 
{

	public static void main(String[] args) 
	{
		/*
		 Java Problem (17/20)

You are given an integer array nums. The unique elements of an array are the elements that appear 
exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
		 */
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size of Interger Array");
		int size=obj.nextInt();
		int[] nums=new int[size];
		System.out.println("Enter Array Elements");
		   for(int i=0;i<size;i++)
		   {
			nums[i]=obj.nextInt();
			}
		   boolean isUniquePresent=false;
		   int sum=0;
		   for(int i=0;i<size;i++)
		   {
			   int count=0;
			   int value=nums[i];
			   for(int j=0;j<size;j++)
			   {
				   if(nums[j]==value)
					   count++;
			   }
			   if(count==1)
			   {
				   isUniquePresent=true;
				   System.out.println("The unique element is :"+value);
				   
				   sum=sum+value;
			   }
		}
		   System.out.println("Output");
		   System.out.println("*******");
		   if(isUniquePresent)
			   System.out.println("The sum of all the unique elements of nums :"+sum);
		   else
			   System.out.println("There are no unique elements, and the sum is 0.");
			   
	}

}
