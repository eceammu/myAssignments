package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class ChildWindowLookUpMergeLeadPage extends BaseclassPOM
{
	
	   public ChildWindowLookUpMergeLeadPage enterFirstNameFromLookUp()
	   {
		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Alamelumangai");
		   return this;
		}
	   public ChildWindowLookUpMergeLeadPage enterFirstNameToLookUp()
	   {
		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ammu");
		   return this;
		}
	   
	   public ChildWindowLookUpMergeLeadPage clickFindLeadsChildWindow() throws InterruptedException
	   {
		   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(1000);
		   return this;
		}
	   public ChildWindowLookUpMergeLeadPage clickLeadsID() throws InterruptedException
	   {

			leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println("leadID in Child Window is :"+leadID);
			System.out.println("leadID in Child  :"+leadID);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			Thread.sleep(1000);
		    return this;
		}
	   public ChildWindowLookUpMergeLeadPage clickLeadsIDFrom() throws InterruptedException
	   {

		    fromLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println("leadID in From Child Window is :"+fromLeadID);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			Thread.sleep(1000);
		    return this;
		}
	   public ChildWindowLookUpMergeLeadPage clickLeadsIDTo() throws InterruptedException
	   {

		    toLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println("leadID in To Child Window is :"+toLeadID);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			Thread.sleep(1000);
		    return this;
		}
	   
	   public MergeLeadsPage switchToParentWindow()
	   {
		   Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			driver.switchTo().window(allhandles.get(0));
		    return new MergeLeadsPage();
		}
		
		
		

}
