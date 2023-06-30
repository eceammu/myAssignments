package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// Find Second Largest Number
		System.out.println("PROGRAM To Find Second Largest Number");
		int[] data = {3,2,11,4,6,7};
Arrays.sort(data);
System.out.println("Second Largest Element in the array is:"+ data[data.length-2]);


	}

}
