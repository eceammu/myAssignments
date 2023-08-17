package Marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Marathon.base.BaseClassLastMarathon;

public class NewIndividualPageSalesforce extends BaseClassLastMarathon
{
	 //Test Steps:
	//6. Enter the Last Name as 'Kumar'
	//7.Click save
	public NewIndividualPageSalesforce(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public NewIndividualPageSalesforce enterLastName(String lastName) 
	{
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lastName);
		return this;
	}
	public IndividualsPageSalesforce clickSaveButton() 
	{
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new IndividualsPageSalesforce(driver);
	}

}
