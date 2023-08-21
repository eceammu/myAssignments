package week8.day1.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import week9.Marathon.utils.ReadExcelSalesforce;

public class BaseclassPOM 
{
public  RemoteWebDriver driver;
public static	String  leadID;	 
public static	String  fromLeadID;
public static	String  toLeadID;
public String  excelFileName;
public String  excelSheetName;
public static ExtentReports extent;
public String testName,testDescription,testCatagory,TestAuthor;
public static ExtentTest test;

@BeforeSuite
public void startReport()
{
	 // Common for all the test cases (Step1 to Step3)
    // Step1: Set up physical report path
	int randNum=(int)(Math.random()*99999999+10000000);
	String reportName="Report"+randNum+".html";
	System.out.println("Report Name :"+reportName);
    ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/"+reportName);
    reporter.setAppendExisting(true);
    // to keep the report history
    //reporter.setAppendExisting(true);
    // Step2: Create object for ExtentReports
    extent = new ExtentReports();
    
    // Step3: attach the data with physical file
    extent.attachReporter(reporter);
}

@BeforeClass
public void testaseDetails()
{
    test=extent.createTest(testName,testDescription);
	test.assignCategory(testCatagory);
	test.assignAuthor(TestAuthor);
}
public int takeSnaps() throws IOException
{
	int randNum=(int)(Math.random()*99999999+10000000);
	//to take screen shot
	   File source=driver.getScreenshotAs(OutputType.FILE);
	   File dest=new File("./snaps/img"+randNum+".png");
	   FileUtils.copyFile(source, dest);
	   System.out.println("{"+randNum+"}");
	   return randNum;
}


public void reportStep(String msg,String status) throws IOException
{
	String  filenameimg;
	filenameimg = "img"+takeSnaps()+".png";
	System.out.println("filenameimg"+filenameimg);
	if(status.equalsIgnoreCase("Pass"))
		//test.pass(msg);
		
		test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/"+filenameimg).build());
	else if(status.equalsIgnoreCase("Fail"))
		//test.fail(msg);
		test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/"+filenameimg).build()); //test step1);
		
}

@BeforeMethod
public void preCondition()
{
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@AfterMethod
public void postCondition()
{
   driver.close();	
}
@DataProvider(indices=0)
public String[][] sendData() throws IOException 
{
	return ReadExcelSalesforce.readExcelData(excelFileName, excelSheetName);
}
@AfterSuite()
public void stopReport()
{
	extent.flush();
}
}
