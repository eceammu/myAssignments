package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass
{
	@When("Click on Find Leads Link") 
	public void clickFindLeadsLink()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And("Click Phone tab") 
	public void clickPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@And("Enter the phone Number as (.*)$") 
	public void enterPhoneNumber(String phoneNumber)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	}
	
	@Then("Click on Find Leads button") 
	public void clickFindLeadsButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@And("Click LeadID of first resulting Lead in table") 
	public void clickLeadID()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();	
	}
	
	@And("Click EditLead Link") 
	public void clickEditLeadsLink()
	{
		System.out.println("Clicking Edit Lead");
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Update companyname as (.*)$") 
	public void updateCompanyName(String newCompanyName)
	{
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(newCompanyName);
	}
	@And("Click submit")
	public void clickSubmit() throws InterruptedException
	{
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
	}
	@Then("Lead should be edited with companyName as (.*)$")  
	public void checkEdit(String newCompanyName)
	{
		System.out.println("hi hi");
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("text "+text);
		if (text.contains(newCompanyName)) {
			System.out.println("Lead is edited successfully");
		}
		else {
			System.out.println("Lead is NOT edited");
		}
	}
}
