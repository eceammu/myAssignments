package Marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Marathon.base.BaseClassLastMarathon;

public class HomePageSalesforce extends BaseClassLastMarathon
{
	//Test Steps:
	//2. Click on the toggle menu button from the left corner
	//3. Click View All 
	public HomePageSalesforce(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public HomePageSalesforce clickToggleMenu()
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}
	public AppLauncherPageSalesforce clickSelectAll()
	{
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncherPageSalesforce(driver);
	}
}
