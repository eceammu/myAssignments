package interview25Problems;

import java.util.Scanner;

public class Ex20ReverseWordsOfGivenSentence 
{
	public static void main(String[] args) {
		// Program To Reverse Words Of Given Sentence
		System.out.println("Interview Program To Reverse Words Of Given Sentence");
		System.out.println("*****************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter a Sentence");
		String sentence=obj.nextLine();
		String[] words=sentence.split("\\s");
		String reverseSentence="";
		for(String w:words)
		{
			StringBuilder objS=new StringBuilder(w);
			objS.reverse();
			reverseSentence=reverseSentence+" "+objS.toString();
		}
		System.out.println("Reverse Words Of Given Sentence");
		System.out.println(reverseSentence);
	}
}
