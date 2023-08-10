package pages;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class WelcomePage extends BaseclassPOM
{
	public WelcomePage verifyHomePage()
	{

		 String title=driver.getTitle();
		 System.out.println(title);
		 if(title.contains("Leaftaps"))
			 System.out.println("Login Successful");
		 else
			 System.out.println("Login NOT Successful");
		 return this;
	}
	public MyHomePage crmsfaLinkClick()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
