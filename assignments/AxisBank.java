package week3.day1.assignments;

public class AxisBank extends BankInfo
{
	@Override
	public void deposit() 
	{
		
		System.out.println("Deposit amount limits of the Axis bank:Rs.49,950 per account per day--->From AxisBank  Class");
	}

	public static void main(String[] args) 
	{
		
		
			 BankInfo obj1 = new BankInfo();
		        obj1.deposit();
		        BankInfo obj2 = new AxisBank();
		        obj2.deposit();
	}

}
