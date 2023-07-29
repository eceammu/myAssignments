package week5.day2.testngtest.assignmenet.leaftaps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassLeafTaps 
{
	
	//public EdgeDriver driver;
	public ChromeDriver driver;
	
	@BeforeSuite
	public void preConditionsSuite()
	{
		System.out.println("Start Of The Report");
		System.out.println("******************");
	}
	@BeforeClass
	public void preConditionsClass()
	{
		System.out.println("Start Of preConditions for Class LeafTaps");
		System.out.println("*****************************************");
		System.out.println("Assign Testcase Details");
		
	}
@BeforeMethod()
public void preConditionsLeafTaps()
{
	driver  = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//Enter UserName and Password Using Id Locator
	WebElement elementUserName=driver.findElement(By.id("username"));
	elementUserName.sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click on Login Button using Class Locator
	driver.findElement(By.className("decorativeSubmit")).click();
	//Click on CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	// Click on Leads Button
	driver.findElement(By.linkText("Leads")).click();
}
@AfterMethod()
public void postConditionsLeafTaps()
{
	//Close the current browser window 
	driver.close();
}
@AfterClass
public void postConditionsClass()
{
	System.out.println("End Of Conditions for Class LeafTaps");
	System.out.println("*****************************************");
	System.out.println("End Of  Testcase Details of LeafTaps Class");
}
@AfterSuite
public void postConditionsSuite()
{
	System.out.println("End Of The Report");
	System.out.println("******************");
}
}
