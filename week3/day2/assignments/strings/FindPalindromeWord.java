package week3.day2.assignments.strings;

public class FindPalindromeWord 
{
	// Program To Find Palindrome Word 
	
		public static void main(String[] args)
		{
			
	System.out.println("Program To Find Palindrome Word");
	String stringToCheck= "Madam";
	String reverseString="";
	int i;
	System.out.println("GIVEN STRING to check "+stringToCheck);
	for(i=(stringToCheck.length()-1);i>=0;--i)
	{
		System.out.println("VALUE OF i IS "+i);
		reverseString=reverseString+stringToCheck.charAt(i);
		System.out.println("Word IS "+reverseString);
	}
	System.out.println("REVERSE Word IS "+reverseString);
	if(stringToCheck.equalsIgnoreCase(reverseString))
	{
		System.out.println("THE GIVEN WORD  "+stringToCheck+"  IS A PALIDROME");
		}
	else
	{
		System.out.println("THE GIVEN WORD  "+stringToCheck+"  IS not A PALIDROME");
		}
	}
}

