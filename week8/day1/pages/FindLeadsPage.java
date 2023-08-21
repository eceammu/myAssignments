package week8.day1.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class FindLeadsPage extends BaseclassPOM 
{
	public FindLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public FindLeadsPage enterLeadsID()   throws InterruptedException 

	{
		System.out.println("LeadID is  "+leadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		Thread.sleep(3000);
		return this;
	}
	public FindLeadsPage enterLeadsIDMerge()   throws InterruptedException 

	{
		System.out.println("fromLeadID is  "+fromLeadID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fromLeadID);
		Thread.sleep(3000);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException   

	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
	}
	

public FindLeadsPage findLeads() throws IOException   
{
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) 
	{
		try {
			System.out.println("Text matched");
			reportStep("Text matched,Merge Lead Performed succesfully", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Text not matched", "Fail");
		}
	} 
	else 
	{
		System.out.println("Text not matched");
		reportStep("Text not matched", "Fail");
	}
	return this;
	}
public FindLeadsPage clickPhoneTab()  

{
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
}
public FindLeadsPage enterPhoneNumber(String phoneNumber)  

{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	return this;
}

public ViewLeadsPage findLeadsResultDisplay()   

{
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println("leadID ="+leadID);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	return new ViewLeadsPage(driver);
}
public ViewLeadsPage findLeadsResultDisplayDeleteLead() throws IOException   

{
	String text = driver.findElement(By.className("x-paging-info")).getText();
	System.out.println("Text is"+text);
	if (text.equals("No records to display")) 
	{
		try {
			System.out.println("Lead deleted successfully");
			reportStep("Deleted succesfully", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("NOT Deleted","Fail");
		}
	}
	else 
	{
		System.out.println("Lead is not deleted ");
		reportStep("NOT Deleted","Fail");
	}
	
	return new ViewLeadsPage(driver);
}


}
