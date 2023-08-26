package interview25Problems;

import java.util.Scanner;

public class Ex15FindNumberPresentInArray 
{
	public static void main(String[] args) {
		//Program To Find Number Present In Array
		System.out.println("Interview Program To Find Given Number Present In Array");
		System.out.println("*******************************************************");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=obj.nextInt();
		System.out.println("Please Enter Array Elements:");
		int[] intArray=new int[n];
		for(int i=0;i<n;i++)
		{
			intArray[i]=obj.nextInt();
		}
		System.out.println("Array Elements Are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(intArray[i]+" ");
		}
		System.out.println("");
		System.out.println("Please Enter the Number TO CHECK Present In Array");
		int number=obj.nextInt();
		boolean isPresent=false;
		for(int i=0;i<n;i++)
		{
			if(intArray[i]==number)
				isPresent=true;
			    break;
		}
		if(isPresent=true)
		System.out.println("Given Number,"+number+" is Present In Array");
		else
		System.out.println("Given Number,"+number+" is NOT Present In Array");
		obj.close();
	}
}
