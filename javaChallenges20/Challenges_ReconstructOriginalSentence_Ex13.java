package javaChallenges20;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Challenges_ReconstructOriginalSentence_Ex13 
{
	public static void main(String[] args) 
	{
		/*
		 Java Problem (13/20)

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", 
---------------------------------------------------------------------------------------------
		 */
		
		
		System.out.println("Enter Shuffled Sentence by appending numbers(starting from 1 to 9) in last-indexed word position ");
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		String[] words=s.split(" ");
		for(String i:words) 
		{
		System.out.println(i);	
		}
		List<String> values = new ArrayList<String>(Arrays.asList(words));

        System.out.println(values);
        Comparator<String> com = (o1,o2) -> {return comparator(o1,o2);}; //lambda expression

        Collections.sort(values,com);
        System.out.println("word "+values);


	}
	
	
	
	public static int comparator(String s1, String s2) {

        String[] pt1 = s1.split("((?<=[a-z])(?=[0-9]))|((?<=[0-9])(?=[a-z]))"); 
        String[] pt2 = s2.split("((?<=[a-z])(?=[0-9]))|((?<=[0-9])(?=[a-z]))"); 
//pt1 and pt2 arrays will have the string split in alphabets and numbers

        int i=0;
        if(Arrays.equals(pt1, pt2))
            return 0;
        else{
            for(i=0;i<Math.min(pt1.length, pt2.length);i++)
                if(!pt1[i].equals(pt2[i])) {
                    if(!isNumber(pt1[i],pt2[i])) {
                        if(pt1[i].compareTo(pt2[i])>0)
                            return 1;
                        else
                            return -1;
                    }
                    else {
                        int nu1 = Integer.parseInt(pt1[i]);
                        int nu2 = Integer.parseInt(pt2[i]);
                        if(nu1>nu2)
                            return 1;
                        else
                            return -1;
                    }
                }
        }

        if(pt1.length>i)
            return 1;
        else
            return -1;
    }

    private static Boolean isNumber(String n1, String n2) {
        // TODO Auto-generated method stub
        try {
            int nu1 = Integer.parseInt(n1);
            int nu2 = Integer.parseInt(n2);
            return true;
        }
        catch(Exception x) {
            return false;
        }

    }
	}
