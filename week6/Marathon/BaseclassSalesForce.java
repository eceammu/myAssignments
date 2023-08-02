package week6.Marathon;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseclassSalesForce {

	public RemoteWebDriver driver;
	
	@BeforeSuite
	public void preConditionsSuiteSalesForce()
	{
		System.out.println("Start Of The Report");
		System.out.println("******************");
	}
	
	@BeforeClass
	public void preConditionsClassSalesForce()
	{
		System.out.println("Start Of preConditions for SalesForce Class");
		System.out.println("*******************************************");
		System.out.println("Assign Testcase Details");
	}
	
	@Parameters({"browser","url","userName","passWord"})
	@BeforeMethod()
	public void newTest(String browserName,String urlName,String uName,String pWord) throws InterruptedException
	{
		//STATIC PARAMETERIZATION
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver  = new EdgeDriver();
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--disable-notifications");
		}
		else 
			if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver  = new ChromeDriver();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
		}
		
		//STATIC PARAMETERIZATION
		driver.get(urlName);
		
		//driver.get("https://testleaf194-dev-ed.develop.my.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("alamelupriya_sec2007@yahoo.co.in");
		//driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("pooRoja@55");
		
		
		//STATIC PARAMETERIZATION
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		
	}
	
	@AfterMethod()
	public void postConditionsSalesForce()
	{
		//Close the current browser window 
		driver.close();
	}
	
	@AfterClass
	public void postConditionsClassSalesForce()
	{
		System.out.println("End Of Conditions for SalesForce Class");
		System.out.println("**************************************");
		System.out.println("End Of Testcase Details of SalesForce Class");
	}
	
	@AfterSuite
	public void postConditionsSuiteSalesForce()
	{
		System.out.println("End Of The Report");
		System.out.println("******************");
	}
}
