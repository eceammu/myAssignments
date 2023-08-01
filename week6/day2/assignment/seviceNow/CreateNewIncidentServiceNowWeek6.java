package week6.day2.assignment.seviceNow; 


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewIncidentServiceNowWeek6 extends BaseClassServiceNowWeek6
{
		String  excelFileName;
		
		@BeforeTest
		public void setValues() {
		   excelFileName="CreateIncident";
		}
		
@Test(dataProvider="sendData")
	public  void CreateNewIncident(String shortDescription,String additionalDescription) throws InterruptedException 
{
	// Program To CreateNewIncidentServiceNow
	Shadow  dom =new Shadow(driver);	
	driver.findElement(By.xpath("//button[text()='New']")).click();
	//String idFValue=frame1.getAttribute("title");
	//System.out.println(idFValue);
	//driver.switchTo().frame(0);
	Thread.sleep(2000);
	//driver.findElement(By.id("sysverb_new")).sendKeys(Keys.ENTER);
	String incidentNumber=dom.findElementByXPath("input[@id='incident.number']").getAttribute("value");
	System.out.println("incidentNumber"+incidentNumber);
	//driver.findElement(By.xpath("(//div[@class='container-fluid ']//button)[8]")).click();
	//driver.findElement(By.xpath("//button[text()='New']")).click();
	//driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
	//driver.findElement(By.id("sysverb_new")).click();
	Thread.sleep(1000);
	//dom.findElementByXPath("input[@id='incident.short_description']").sendKeys("Regression Test");
	//dom.findElementByXPath("input[@id='incident.short_description']").sendKeys("Smoke Test");
	//dom.findElementByXPath("input[@id='incident.short_description']").sendKeys("Agile Test");
	dom.findElementByXPath("input[@id='incident.short_description']").sendKeys(shortDescription+",Short Description For Incident"+incidentNumber);
	Thread.sleep(1000);
	dom.findElementByXPath("textarea[@id='incident.comments']").sendKeys(additionalDescription+" for Incident Number is "+incidentNumber);
	Thread.sleep(1000);
	dom.findElementByXPath("button[@id='sysverb_insert_bottom']").click();
	Thread.sleep(1000);
	dom.findElementByXPath("//input[@class='form-control']").sendKeys(incidentNumber,Keys.ENTER);
	Thread.sleep(1000);
	String incidentNumberFromIncidentsViewPage=dom.findElementByXPath("//a[@class='linked formlink']").getText();
	System.out.println("incident Number From Incidents View Page"+incidentNumberFromIncidentsViewPage);
	if(incidentNumberFromIncidentsViewPage.endsWith(incidentNumber))
	{
	System.out.println("SUCCESS....Incident created successfully");
	}
	else
	{
		System.out.println("Incident NOT created");
	}
	
	Thread.sleep(1000);
	}
@DataProvider
public String[][] sendData() throws IOException
{
	String[][] data=ReadExcelWeek6.readExcelData(excelFileName);
	System.out.println("data "+data);
	//return data;
		return ReadExcelWeek6.readExcelData(excelFileName);
}

}
