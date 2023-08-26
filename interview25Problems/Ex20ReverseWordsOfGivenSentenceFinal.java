package interview25Problems;

import java.util.Scanner;

public class Ex20ReverseWordsOfGivenSentenceFinal 
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
		for(int i=words.length-1;i>=0;i--)
		{
			reverseSentence=reverseSentence+words[i]+" ";
		}
		reverseSentence=reverseSentence.substring(0,reverseSentence.length()-1);
		System.out.println("Reverse Words Of Given Sentence");
		System.out.println(reverseSentence);
		obj.close();
	}
}
