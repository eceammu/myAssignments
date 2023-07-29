package week5.day2.testngtest.assignment.servienow;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class DeleteIncidentServiceNow extends BaseClassServiceNow
{
@Test
	public void DeleteExistingIncident() throws InterruptedException 
	{
	// Program To Update New Incident Service Now
	Shadow  dom =new Shadow(driver);
	dom.setImplicitWait(30);
	String incidentNumberFromIncidentsViewPage=dom.findElementByXPath("//a[@class='linked formlink']").getText();
	System.out.println("incident Number From Incidents View Page"+incidentNumberFromIncidentsViewPage);
	dom.findElementByXPath("//a[@class='linked formlink']").click();
	Thread.sleep(2000);
	String incidentNumber=dom.findElementByXPath("input[@id='incident.number']").getAttribute("value");
	System.out.println("incident Number"+incidentNumber);
	Thread.sleep(500);
	//6. Delete the incident
	dom.findElementByXPath("button[@id='sysverb_delete_bottom']").click();
	Thread.sleep(2000);
	//Click Delete button in confirmation sweet alert
	dom.findElementByXPath("button[@id='ok_button']").click();
	Thread.sleep(2000);
	//7. Verify the deleted incident   
	//Find Search Results Table
	WebElement searchResultsTable=driver.findElement(By.xpath("//table[contains(@id,'incident_table')]"));
	List<WebElement> incidentNumberDataThirdColumn=driver.findElements(By.xpath("//table[contains(@id,'incident_table')]//td[3]"));
	boolean flagDelete=true;
	for(WebElement eachIncidentNumber:incidentNumberDataThirdColumn)
	{
		String incidentNumberFromSearch=eachIncidentNumber.getText();
	    System.out.println(incidentNumberFromSearch);
	    if(incidentNumberFromSearch.equalsIgnoreCase(incidentNumber))
	    {
	    	flagDelete=false;
	    	break;
	    }
	}
	if(flagDelete)
		System.out.println("Success....Incident Deleted Succssfully");
	else
		System.out.println("Success....Incident Not Deleted");
	}
}
