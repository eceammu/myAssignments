package week1.day2.assignments;

public class ReverseWordsInEvenPosition {

	public static void main(String[] args) {
		// Reverse Words In Even Position
		System.out.println("Programs To Reverse Words In Even Position");
		String s = "I am a software tester";
		System.out.println("GIVEN STRING IS "+s);
		String nString="";
		String[] words = s.split("\\W+");
		char ch;
		System.out.println("REVERSED STRING IS ");
		for(int i=0;i<words.length;i++)
		{
		if(i%2==1)
		{
			for (int j=0; j<words[i].length(); j++)
		      {
		        ch= words[i].charAt(j); //extracts each character
		        nString= ch+nString; //adds each character in front of the existing string
		        if(nString.length()==words[i].length())
		        {
		        	words[i]=nString;
		        	//System.out.println("words["+i+"] "+words[i]);
		      } 
		     // System.out.println("Reversed word: "+ nString);
		      }
		}
		 System.out.println(words[i]);
	}
	}
}
