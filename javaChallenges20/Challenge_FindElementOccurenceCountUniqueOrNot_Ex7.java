package javaChallenges20;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_FindElementOccurenceCountUniqueOrNot_Ex7 
{

	public static void main(String[] args) {
		/*
		 Java Problem (7/20)

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
		 */
		System.out.println("Enter the size of array");
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		boolean[] visited=new boolean[size];
		Arrays.fill(visited, false);
		int[] noOfOccur=new int[size];
		Arrays.fill(noOfOccur, 0);
	    System.out.println("Enter the array Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		int occurence,y;
		for(int i=0;i<size;i++)
		{
			if(visited[i]==true)
				continue;
			y=arr[i];
			occurence=1;
			for(int j=i+1;j<size;j++)
			{
				if(y==arr[j])
				{
					occurence++;
					visited[j]=true;
				}
			}
			System.out.println(y+" occurs "+occurence+" times in the given array");	
			noOfOccur[i]=occurence;
		}
		boolean isUniqueFlag=true;
		for(int i=0;i<size;i++)
		{
			System.out.println("noOfOccur["+i+"] is :"+noOfOccur[i]);
			if(noOfOccur[i]!=0)
			{
				for(int j=i+1;j<size;j++)
					if(noOfOccur[i]==noOfOccur[j])
					{
						isUniqueFlag=false;
				        break;
					}	
			}
		}
		System.out.println("return true if the number of occurrences of each value in the array is unique, or false otherwise.");
		System.out.println("Output");
		System.out.println("*******");
		System.out.println(isUniqueFlag);
		obj.close();
	}

}
