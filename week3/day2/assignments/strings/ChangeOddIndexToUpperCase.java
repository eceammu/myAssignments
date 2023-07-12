package week3.day2.assignments.strings;

public class ChangeOddIndexToUpperCase 
{
	public static String convertCharToString(char[] a)
	{
		String stringArray=new String(a);
		return stringArray;
	}
	public static void main(String[] args) {
		// Program To change odd index to upper case
		 
		 
	System.out.println("Program to change odd index to uppercase");
	String textToChange="changeme";
	System.out.println("GIVEN STRING to change "+textToChange);
	char array[]=new char[textToChange.length()];
	for(int i=0;i<textToChange.length();i++)
	{
		array[i]=textToChange.charAt(i);
		//System.out.println("Character at i value " +i+" is "+array[i]);
		if((i%2)==0)
		{
			array[i]=Character.toUpperCase(array[i]);//array[i]+32;
			//System.out.println("Character at i value " +i+" is "+array[i]);
		}
	}
	
	System.out.println("CONVERTED STRING IS "+convertCharToString(array));
	}
}
