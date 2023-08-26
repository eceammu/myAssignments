package javaChallenges20;

import java.util.Scanner;

public class Challenge_FindLengthOfLastWord_Ex8 
{
	public static void main(String[] args) 
	{
		/*              Java Challenge (8/20)

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.


Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
-------------------------------------------------------------
*/
System.out.println("Enter a String");
Scanner obj=new Scanner(System.in);
String s=obj.nextLine();
s=s.trim();
String lastWord="";
int size=s.length();
System.out.println("Size : "+size);
obj.close();
//char[] charArray=new char[size];

for(int i=size-1;i>=0;i--)
{
	System.out.println("i "+i+"is "+s.charAt(i));
	if(Character.isWhitespace(s.charAt(i)))
	{
		lastWord=s.substring(i+1, size);
		System.out.println(lastWord);
		break;
	}
		
}
System.out.println("Output");
System.out.println("*******");
System.out.println("The last word is "+lastWord+" with length "+lastWord.length());
}
}
