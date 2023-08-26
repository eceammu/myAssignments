package interview25Problems;
import java.util.Scanner;
public class Ex3SumOfDigitsOfGivenNumber 
{
	public static void main(String[] args) {
		// Program To find Sum Of Digits Of Given Number
		int sum=0;
		System.out.println("Interview Question 3:Program To find Sum Of Digits Of Given Number");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number(To find Sum Of Digits)");
		int number=obj.nextInt();
		do
		{
			sum=sum+(number%10);
			number=number/10;	
		}while(number!=0);
		System.out.println("Sum Of Digits Of Given Number"+sum);
		obj.close();
	}
}
