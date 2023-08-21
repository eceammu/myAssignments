package week8.day1.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class ViewLeadsPage extends BaseclassPOM
{
	public ViewLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	   public ViewLeadsPage verifyTitleViewLeadPage()
	   {
		   String title=driver.getTitle();
		   System.out.println("ViewLeadsPage title is "+title);
		   return this;
	   }
	   public ViewLeadsPage getLeadsIDViewLeadPage() throws IOException
	   {   
		 try {
			String text= driver.findElement(By.id("viewLead_companyName_sp")).getText();
			 System.out.println("ViewLeadsPage text is "+text);
			  int index1=text.indexOf("(");
			  System.out.println("index1 :"+index1);
			  int index2=text.indexOf(")");
			  System.out.println("index2 :"+index2);
			  String LeadsID1=text.substring(index1+1,index2);
			  System.out.println("LeadsID :"+LeadsID1);
			  reportStep("Lead created/Edited/Duplicated succesfully with LeadsID :"+LeadsID1, "Pass");
		}
		 catch (Exception e) 
		 {
			e.printStackTrace();
			reportStep("Lead NOT created/Edited/Duplicted","Fail");
		}
		   return this;
	   }
	   public EditLeadsPage clickEditButton() throws IOException
	   {
		   try 
		   {
			driver.findElement(By.linkText("Edit")).click();
			
			reportStep("EDIT Button Clicked succesfully", "Pass");
		} 
		   catch (Exception e) 
		   {
			e.printStackTrace();
			reportStep("EDIT Button NOT Clicked","Fail");
		   }
		   return new EditLeadsPage(driver);
	   }
	   public DuplicateLeadsPage clickDuplicateLeadsButton() throws IOException
	   {
		 //click Duplicate Lead button
			try 
			{
				driver.findElement(By.linkText("Duplicate Lead")).click();
				reportStep("DUPLICATE Button Clicked succesfully", "Pass");
			} catch (Exception e) 
			{	
				e.printStackTrace();
				reportStep("DUPLIATE Button NOT Clicked","Fail");
			}
		   return new DuplicateLeadsPage(driver);
	   }
	   public MyLeadsPage clickDeleteLeadsButton() throws IOException
	   {
		  //click Delete Lead button
		   try 
		   {
			driver.findElement(By.linkText("Delete")).click();
			reportStep("DELETE Button Clicked succesfully", "Pass");
		} 
		   catch (Exception e) 
		   {
			e.printStackTrace();
			reportStep("DELETE Button NOT Clicked","Fail");
		}
		   return new MyLeadsPage(driver);
	   }
	   
}
