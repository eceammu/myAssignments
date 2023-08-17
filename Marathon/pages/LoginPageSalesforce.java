package Marathon.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Marathon.base.BaseClassLastMarathon;

public class LoginPageSalesforce extends BaseClassLastMarathon
{
	//Test Steps:
	//1. Login to https://login.salesforce.com
	public LoginPageSalesforce(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public LoginPageSalesforce enterUserName(String uName) throws IOException
	{
		try 
		{
			driver.findElement(By.id("username")).sendKeys(uName);
			reportStep("User name entered Successfully", "Pass");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("User name NOT entered Successfully", "Fail");
		}
		return this;
	}
	public LoginPageSalesforce enterPassWord(String pWord) throws IOException
	{
		try {
			driver.findElement(By.id("password")).sendKeys(pWord);
			reportStep("Password entered Successfully", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Password NOT entered Successfully", "Fail");
		}
		return this;
	}
	public HomePageSalesforce enterLoginButton() throws IOException
	{
		try {
			driver.findElement(By.id("Login")).click();
			reportStep("Login Successful", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Login NOT Successful", "Fail");
		}
		return new HomePageSalesforce(driver);
	}
}
