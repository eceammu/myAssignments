package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;

public class SortingWordsUsingCollection {

	public static void main(String[] args) {
		String compayNames[]= {"Google","Microsoft","Apple","TestLeaf","ZeeTV","Maverick"};
		Arrays.sort( compayNames, Collections.reverseOrder());
System.out.println(Arrays.toString(compayNames));
	}

}
