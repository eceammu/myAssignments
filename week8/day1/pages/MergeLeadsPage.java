package week8.day1.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;

public class MergeLeadsPage extends BaseclassPOM
{
	public MergeLeadsPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
   public MergeLeadsPage fromLeadLookUpClick()
   {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	return this;
	}
   public MergeLeadsPage toLeadLookUpClick()
   {
	   driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	return this;
	}
   public ChildWindowLookUpMergeLeadPage switchToChildWindow()
   {
	   Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	    return new ChildWindowLookUpMergeLeadPage(driver);
	}
   public MergeLeadsPage mergeButtonlickMergeLeadsPage() throws IOException
   {
	   
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    return this;
	}
   public MyLeadsPage acceptAlert() throws IOException
   {
	   try {
		   driver.switchTo().alert().accept();
			reportStep("MERGE Button Clicked succesfully,Alert accepted", "Pass");
		} 
		   catch (Exception e)
		   {
			e.printStackTrace();
			reportStep("MERGE Button NOT Clicked", "Fail");
		}
	  
	    return new MyLeadsPage(driver);
	}
   
	
}
