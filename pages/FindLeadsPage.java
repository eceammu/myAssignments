package pages;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class FindLeadsPage extends BaseclassPOM 
{
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
	

public FindLeadsPage findLeads()   
{
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) 
	{
		System.out.println("Text matched");
	} 
	else 
	{
		System.out.println("Text not matched");
		
	}
	return this;
	}
public FindLeadsPage clickPhoneTab()  

{
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
}
public FindLeadsPage enterPhoneNumber()  

{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	return this;
}

public ViewLeadsPage findLeadsResultDisplay()   

{
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println("leadID ="+leadID);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	return new ViewLeadsPage();
}
public ViewLeadsPage findLeadsResultDisplayDeleteLead()   

{
	String text = driver.findElement(By.className("x-paging-info")).getText();
	System.out.println("Text is"+text);
	if (text.equals("No records to display")) 
	{
		System.out.println("Lead deleted successfully");
	}
	else 
	{
		System.out.println("Lead is not deleted ");
	}
	
	return new ViewLeadsPage();
}


}
