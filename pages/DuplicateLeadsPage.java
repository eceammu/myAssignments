package pages;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class DuplicateLeadsPage extends BaseclassPOM
{
public DuplicateLeadsPage updateCompanyNameFieldDuplicateLeadsPage()
   {
	//Clear Duplicate Lead company Name Field
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	//Enter new company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	return this;
	}
public DuplicateLeadsPage updateFirstNameFieldDuplicateLeadsPage()
{
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	//Enter new company name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ammu");
	return this;
}
public ViewLeadsPage clickDuplicateLeadButtonSubmit()
{
	//click  button
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLeadsPage();
}


}
