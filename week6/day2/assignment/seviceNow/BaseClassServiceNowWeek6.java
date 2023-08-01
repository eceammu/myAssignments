package week6.day2.assignment.seviceNow;
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

public class BaseClassServiceNowWeek6 {
	//public EdgeDriver driver;
	//public ChromeDriver driver;
	public RemoteWebDriver driver;
	
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
		//driver.get("https://dev177220.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("AyJ3i9vuX*F*");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("pooRoja@55");*/
		//STATIC PARAMETERIZATION
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pWord);
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow  dom =new Shadow(driver);
		dom.setImplicitWait(90);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(25);
		dom.findElementByXPath("//span[text()='Incidents']").click();
		//dom.setImplicitWait(25);
		Thread.sleep(500);
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
