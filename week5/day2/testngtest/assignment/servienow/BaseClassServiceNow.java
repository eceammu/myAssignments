package week5.day2.testngtest.assignment.servienow;

import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClassServiceNow {
	//public EdgeDriver driver;
	public ChromeDriver driver;
		
	@BeforeSuite
	public void preConditionsSuiteServiceNow()
	{
		System.out.println("Start Of The Report");
		System.out.println("******************");
	}
	@BeforeClass
	public void preConditionsClassServiceNow()
	{
		System.out.println("Start Of preConditions for ServiceNow Class");
		System.out.println("*******************************************");
		System.out.println("Assign Testcase Details");
	}
	@BeforeMethod()
	public void neewTest() throws InterruptedException
	{
		driver  = new ChromeDriver();
		driver.get("https://dev177220.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.manage().window().maximize();
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("AyJ3i9vuX*F*");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("pooRoja@55");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow  dom =new Shadow(driver);
		dom.setImplicitWait(90);
	    //dom.findElementByXPath("div[@class='sn-polaris-navigation polaris-header-menu']/following::div").click();
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(25);
		dom.findElementByXPath("//span[text()='Incidents']").click();
		//dom.setImplicitWait(25);
		Thread.sleep(2000);
		int size=dom.findElements("iframe").size();
		//int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Size :"+size);
		//WebElement frame1=dom.findelementByXPath(By.cssSelector("iframe"));
		WebElement frame1=dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
	}
	@AfterMethod()
	public void postConditionsServiceNow()
	{
		//Close the current browser window 
		driver.close();
	}
	@AfterClass
	public void postConditionsClassServiceNow()
	{
		System.out.println("End Of Conditions for ServiceNow Class");
		System.out.println("**************************************");
		System.out.println("End Of Testcase Details of ServiceNow Class");
	}
	@AfterSuite
	public void postConditionsSuiteServiceNow()
	{
		System.out.println("End Of The Report");
		System.out.println("******************");
	}

}
