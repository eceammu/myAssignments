package pages;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class EditLeadsPage extends BaseclassPOM{
	public EditLeadsPage clearLeadFormDescription()
	{
		driver.findElement(By.id("updateLeadForm_description")).clear();
		return this;
	}
	public EditLeadsPage updatexImportantNote()
	{
		//fILL IMPORTANT NOTE FIELD
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note section edited ");
		return this;
	}
	public  ViewLeadsPage clickEditButtonInEditPage()
	{
		//Click edit button
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}
}
