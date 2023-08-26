package interview25Problems;

import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Ex7ReverseGivenNumber {

	public static void main(String[] args) {
		//Program To Find Reverse Of Given Number
		System.out.println("Interview Question 5:Program To find Reverse Of Given Number");
		System.out.println("************************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number(n)");
		int number=obj.nextInt();
		while(number>0)
		{
			System.out.print(number%10);
			number=number/10;
		}
		obj.close();
	}
}
