package week5.day2.testngtest.assignmenet.leaftaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLeadsLeafTaps extends BaseClassLeafTaps{
	@Test
	public void Dulpicate() {
		// PROGRAM TO DUPLICATE LEAD
		
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
		//Verify Title of page
		String title=driver.getTitle();
		System.out.println("title is "+title);
		//click Duplicate Lead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//Clear Duplicate Lead company Name Field
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//Enter new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Leaf Company");
		//Clear Duplicate Lead firstName Field
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		//Enter new company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ammu");
		//click Create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		//Verify Title of Duplicate Lead page
		String title1=driver.getTitle();
		System.out.println("Duplicate Lead page title is "+title1);	
	}

}
