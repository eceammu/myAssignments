package interview25Problems;

import java.util.Scanner;

public class Ex21ConvertLowercaseToUppercase {

	public static void main(String[] args) 
	{
		// Program To Convert Lowercase To Uppercase
		System.out.println("Interview Program To Convert Lowercase To Uppercase");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String:");
		String word=obj.nextLine();
		word=word.toUpperCase();
		System.out.println("Converted String:"+word);
		obj.close();
	}
}
