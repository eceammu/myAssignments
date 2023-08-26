package javaChallenges20;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_FindMaximumNumberOfWords_Ex12 
{
	public static void main(String[] args) 
	{
		/*
		Java Problem (12/20)

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

Example 1:
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.

Example 2:
Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.


-------------------------------------------------------------------------------------------------------
		 */
	int maximumNumberOfWords=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of String Sentences");
	int size=obj.nextInt();
	//String[] sentences =new String[size];
	String [] sentences=new String[size];
	System.out.println("Enter "+size +" Sentences");
	obj.nextLine();
	for(int i=0;i<size;i++)
	{
		sentences[i]=obj.nextLine();	
	}
	for(int i=0;i<size;i++)
	{
		System.out.print("["+sentences[i]+"]");			
	}
	System.out.println();
	for(int i=0;i<size;i++)
	{
		String words[]=sentences[i].split(" ");
		int count=words.length;
		System.out.println("Sentence "+i+" has "+count+" words in total.");
		if(count>maximumNumberOfWords)
		{
			maximumNumberOfWords=count;
		}
		//Arrays.fill(words, "");	
	}
	System.out.println("Output");
	System.out.println("*******");
	System.out.println(maximumNumberOfWords);
	System.out.println("Expalanation:Maximum number of words in a single sentence :"+maximumNumberOfWords);
	}
}
