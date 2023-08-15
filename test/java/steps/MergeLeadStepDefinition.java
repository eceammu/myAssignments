package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadStepDefinition extends BaseClass
{
	@And("Click on Merge Lead") 
	public void clickMergeLeadLink()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@When("Click on From Lead Lookup") 
	public void clickFromLeadLookup()
	   {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	   }
	
	@And("Move control to child window") 
	 public void moveChildWindow()
	   {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	   }
	
	@And("Enter the firstname in child window as (.*)$") 
	public void enterFirstnameChildWindow(String firstNameC)
	   {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstNameC);
	   }
	
   @And("Find LeadID of first resulting Lead in table") 
   public void findFromLeadID()
    {
       leadID= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	   System.out.println("leadID :"+leadID);
	}
   
   @And("Find LeadID of first resulting Lead in table it is To leadID") 
   public void findLeadID()
    {
	   String toleadID= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	   System.out.println("TO leadID :"+toleadID);
	}
   @And("Move control to parent window") 
   public void moveParentWindow()
   {
	   Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
	   driver.switchTo().window(allhandles.get(0));
   }
   
   @When("Click on To Lead Lookup") 
   public void clickToLeadLookup()
   {
	   driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
   }
   
   @When("Click on Merge Lead Link") 
   public void clickMergeLead()
   {
	   driver.findElement(By.xpath("//a[text()='Merge']")).click();
   }
   
   @And("Accept Alert") 
   public void aceptAlert()
   {
	   
		driver.switchTo().alert().accept();
   }
   
   
   @And("Enter LeadID") 
   public void enterLeadID() throws InterruptedException
   {
	   driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		Thread.sleep(3000);
   }
   
   @And("Check From Lead has no records so merged two leads correctly") 
   public void verifyMergeLead()
   {
	   
	   String text = driver.findElement(By.className("x-paging-info")).getText();
	   System.out.println("text :"+text);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
   }
   }
