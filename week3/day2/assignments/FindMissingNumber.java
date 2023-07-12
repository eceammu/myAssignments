package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingNumber {
	public static void main(String[] args) 
	{
		 int[] a={3,2,4,6,7,1,10,8,4,1,3,9};
		 System.out.println("Input Array is:");
		 for (int i = 0; i < a.length; i++)
		 {
			
			 System.out.print(a[i]+" ");
		}
		 
		 Set<Integer> sortedSet = new TreeSet<Integer>();
		 Set<Integer> missingSet = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			sortedSet.add(a[i]);
		}
		System.out.println();
		System.out.println("Sorted Set is:");
		System.out.println(sortedSet);
		for (int j = 1; j <=10; j++)
		{
			if(!(sortedSet.contains(j)))
			{
				missingSet.add(j);
				j=j+1;
			}
		}
		System.out.println("Missing Number :"+missingSet);
	}
}
