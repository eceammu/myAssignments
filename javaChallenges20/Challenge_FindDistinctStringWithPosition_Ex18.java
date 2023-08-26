package javaChallenges20;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_FindDistinctStringWithPosition_Ex18 
{

	public static void main(String[] args) 
	{
		/*
		 Java Problem (18/20)

A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned. 
Example 2:

Input: arr = ["aaa","aa","a"], k = 1
Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st string "aaa" is returned.
Example 3:

Input: arr = ["a","b","a"], k = 3
Output: ""
Explanation:
The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
--------------------------------------------------------------------------------------------------------------
		 */
		
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the Size of String Array");
			int size=obj.nextInt();
			String[] arr=new String[size];
			System.out.println("Enter String Elements");
			obj.nextLine();
			   for(int i=0;i<size;i++)
			   {
				arr[i]=obj.nextLine();
				}
			   System.out.println("Enter the value of k");
			   int k=obj.nextInt();
			   boolean isDistinctPresent=false;
			   String[] distinct=new String[size];
			   Arrays.fill(distinct, "");
			   int index=0;
			   for(int i=0;i<size;i++)
			   {
				   int count=0;
				   String str=arr[i];
				   for(int j=0;j<size;j++)
				   {
					   if(str.equals(arr[j]))
						   count++;
					   System.out.println("Count :"+count);
					   if(j==(size-1))
					   {
						   System.out.println("j :"+j);
						   if(count==1)
						   {
							   isDistinctPresent=true;
							   System.out.println("Unique :"+str);
							   distinct[index]=str;
							   //System.out.println(distinct[0]);
							   index++;
						   }
							   
					   }
				   }
				   
			   }
			   for(int i=0;i<size;i++)
			   {
				   System.out.println("distinct["+i+"]"+distinct[i]);
				   
			   }
			   System.out.println("Output");
			   System.out.println("*******");
			   if(isDistinctPresent)
			   System.out.println("Returned Distinct String :"+distinct[k-1]);
			   
	}
	}


