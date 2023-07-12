package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

 int[] a={3,2,11,4,6,7};
 int[] b={1,2,8,4,9,7};
 List<Integer> aList = new ArrayList<>();
 List<Integer> bList = new ArrayList<>();
 
 for(int i=0;i<a.length;i++)
 {
	 aList.add(a[i]);
 }
 for(int j=0;j<b.length;j++)
 {
	 bList.add(b[j]);
	 
 }
	
 System.out.println("aList "+aList);
	System.out.println("bList "+bList);
	bList.retainAll(aList);        
	System.out.println("Common elements in both list: ");  
	System.out.println(bList);  
	}

}
