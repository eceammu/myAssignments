package interview25Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11AnagramTwoStrings {

	public static void main(String[] args) {
		// Program To Check given Two Strings Are Anagrams
		System.out.println("Interview Program To Check given Two Strings Are Anagrams");
		System.out.println("*********************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the First String");
		String word1=obj.nextLine();
		System.out.println("Enter the Second String");
		String word2=obj.nextLine();
		if((word1.length())==(word2.length()))  //check length of two words for equality
		{
			word1=word1.toLowerCase();
			word2=word2.toLowerCase();
			char charArray1[]=word1.toCharArray();
			char charArray2[]=word2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if(Arrays.equals(charArray1,charArray2))
			{
				System.out.println("Given Strings,"+word1+" and "+word2+" are Anagrams");
			}
			else
			{
				System.out.println("Given Strings,"+word1+" and "+word2+" are  NOT Anagrams");
				
			}
		}
		else
		{
			System.out.println("Given Strings,"+word1+" and "+word2+" are  NOT Anagrams");
		}
		obj.close();
	}
}
