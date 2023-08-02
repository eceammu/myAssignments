package week6.Marathon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOpportunity  extends BaseclassSalesForce
{
	String  excelFileName;
	
	@BeforeTest
	public void setValues() {
	   excelFileName="CreateOpportunitySheet1";
	}
	
	@Test(dataProvider="sendData")
	public void CreateOpportunityTest(String opportunityNameXL,String amountXL) throws InterruptedException
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    Actions builder=new Actions(driver);
		WebElement scroll =driver.findElement(By.xpath("//span[text()='Key Deals - Recent Opportunities']/following::div[@class='slds-card__footer']/a"));
		Thread.sleep(1000);
	    builder.scrollToElement(scroll).perform();
	    Thread.sleep(1000);
	    System.out.println("hi hi");
	    driver.executeScript("arguments[0].click();", scroll);
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	       driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opportunityNameXL);
	       driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amountXL);
			WebElement scrollNew =driver.findElement(By.xpath("(//span[text()='--None--'])[4]"));
			Thread.sleep(1000);
		       builder.scrollToElement(scrollNew).perform();
		       Thread.sleep(1000);
		       System.out.println("gg");
		       //scroll.click();
		       WebElement Type =driver.findElement(By.xpath("(//span[text()='--None--'])[2]"));
		       driver.executeScript("arguments[0].click();",Type);
		       WebElement newC =driver.findElement(By.xpath("//span[text()='New Customer']"));
		       driver.executeScript("arguments[0].click();",newC);
		       
		       WebElement leadSource =driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		       driver.executeScript("arguments[0].click();",leadSource);
		       WebElement partnerReferral =driver.findElement(By.xpath("//span[text()='Partner Referral']"));
		       driver.executeScript("arguments[0].click();",partnerReferral);
		       WebElement stage =driver.findElement(By.xpath("(//span[text()='--None--'])[1]"));
		       driver.executeScript("arguments[0].click();",stage);
		       Thread.sleep(1000);
		       
		       driver.findElement(By.xpath("//records-lwc-detail-panel//span[text()='Needs Analysis']")).click();
		       //WebElement needsAnalysis =driver.findElement(By.xpath("//span[text()='Needs Analysis']"));
		       //driver.executeScript("arguments[0].click();",needsAnalysis);
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
		       driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]/following::span[3]")).click();
		       driver.findElement(By.xpath("//label[text()='Close Date']/..//input")).click();
				driver.findElement(By.xpath("//td[@class=\"slds-is-today\"]/following-sibling::td[2]")).click();
		       
				 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				
				 String message=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
				 System.out.println("message:"+message);
				 String opprtunityNameUI=driver.findElement(By.xpath("//div[text()='Opportunity']/following::slot/lightning-formatted-text")).getText();
				 System.out.println("opprtunityName"+opprtunityNameUI);
				 
	      /*
	       WebElement incidentStateDD=driver.findElement(By.xpath(""));
			Select selectIncidentState=new Select(incidentStateDD);
			selectIncidentState.selectByVisibleText("In Progress");
			*/
	}
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
		String[][] data=ReadExcelMarathon.readExcelData(excelFileName);
				System.out.println("data "+data);
		//return data;
			return ReadExcelMarathon.readExcelData(excelFileName);
	}
}
