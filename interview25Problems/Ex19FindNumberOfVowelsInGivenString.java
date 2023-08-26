package interview25Problems;

import java.util.Scanner;

public class Ex19FindNumberOfVowelsInGivenString 
{
	public static void main(String[] args) 
	{
		//To Find Number Of Vowels In Given String
		System.out.println("Interview Program To Find Number Of Vowels In Given String");
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter a String");
		String word=obj.nextLine();
		word=word.toLowerCase();
		char[] charArray=new char[word.length()];
		charArray=word.toCharArray();
		int numberOfVowels=0;
        for(int i=0;i<word.length();i++)

        {
	
        	if((charArray[i]=='a') ||(charArray[i]=='e') ||(charArray[i]=='i') ||(charArray[i]=='o') ||(charArray[i]=='u')) 
		    numberOfVowels++;
        }
        System.out.println("Number Of Vowels In Given String :"+numberOfVowels);
        obj.close();	
        }
}
