package week1.day2.assignments;

public class FindPalindromeWord {

	public static void main(String[] args) {
		// Program To Find Palindrome Word 
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
/*char array[]=new char[stringToCheck.length()];
System.out.println("   "+array.length);
for(int j=0;j<stringToCheck.length();j++)
{
	array[j]=stringToCheck.charAt(j);
	}

System.out.println("   "+array);
for(i=0;i<stringToCheck.length();i++)
{
	System.out.println("Program To Find Palindrome Word "+stringToCheck.charAt(i));
	
	array[i]=stringToCheck.charAt(i);
	System.out.println("Program To Find Palindrome Word "+array[i]);
	if (i==stringToCheck.length()-1)
		break;
}
System.out.println("   "+array);*/

	}


