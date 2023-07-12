package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		String sentence="We learn java basics as part of java sessions in java week1";
		Set<String> unique = new LinkedHashSet<String>();
		String[] allwords=null;
		allwords=sentence.split(" ");
		//System.out.println(allwords[0]);
		for(int i=0; i<allwords.length; i++)
		{

			unique.add(allwords[i]);
			
		}
		System.out.println(unique);
		
		}
	}


