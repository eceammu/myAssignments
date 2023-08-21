package week8.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class WelcomePage extends BaseclassPOM
{
	public WelcomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
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
		return new MyHomePage(driver);
	}
}
