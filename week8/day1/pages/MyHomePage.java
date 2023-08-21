package week8.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class MyHomePage extends BaseclassPOM
{
	public MyHomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public MyLeadsPage clickLeadsLink()
	{
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
