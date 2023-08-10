package pages;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class MyLeadsPage extends BaseclassPOM
{
   public CreateLeadPage clickCreateLeadLink()
   {
	//click createleads
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage();
   }
  
   public MergeLeadsPage clickMergeLeadsLink()
   {
	driver.findElement(By.linkText("Merge Leads")).click();
	return new MergeLeadsPage();
   }
   public FindLeadsPage clickFindLeadsLink()
   {
	   driver.findElement(By.linkText("Find Leads")).click();
	   return new  FindLeadsPage();
	}
	
}