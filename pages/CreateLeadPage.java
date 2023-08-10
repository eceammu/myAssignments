package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseclassPOM;

public class CreateLeadPage extends BaseclassPOM
{
   public CreateLeadPage enterCompanyName()
    {
	 //enter company name
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	 return this;
	}
   public CreateLeadPage enterFirstName()
   {
	 //enter first name
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Alamelumangai");
	 return this;
   }
   public CreateLeadPage enterLastsName()
   {
	 //enter last name
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	 return this;
   }
   public CreateLeadPage enterNameLocal()
   {
	 //enter first name local
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Alamelu");
	 return this;
   }
   public CreateLeadPage enterDescription()
   {
	 //enter description
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTLeaf Automation Department");
	 return this;
   }
   public CreateLeadPage enterPrimaryEmail()
   {
	 ///enter primary Email
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("alameluceg@gmail.com");
	 return this;
   }
   
   public CreateLeadPage selectStateProvinanceOption()
   {
	 //select State Provinance
	 WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select selectStateProvinance=new Select(stateDD);
	 selectStateProvinance.selectByVisibleText("California");
	 return this;
   }
   public CreateLeadPage enterPhoneNumber()
   {
	     //Enter PhoneNumber
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8610166012");
		 return this;
   }
   public ViewLeadsPage createLeadButton()
   {
	 //click Create Lead button
	 driver.findElement(By.className("smallSubmit")).click();
	 return new ViewLeadsPage();
   }
}
