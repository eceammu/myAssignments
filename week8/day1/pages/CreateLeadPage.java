package week8.day1.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import week8.day1.base.BaseclassPOM;

public class CreateLeadPage extends BaseclassPOM
{
	public  CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
   public CreateLeadPage enterCompanyName(String companyName)
    {
	 //enter company name
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	 return this;
	}
   public CreateLeadPage enterFirstName(String firstName)
   {
	 //enter first name
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	 return this;
   }
   public CreateLeadPage enterLastsName(String lastName)
   {
	 //enter last name
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	 return this;
   }
   public CreateLeadPage enterNameLocal(String firstNameLocal)
   {
	 //enter first name local
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(firstNameLocal);
	 return this;
   }
   public CreateLeadPage enterDepartmentName(String departmentName)
   {
	 //enter description
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(departmentName);
	 return this;
   }
   public CreateLeadPage enterPrimaryEmail(String primaryEmail)
   {
	 ///enter primary Email
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(primaryEmail);
	 return this;
   }
   
   public CreateLeadPage selectStateProvinanceOption(String stateProvinance)
   {
	 //select State Provinance
	 WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select selectStateProvinance=new Select(stateDD);
	 selectStateProvinance.selectByVisibleText(stateProvinance);
	 return this;
   }
   public CreateLeadPage enterPhoneNumber(String phoneNumber) throws IOException
   {
	     //Enter PhoneNumber
		 try {
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
			reportStep("All details (upto phone number) entered orrectly in create Lead page", "Pass");
		} catch (Exception e) 
		 {
			e.printStackTrace();
			reportStep("Phone number NOT entered", "Fail");
		}
		 return this;
   }
   public ViewLeadsPage createLeadButton()
   {
	 //click Create Lead button
	 driver.findElement(By.className("smallSubmit")).click();
	 return new ViewLeadsPage(driver);
   }
}
