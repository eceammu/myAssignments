package javaChallenges20;

import java.util.Scanner;

public class Challenges_ReconstructOriginalSentenceFromWords_Ex13 {

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
		String str="";
		for(int j=1;j<=9;j++)
		{
			for(int i=0;i<words.length;i++)
			{
				String digit=Integer.toString(j);
				if(words[i].endsWith(digit))
				{
					System.out.println("hi "+words[i]);
					char[] charArray=words[i].toCharArray();
					
					for(int k=0;k<charArray.length;k++)
					{
						if (!Character.isDigit(charArray[k])) 
							str=str+charArray[k];
						if(k==charArray.length-1)
							str=str+" ";
					}
				}
			}
			
		}
		str=str.trim();
		System.out.println("Output");
		System.out.println("*******");
		System.out.println("Original sentence :"+str);
		obj.close();
	}

}
