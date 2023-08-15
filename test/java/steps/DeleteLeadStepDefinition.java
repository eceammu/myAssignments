package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DeleteLeadStepDefinition extends BaseClass
{
    @When("Click Delete Lead Link") 
    public void clickDeleteLeadLink()
    {
    	System.out.println("Clicking Delete Lead Link");
    	driver.findElement(By.linkText("Delete")).click();
    }
    
    @And("Check Table has no records so Lead deleted")
    public void checkDeleteLead()
    {
    	System.out.println("Table Delete Display");
    	String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println("Text is"+text);
		if (text.equals("No records to display")) 
		{
			System.out.println("Lead deleted successfully");
		}
		else 
		{
			System.out.println("Lead is not deleted ");
		}
	}
}
    
