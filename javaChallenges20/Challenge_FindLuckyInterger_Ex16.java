package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindLuckyInterger_Ex16 
{

	public static void main(String[] args) 
	{
		/*
		Java Problem (16/20)

Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1. 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
---------------------------------------------------------------------
		 */
Scanner obj=new Scanner(System.in);
System.out.println("Enter the Size of Interger Array");
int size=obj.nextInt();
int[] arr=new int[size];
System.out.println("Enter Array Elements");
   for(int i=0;i<size;i++)
   {
	arr[i]=obj.nextInt();
	}
   int luckyNumberMax=0;
   boolean isLuckyNumberPresent=false;
   for(int i=0;i<size;i++)
   {
	   int count=0;
	   int value=arr[i];
	   for(int j=0;j<size;j++)
	   {
		   if(arr[j]==value)
			   count++;
		   if(j==(size-1))
		   {
			   if(value==count)
			   {
				  isLuckyNumberPresent=true;
				   System.out.println(value+" is a lucky integer that has a frequency in the array equal to its value");
				   if(count>luckyNumberMax)
					   luckyNumberMax=value;
			   }
		   }
	   }
	  
   }
   System.out.println("Output");
   System.out.println("*******");
   if(isLuckyNumberPresent)
   System.out.println("Largest lucky integer in the array :"+luckyNumberMax);
   else
   {
	   System.out.println("-1,There are no lucky numbers in the array.");
   }
	   
   obj.close();
	}

}
