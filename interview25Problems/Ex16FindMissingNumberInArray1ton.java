package interview25Problems;
import java.util.Scanner;
public class Ex16FindMissingNumberInArray1ton 
{
	public static void main(String[] args) 
	{
		//Program To Find Missing Number In Array Of Size n
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter the Size Of Array (n)");
		int n=obj.nextInt();
		System.out.println("Enter Array Elements(consequitive) From 1 to n");
		int[] intArray=new int[n];
		for(int i=0;i<n;i++)
		{
			intArray[i]=obj.nextInt();
		}
		int m=n+1;//Actual Size of Array
		int sum=0;
		int total;
		total=(m*(m+1))/2;//Actual Total
		System.out.println("Actual Total :"+total);
		for(int i=0;i<n;i++)
		{
			sum=sum+intArray[i];
		}
		System.out.println("Sum Of Given Array :"+sum);
		System.out.println("Missing Element In the Array :"+(total-sum));
		obj.close();
	}
}
