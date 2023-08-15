package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadStepDefinition extends BaseClass
{
	@And("Enter the firstnamelocal as (.*)$") 
	public void enterFirstNameLocal(String firstnamelocal)
	{
		//enter first name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(firstnamelocal);
	}
	@And("Enter the departmentname as (.*)$") 
	public void enterDepartmentname(String departmentname)
	{
		//enter department Name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(departmentname);
	}
	@And("Enter the description as (.*)$") 
	public void enterDescription(String description)
	{
		//enter description
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);
	}
	@And("Enter the primaryEmail as (.*)$") 
	public void enterPrimaryEmail(String primaryEmail)
	{
		//enter primaryEmail
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(primaryEmail);
	}
	@And("Select the stateProvinance as (.*)$") 
	public void stateProvinanceDropDown(String stateProvinanceValue)
	{
		//select State Provinance
				WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select selectStateProvinance=new Select(stateDD);
				selectStateProvinance.selectByVisibleText(stateProvinanceValue);
	}
	@And("Verify Title of page") 
	public void verifyTitle()
	{
		//Verify Title of page
		String title=driver.getTitle();
		System.out.println("title is "+title);
	}

    @When("click Duplicate Lead button") 
    public void clickDuplicateLeadButton() throws InterruptedException
    {
    	System.out.println("Clicking Duplicate Lead");
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    Thread.sleep(2000);
    }
    @And("Duplicate Lead company Name Field as (.*)$") 
    public void enterDuplicateLeadCompanyName(String companyNameNew)
    {
       driver.findElement(By.id("createLeadForm_companyName")).clear();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyNameNew);
    }
    @And("Update Duplicate Lead first Name Field as (.*)$") 
    public void enterDuplicateLeadFirstName(String firstNameNew)
    {
    	//Clear Duplicate Lead firstName Field
    	driver.findElement(By.id("createLeadForm_firstName")).clear();
    	//Enter new company name
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstNameNew);
    }
}
