package javaChallenges20;
import java.util.Scanner;

public class Challenge_RemoveNonalphanumericToFindPalindrome_Ex9 {

	public static void main(String[] args) {
		/*
		Java Challenge (9/20)

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
----------------------------------------------------------------------------------------
		 */
System.out.println("Enter a String");
Scanner obj=new Scanner(System.in);
String sentence=obj.nextLine();
sentence=sentence.replaceAll("[^A-Za-z0-9]","");
System.out.println("Given sentence :"+sentence);
String reverse="";
     for(int i=sentence.length()-1;i>=0;i--)
    {
	     reverse=reverse+sentence.charAt(i);
	}
     System.out.println("reverse sentence is:"+reverse);
     if(sentence.equalsIgnoreCase(reverse))
     {
    	 System.out.println("true");
         System.out.println("Explanation: \""+sentence+"\" is a palindrome.");
     }
     else
     {
    	 System.out.println("Falsee");
         System.out.println("Explanation: \""+sentence+"\" is NOT a palindrome.");
     }
	}
}
