package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		List<Integer> unsortedList = new ArrayList<>();
		unsortedList.add(3);
		unsortedList.add(2);
		unsortedList.add(11);
		unsortedList.add(4);
		unsortedList.add(6);
		unsortedList.add(7);
		System.out.println("Unsorted List: "+unsortedList);
		//Collections.sort(unsortedList);
		Collections.sort(unsortedList);
		System.out.println("Sorted List: "+unsortedList);
		System.out.println("Second Largest Number is: "+unsortedList.get(unsortedList.size()-2));
		
	}

}
