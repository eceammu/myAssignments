package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// PrintDuplicatesInArray
System.out.println("PROGRAM TO FIND Print Duplicates In Array");
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};  
int i,j,count;
for(i=0;i<arr.length;i++)
{
	for(j=i+1;j<arr.length;j++)
	{
		if((arr[i]==arr[j]))
		{
			System.out.println("Duplicates In Array  "+arr[j]);
	}
	}
	}
	}
}
