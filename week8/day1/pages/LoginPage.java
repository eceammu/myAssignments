package week8.day1.pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import week8.day1.base.BaseclassPOM;
public class LoginPage extends BaseclassPOM
{
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}


	public LoginPage enterUsername(String uName) throws IOException
	{
	try 
	{
		driver.findElement(By.id("username")).sendKeys(uName);
		reportStep("User name entered Successfully", "Pass");
	} catch (Exception e) 
	{
		e.printStackTrace();
		reportStep("User name NOT entered Successfully", "Fail");
	}	
//	LoginPage lp=new LoginPage();
//	return lp;
	return this;
	}
	public LoginPage enterPassword(String pWord) throws IOException
	{
		try 
		{
			driver.findElement(By.id("password")).sendKeys(pWord);
			reportStep("Password entered Successfully", "Pass");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			reportStep("Password NOT entered Successfully", "Fail");
		}	
		return this;
	}
	public WelcomePage clickLoginButton() throws IOException
	{
		try 
		{
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login Successful", "Pass");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			reportStep("Login NOT Successful", "Fail");
		}
//		WelcomePage wp=new WelcomePage();
//		return wp;
		return new WelcomePage(driver);
	}
}
