package interview25Problems;

import java.util.Scanner;

public class Ex6FibonacciSeriesTillGivenNumber {

	public static void main(String[] args) {
		// Program To Find Fibonacci Series Till GivenNumber
		System.out.println("Interview Question 5:Program To find  Fibonocci Series till (Given Number)");
		System.out.println("****************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number(n)");
		int n=obj.nextInt();
		int a=0;
		int b=1;
		int f=0;
		System.out.print(a+"  "+b+"  ");
		while(n>f)
		{
			f=a+b;
			System.out.print(f+"  ");
			a=b;
			b=f;
		}
		obj.close();
	}
}
