package interview25Problems;

import java.util.Scanner;

public class Ex1PrimeOrNot {

public static void main(String[] args) 
{
// Program To Find Prime Or Not
int noOfDiviser=0;
System.out.println("Interview question 1");
Scanner obj=new Scanner(System.in);
System.out.println("Please enter a number(To find prime or not)");
int number=obj.nextInt();
for(int i=2;i<number;i++)
{
	if((number%i)==0)
		noOfDiviser++;
}
	if(noOfDiviser==0)
		System.out.println("Given Numver is Prime");
	else
		System.out.println("Given Numver is NOT a Prime,it has "+noOfDiviser+"number of divisor other than 1 and itself");
obj.close();
}
}
