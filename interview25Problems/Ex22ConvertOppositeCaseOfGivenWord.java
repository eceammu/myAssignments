package interview25Problems;

import java.util.Scanner;

public class Ex22ConvertOppositeCaseOfGivenWord {

	public static void main(String[] args) 
	{
		// Program To Convert Lowercase To Uppercase
		System.out.println("Interview Program To Convert Lowercase To Uppercase");
		Scanner obj=new Scanner(System.in);
		StringBuilder objS=new StringBuilder();
		//Character objC=new Character();
		System.out.println("Enter a String:");
		String word=obj.nextLine();
		char[] charArray=new char[word.length()];
		charArray=word.toCharArray();
		for(int i=0;i<charArray.length-1;i++)
		{
			if(Character.isLowerCase(charArray[i]))
			{
				
				System.out.println("true");
				charArray[i]=Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			}
if(Character.isUpperCase(charArray[i]))
{
	//System.out.println("jjjj");
				
				charArray[i]=Character.toLowerCase(charArray[i]);
				System.out.println(charArray[i]);
}
		}
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		
		
		//word=word.toUpperCase();
		System.out.println("Converted String:"+word);
		obj.close();
	}
}
