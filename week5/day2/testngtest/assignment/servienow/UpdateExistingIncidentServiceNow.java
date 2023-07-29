package week5.day2.testngtest.assignment.servienow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncidentServiceNow extends BaseClassServiceNow{
@Test
	public void UpdateExistingIncident() throws InterruptedException 
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
		//6.Update the incidents with Urgency as High and State as In Progress and click Update button
		WebElement urgencyDD=dom.findElementByXPath("//select[@id='incident.urgency']");
		Select selectUrgency=new Select(urgencyDD);
		selectUrgency.selectByVisibleText("1 - High");
		Thread.sleep(500);
		WebElement incidentStateDD=dom.findElementByXPath("//select[@id='incident.state']");
		Select selectIncidentState=new Select(incidentStateDD);
		selectIncidentState.selectByVisibleText("In Progress");
		Thread.sleep(500);
		dom.findElementByXPath("button[@id='sysverb_update_bottom']").click();
		Thread.sleep(2000);
		//7. Click on the incident again and Verify the Incident state 
		dom.findElementByXPath("//a[text()='"+incidentNumberFromIncidentsViewPage+"']").click();
		//dom.findElementByXPath("//a[@class='linked formlink']").click();
		Thread.sleep(2000);
		dom.setImplicitWait(35);
		String state=new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText();
		String urgency=new Select(driver.findElement(By.id("incident.urgency"))).getFirstSelectedOption().getText();
		System.out.println("Incident state After Updated is: "+new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText());
		System.out.println("Incident urgency After Updated is: "+new Select(driver.findElement(By.id("incident.urgency"))).getFirstSelectedOption().getText());
		Thread.sleep(2000);
		/*
		WebElement optionUrgency = selectUrgency.getFirstSelectedOption();	
		String urgency=optionUrgency.getAttribute("value");
		System.out.println("Urgency After Updated:"+ urgency);
	    urgency=selectUrgency.getFirstSelectedOption().getText();
		System.out.println("Urgency After Updated:"+ urgency);
		Thread.sleep(2000);
		WebElement optionState = selectIncidentState.getFirstSelectedOption();
		String state= optionState. getAttribute("value");
		System.out.println("State After Updated:"+ state);
		state=selectIncidentState.getFirstSelectedOption().getText();
		System.out.println("State After Updated:"+ state);
		*/
		if(urgency.equalsIgnoreCase("1 - High")  &&  state.equalsIgnoreCase("In Progress")) 
		{
			System.out.println("SUCCESS....Incident updated successfully");
		}
		else
		{
			System.out.println("Incident NOT updated");
		}
		Thread.sleep(1000);
	}
}
