package Marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Marathon.base.BaseClassLastMarathon;

public class AppLauncherPageSalesforce extends BaseClassLastMarathon
{
	    //Test Steps:
		//4.click Individuals from App Launcher
		public AppLauncherPageSalesforce(RemoteWebDriver driver)
		{
			this.driver=driver;
		}
		public IndividualsPageSalesforce selectIndividuals() throws InterruptedException
		{
			WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
			driver.executeScript("arguments[0].scrollIntoView();", scroll);
			WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
			driver.executeScript("arguments[0].click();", individual);
			Thread.sleep(2000);
			return new IndividualsPageSalesforce(driver);
			
		}
}
