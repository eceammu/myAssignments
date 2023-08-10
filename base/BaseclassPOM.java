package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseclassPOM 
{
public static ChromeDriver driver;
public static	String  leadID;	 
public static	String  fromLeadID;
public static	String  toLeadID;
@BeforeMethod
public void preCondition()
{
	driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@AfterMethod
public void postCondition()
{
   driver.close();	
}
}
