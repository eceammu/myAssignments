package interview25Problems;

import java.util.Scanner;

public class Ex9FindPalindromeString {

	public static void main(String[] args) {
		//Program To Find Palindrome Or Not:STRING
		System.out.println("Interview Program To Find Palindrome Or Not:STRING");
		System.out.println("**************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string To  Check");
		String word=obj.nextLine();
		String reverse="";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse=reverse+word.charAt(i);
		}
System.out.println(reverse);
if(word.equalsIgnoreCase(reverse))//if(word.equals(reverse))
  {
	System.out.println("Given String is palindrome");
  }
else
{
	System.out.println("Given String NOT palindrome");
}
obj.close();
}

}
