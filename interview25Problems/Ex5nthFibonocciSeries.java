package interview25Problems;

import java.util.Scanner;

public class Ex5nthFibonocciSeries {

	public static void main(String[] args) 
	{
		// Program To find nth(Given Number) Fibonocci Series
		System.out.println("Interview Question 5:Program To find nth(Given Number) Fibonocci Series");
		System.out.println("***********************************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number(n)");
		int n=obj.nextInt();
		if(n==1)
			System.out.println("0");
		if(n==2)
			System.out.println("0  1");
		int a=0;
		int b=1;
		int f;
		if(n>2)
		{
			System.out.print(a+"  "+b+"  ");
			for(int i=n;i>2;i--)
			{
				f=a+b;
				System.out.print(f+"  ");
				a=b;
				b=f;
		    }
		}
		obj.close();
	}

}
