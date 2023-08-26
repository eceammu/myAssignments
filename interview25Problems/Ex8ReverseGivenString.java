package interview25Problems;

import java.util.Scanner;

public class Ex8ReverseGivenString {

	public static void main(String[] args) {
		// Program To Print Reverse Of Given String
		System.out.println("Interview Program To Print Reverse Of Given String");
		System.out.println("*************************************************");
		System.out.println("Please Enter a String");
		Scanner obj=new Scanner(System.in);
		String word=obj.nextLine();
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i));
		}
		obj.close();
	}
}
