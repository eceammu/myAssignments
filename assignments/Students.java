package week3.day1.assignments;
import java.lang.*;

public class Students
{
	public void getStudentInfo(int id)
	{
		System.out.println("4 Digit Unique identification Number of Student is "+id);

	}
public void getStudentInfo(int id,String name)
{
		
	System.out.println(name+"'s 4 Digit Unique identification Number of is "+id);
}

public void getStudentInfo(String email,long phoneNumber) 
{
	System.out.println("email id of Student is : "+email+",his/her phone no is :"+phoneNumber);

}


	public static void main(String[] args) 
	{
		Students obj=new Students();
		obj.getStudentInfo(3214);
        obj.getStudentInfo(4587, "Alamelumangai T");
        obj.getStudentInfo("eceammu@gmail.com", 8610166012L);
	}

}
