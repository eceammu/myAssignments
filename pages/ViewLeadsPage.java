package pages;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class ViewLeadsPage extends BaseclassPOM
{
	   public ViewLeadsPage verifyTitleViewLeadPage()
	   {
		   String title=driver.getTitle();
		   System.out.println("ViewLeadsPage title is "+title);
		   return this;
	   }
	   public ViewLeadsPage getLeadsIDViewLeadPage()
	   {   
		 String text= driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println("ViewLeadsPage text is "+text);
		  int index1=text.indexOf("(");
		  System.out.println("index1 :"+index1);
		  int index2=text.indexOf(")");
		  System.out.println("index2 :"+index2);
		  String LeadsID=text.substring(index1+1,index2);
		  System.out.println("LeadsID :"+LeadsID);
		   return this;
	   }
	   public EditLeadsPage clickEditButton()
	   {
		   driver.findElement(By.linkText("Edit")).click();
		   return new EditLeadsPage();
	   }
	   public DuplicateLeadsPage clickDuplicateLeadsButton()
	   {
		 //click Duplicate Lead button
			driver.findElement(By.linkText("Duplicate Lead")).click();
		   return new DuplicateLeadsPage();
	   }
	   public MyLeadsPage clickDeleteLeadsButton()
	   {
		  //click Delete Lead button
		   driver.findElement(By.linkText("Delete")).click();
		   return new MyLeadsPage();
	   }
	   
}
