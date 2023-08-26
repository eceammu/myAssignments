package javaChallenges20;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge_FindFirstLetterToAppearTwice_Ex11 
{

	public static void main(String[] args) 
	{
		/*
		 Java Problem (11/20)

Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.

Example 1:
Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.

Example 2:
Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
--------------------------------------------------------------------------------------------------------------
		 */
    System.out.println("Enter A String consisting of lowercase English letters and contain at least one letter that appears twice");
    Scanner obj=new Scanner(System.in);
    String s=obj.nextLine();
    char letter;
    int position;
    boolean[] visited=new boolean[s.length()];
	Arrays.fill(visited, false);
    for(int i=0;i<s.length();i++)
    {
    	if(visited[i]==true)
			continue;
    	letter=s.charAt(i);
    	for(int j=i+1;j<s.length();j++)
    	{
    		if(letter==s.charAt(j))
    		{
    			visited[j]=true;
    			position=j;
    		}
    			
    	}
    }
    for(int i=0;i<s.length();i++)
    {
    	System.out.println(visited[i]);
    	if(visited[i]==true)
    	{
    		System.out.println("Output");
			System.out.println("*******");
			System.out.println(s.charAt(i));
			System.out.println("Explanation:The letter '"+s.charAt(i)+"' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.");
    		break;
    	}
    }
	}

}
