package pages;

import org.openqa.selenium.By;
import base.BaseclassPOM;

public class MyHomePage extends BaseclassPOM
{
	public MyLeadsPage clickLeadsLink()
	{
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
}
