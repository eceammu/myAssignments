package interview25Problems;
import java.util.Scanner;
public class Ex10PalindromeNumber 
{
public static void main(String[] args) 	
{
// Program To Find Given NUmber Is Palindrome
System.out.println("Interview Program To Find Given NUmber Is Palindrome");
 System.out.println("***************************************************");
 Scanner obj=new Scanner(System.in);
 
 System.out.println("Please Enter a number To Check");
 int number=obj.nextInt();
 int numberCopy=number;//Copy Of Given Number
 int reverse=0;
 while(number>0)
 {
	 reverse=(reverse*10)+(number%10);
	 number=number/10;
 }
 System.out.println(reverse);
 if(numberCopy==reverse ) 
 {
	 System.out.println("Given Number Is Palindrome");
 }
 else
 {
	 System.out.println("Given Number Is NOT Palindrome");
 } 
 obj.close();
}
}
