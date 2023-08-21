package week8.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class MyLeadsPage extends BaseclassPOM
{
	public MyLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
   public CreateLeadPage clickCreateLeadLink()
   {
	//click createleads
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
   }
  
   public MergeLeadsPage clickMergeLeadsLink()
   {
	driver.findElement(By.linkText("Merge Leads")).click();
	return new MergeLeadsPage(driver);
   }
   public FindLeadsPage clickFindLeadsLink()
   {
	   driver.findElement(By.linkText("Find Leads")).click();
	   return new  FindLeadsPage(driver);
	}
	
}