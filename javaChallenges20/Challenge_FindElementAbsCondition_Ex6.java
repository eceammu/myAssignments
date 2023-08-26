package javaChallenges20;
import java.util.Scanner;
public class Challenge_FindElementAbsCondition_Ex6 
{
	public static void main(String[] args) 
	{
		/*               
		                    Java Problem (6/20)
		 

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

------------------------------------------------------------------------------------------
*/
		boolean flag=false;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=obj.nextInt();
		int[] nums=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		{
			nums[i]=obj.nextInt();
		}
		System.out.println("Enter the value of k");
		int k=obj.nextInt();
		for(int i=0;i<size;i++)
		{
			int y=nums[i];
			for(int j=i+1;j<size;j++)
			{
				if(y==nums[j])
				{
					System.out.println("Value of i :"+i+" and Value of j is :"+j);
					System.out.println("nums["+i+"] and nums["+j+"] has value :"+y);
					int diff=i-j;
					if(diff<0)
						diff=(-diff);
					System.out.println("abs(i-j) ="+diff);
					if(diff<=k)
					{
						flag=true;
						break;
					}
				}
			}
		}
		System.out.println("Return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.");
		System.out.println("Output");
		System.out.println("*******");		
		System.out.println(flag);
		obj.close();
	}

}













