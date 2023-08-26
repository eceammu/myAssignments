package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindSingleOccurenceElementArray_Ex2 
{
/*             Java Challenge (2/20)

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */
public static void main(String args[])
{
	System.out.println("Enter the size of Array");
	Scanner obj=new Scanner(System.in);
	int size=obj.nextInt();
	int[] nums=new int[size];
	System.out.println("Enter the elements of Array");
	for(int i=0;i<size;i++)
	{
		nums[i]=obj.nextInt();
	}

int count,answer;
answer=0;
for(int i=0;i<size;i++)
{
	int y=nums[i];
	count=0;
	System.out.println("y "+y);
	for(int j=0;j<size;j++)
	{
	if(y==nums[j])
	{
		count++;
	}
}
	System.out.println("count "+count);
	if(count==1)
		answer=y;
}
System.out.println("Output");
System.out.println("*******");
System.out.println("single one in the non-empty array of integers is: "+answer);
}
}
