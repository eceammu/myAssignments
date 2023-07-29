package week5.day2.testngtest.assignment.servienow;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewIncidentServiceNow extends BaseClassServiceNow
{
@Test
	public  void CreateNewIncident() throws InterruptedException 
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
	dom.findElementByXPath("input[@id='incident.short_description']").sendKeys("Smoke Test");
	//dom.findElementByXPath("input[@id='incident.short_description']").sendKeys("Agile Test");
	//dom.findElementByXPath("input[@id='incident.short_description']").sendKeys("Short Description For Incident Created by Alamelumangai. Incident Number is : "+incidentNumber);
	Thread.sleep(1000);
	dom.findElementByXPath("textarea[@id='incident.comments']").sendKeys("Additional comments (Customer visible) For Incident Created by Alamelumangai.Incident Number is "+incidentNumber+".This is testcase for ServiceNow Application");
	Thread.sleep(1000);
	dom.findElementByXPath("button[@id='sysverb_insert_bottom']").click();
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
}
