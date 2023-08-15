package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass
{
	@And("Click CreateLead link") 
	public void clickCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the companyname as (.*)$") 
	public void enterCompanyName(String cName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	@And("Enter the firstname as (.*)$") 
	public void enterFirstName(String fName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@And("Enter the lastname as (.*)$") 
	public void enterLastName(String lName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@And("Enter the phoneNumber as (.*)$") 
	public void enterPhoneNo(String phoneNo)
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNo);
	}
	@When("Click on createLead button") 
	public void enterCreateButtonButton()
	{
		
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("ViewLeadsPage should be displayed as (.*)$")
	public void displayViewLeadsPage(String cName)
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName))
		{
			System.out.println("Lead created successfully");
		}
		else 
		{
			System.out.println("Lead is not created");
		}
	}
}
