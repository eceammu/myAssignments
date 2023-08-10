package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseclassPOM;
public class LoginPage extends BaseclassPOM
{

	public LoginPage enterUsername()
	{
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");	
//	LoginPage lp=new LoginPage();
//	return lp;
	return this;
	}
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		return this;
	}
	public WelcomePage clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
//		WelcomePage wp=new WelcomePage();
//		return wp;
		return new WelcomePage();
	}
}
