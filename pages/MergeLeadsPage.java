package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.BaseclassPOM;

public class MergeLeadsPage extends BaseclassPOM
{
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
	    return new ChildWindowLookUpMergeLeadPage();
	}
   public MergeLeadsPage mergeButtonlickMergeLeadsPage()
   {
	   driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    return this;
	}
   public MyLeadsPage acceptAlert()
   {
	   driver.switchTo().alert().accept();
	    return new MyLeadsPage();
	}
   
	
}
