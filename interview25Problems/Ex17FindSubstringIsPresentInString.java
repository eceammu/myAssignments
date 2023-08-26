package interview25Problems;

import java.util.Scanner;

public class Ex17FindSubstringIsPresentInString 
{
	public static void main(String[] args) {
		//To Find Substring Is Present In String
		System.out.println("Interview Program To Find Substring Is Present In String");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter String");
		String stringWord=obj.nextLine();
		stringWord=stringWord.toLowerCase();
		System.out.println("Enter Substring To Check");
		String subStringWord=obj.nextLine();
		subStringWord=subStringWord.toLowerCase();
		if(stringWord.contains(subStringWord))
		{
			System.out.println("Given Substring ,"+subStringWord+"Is Present In String "+stringWord);
		}
		else
		{
			System.out.println("Given Substring Is NOT Present In String");
		}
		obj.close();
	}

}
