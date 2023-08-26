package javaChallenges20;

import java.util.Scanner;

public class Challenges_CompareConatenatedStringsForEquality_Ex14 {

	public static void main(String[] args) {
		/*
		 Java Problem (14/20)

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
		 */

	boolean isEqual=false;
	String[] word1=new String[2];
	String[] word2=new String[2];
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter String values for arrays word1 and word2");
	word1[0]=obj.nextLine();
	word1[1]=obj.nextLine();
	word2[0]=obj.nextLine();
	word2[1]=obj.nextLine();
    String s1,s2;
    s1=word1[0].concat(word1[1]);
    s2=word2[0].concat(word2[1]);
    System.out.println("Combined String1 :"+s1);
    System.out.println("Combined String2 :"+s2);
    if(s1.equalsIgnoreCase(s2))
    	isEqual=true;
    System.out.println("Output");
	System.out.println("*******");
	System.out.println(" return true if the two arrays represent the same string, and false otherwise.");
	System.out.println(isEqual);
}
}
