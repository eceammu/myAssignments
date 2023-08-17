package Marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Marathon.base.BaseClassLastMarathon;

public class EditIndividualsPageSalesforce extends BaseClassLastMarathon
{
	public EditIndividualsPageSalesforce(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public EditIndividualsPageSalesforce selectSalvation() throws InterruptedException
	{
		System.out.println("Hi 1");
		driver.findElement(By.xpath("//a[@class='select']")).click();
		Thread.sleep(1000);
		return this;
	}
	public EditIndividualsPageSalesforce selectMr() throws InterruptedException
	{
		System.out.println("2");
		WebElement clk = driver.findElement(By.xpath("//a[contains(text(),'Mr.')]"));
		driver.executeScript("arguments[0].click();", clk);
		
		Thread.sleep(3500);
		 return this;
	}
	public EditIndividualsPageSalesforce enterFirstName(String firstName)
	{
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).clear();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(firstName);
		 return this;
	}
	public IndividualsPageSalesforce clickSaveButton() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		return new IndividualsPageSalesforce(driver);
	}
}
