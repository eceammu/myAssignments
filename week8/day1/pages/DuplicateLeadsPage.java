package week8.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class DuplicateLeadsPage extends BaseclassPOM
{
	public  DuplicateLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
public DuplicateLeadsPage updateCompanyNameFieldDuplicateLeadsPage(String companyNameDuplicateLeadsPage)
   {
	//Clear Duplicate Lead company Name Field
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	//Enter new company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyNameDuplicateLeadsPage);
	return this;
	}
public DuplicateLeadsPage updateFirstNameFieldDuplicateLeadsPage(String firstName)
{
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	//Enter new company name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	return this;
}
public ViewLeadsPage clickDuplicateLeadButtonSubmit()
{
	//click  button
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLeadsPage(driver);
}


}
