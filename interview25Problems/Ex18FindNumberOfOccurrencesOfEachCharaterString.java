package interview25Problems;
import java.util.Scanner;
public class Ex18FindNumberOfOccurrencesOfEachCharaterString 
{
	public static void main(String[] args) {
		//PROGRAM To Find Number Of Occurrences Of Each Character In Given String
        System.out.println("Interview PROGRAM To Find Number Of Occurrences Of Each Character In Given String");
        Scanner obj=new Scanner(System.in);
        System.out.println("Please Enter A String :");
        String word=obj.nextLine();
        char[] charArray=new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
        	charArray[i]=word.charAt(i);     	
        }
        char ch;
       //word= word.toLowerCase();
        //UNCOMMENT THIS IF CASE INSENSITIVE
        for(int i=0;i<word.length();i++)
        {
        	int numberOfOccurrences=0;
        	ch=charArray[i]; 
        	for(int j=0;j<charArray.length;j++)
        	{
        		if(ch==charArray[j])
        			numberOfOccurrences++;
        	}
        	System.out.println("Character,"+ch+" Occurrences "+numberOfOccurrences+" times In Given String");
        }
   obj.close();
	}
}
