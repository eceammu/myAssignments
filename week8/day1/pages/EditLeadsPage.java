package week8.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class EditLeadsPage extends BaseclassPOM
{
	public  EditLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public EditLeadsPage clearLeadFormDescription()
	{
		driver.findElement(By.id("updateLeadForm_description")).clear();
		return this;
	}
	public EditLeadsPage updatexImportantNote(String importantNote)
	{
		//fILL IMPORTANT NOTE FIELD
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(importantNote);
		return this;
	}
	public  ViewLeadsPage clickEditButtonInEditPage()
	{
		//Click edit button
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
