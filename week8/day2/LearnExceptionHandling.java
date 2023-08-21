package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int a=8;
		int b=0;
		int[] values= {9,87,54};
    try

    {
	System.out.println(a/b);
	}
catch(Exception e)
{
	if(b==0)
	{
		System.out.println(a/b);
	}
	System.out.println(e);
	}
	
System.out.println("End Of Program");
}
}