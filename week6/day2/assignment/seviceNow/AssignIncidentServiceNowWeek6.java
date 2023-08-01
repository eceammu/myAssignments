package week6.day2.assignment.seviceNow;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class AssignIncidentServiceNowWeek6 extends BaseClassServiceNowWeek6
{

	@Test//(enabled=false)
	public void UpdateExistingIncident() throws InterruptedException 
	{
		// Program To Update New Incident Service Now
		Shadow  dom =new Shadow(driver);
		dom.setImplicitWait(15);
		String incidentNumberFromIncidentsViewPage=dom.findElementByXPath("//a[@class='linked formlink']").getText();
		System.out.println("incident Number From Incidents View Page"+incidentNumberFromIncidentsViewPage);
		dom.findElementByXPath("//a[@class='linked formlink']").click();
		Thread.sleep(500);
		String incidentNumber=dom.findElementByXPath("input[@id='incident.number']").getAttribute("value");
		System.out.println("incident Number"+incidentNumber);
		dom.findElementByXPath("//span[@class='section_view']").click();
		//Thread.sleep(500);
		//System.out.println("incident Number"+incidentNumber);
		dom.findElementByXPath("//div[text()='Default view']").click();
		//5. Assign the incident to  Software group
		dom.findElementByXPath("//input[@id='sys_display.incident.assignment_group']/following::span[2]").click();
		//Thread.sleep(500);
		Set<String> windowHandles=driver.getWindowHandles();
	    System.out.println("Size of window is"+windowHandles.size());
	    List<String> listOfHandles=new ArrayList<String>( windowHandles);
	    //Move control to child window
	    driver.switchTo().window(listOfHandles.get(1));
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("software",Keys.ENTER);
	    driver.findElement(By.xpath("//a[text()='Software']")).click();
	    //Move control to Parent window
	    driver.switchTo().window(listOfHandles.get(0));
	    WebElement frame1=dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		Thread.sleep(500);
		 Actions builder=new Actions(driver);
		 WebElement scroll=dom.findElementByXPath(("//textarea[@id='activity-stream-textarea']"));		
	    builder.scrollToElement(scroll).perform();
	    dom.findElementByXPath("//textarea[@id='activity-stream-textarea']").sendKeys("Incident with "+incidentNumber +"assigned to Software group and updated with Work Notes");
		
		dom.findElementByXPath("button[@id='sysverb_update_bottom']").click();
		Thread.sleep(1000);
		dom.findElementByXPath("button[@id='sysverb_update_bottom']").click();
		Thread.sleep(1000);
		dom.findElementByXPath("//input[@class='form-control']").sendKeys(incidentNumber,Keys.ENTER);
		Thread.sleep(500);
		
		//7. Click on the incident again and Verify the Incident state 
		dom.findElementByXPath("//a[text()='"+incidentNumberFromIncidentsViewPage+"']").click();
		//dom.findElementByXPath("//a[@class='linked formlink']").click();
		Thread.sleep(500);
		dom.setImplicitWait(15);
		dom.findElementByXPath("//span[@class='section_view']").click();
		dom.findElementByXPath("//div[text()='Default view']").click();
		Thread.sleep(500);
		//String incidentGroupAssigned=driver.findElement(By.id("sys_display.incident.assignment_group")).getAttribute("value");
		
		String incidentGroupAssigned=dom.findElementByXPath("//input[@id='sys_display.incident.assignment_group']").getAttribute("value");
		System.out.println("Incident Group Assigned is :"+incidentGroupAssigned);
		if(incidentGroupAssigned.equalsIgnoreCase("Software")) 
		{
			System.out.println("SUCCESS....Incident Assigned to Incident Group successfully");
		}
		else
		{
			System.out.println("Incident NOT Assigned");
		}
		/*
		String state=new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText();
		String urgency=new Select(driver.findElement(By.id("incident.urgency"))).getFirstSelectedOption().getText();
		System.out.println("Incident state After Updated is: "+new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText());
		System.out.println("Incident urgency After Updated is: "+new Select(driver.findElement(By.id("incident.urgency"))).getFirstSelectedOption().getText());
		if(urgency.equalsIgnoreCase("1 - High")  &&  state.equalsIgnoreCase("In Progress")) 
		{
			System.out.println("SUCCESS....Incident updated successfully");
		}
		else
		{
			System.out.println("Incident NOT updated");
		}
		*/
	}
}
