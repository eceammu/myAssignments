package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args)
	{
		// PROGRAM TO EDIT LEAD
				ChromeDriver driver=new ChromeDriver();
				 driver.get("http://leaftaps.com/opentaps/control/login");
				 //Enter UserName and Password Using Id Locator
				 WebElement elementUserName=driver.findElement(By.id("username"));
				 elementUserName.sendKeys("DemoCSR");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				// Click on Leads Button
				 driver.findElement(By.linkText("Leads")).click();
				// Click on Create Lead 
				driver.findElement(By.linkText("Create Lead")).click();
				//enter company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//enter first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Alamelumangai");
				//enter last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
				//enter first name local
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ammu");
				//enter department Name
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("department Name TESTING");
				//enter description
				driver.findElement(By.id("createLeadForm_description")).sendKeys("description of CREATE LEAD");
				//enter primary Email
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("eceammu@gmail.com");
				//select State Provinance
				WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select selectStateProvinance=new Select(stateDD);
				selectStateProvinance.selectByVisibleText("New York");
				//click Create Lead button
				driver.findElement(By.className("smallSubmit")).click();
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateLeadForm_description")).clear();
				//fILL IMPORTANT NOTE FIELD
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Update Lead Form Important Note");
				//Click edit button
				driver.findElement(By.name("submitButton")).click();
				//Verify Title of page
				String title=driver.getTitle();
				System.out.println(" Edit lead title is "+title);
				//Thread.sleep(300);
				driver.close();
				

	}

}
