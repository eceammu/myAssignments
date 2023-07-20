package week4.Marathon;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertificationsTestCase {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Program To handle Administrator Certifications TestCase
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch Salesforce application https://login.salesforce.com/
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        // 2. Login with username as "hari.radhakrishnan@qeagle.com" 
        //and password as "Leaf@1234" click login
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
       driver.findElement(By.xpath("//input[@id='Login']")).click();
       //3. Click on Learn More link in Mobile Publisher
       driver.findElement(By.xpath("//span[text()='Learn More']")).click();
       Set<String> windowHandles=driver.getWindowHandles();
       System.out.println("Size of window is"+windowHandles.size());
       List<String> listOfHandles=new ArrayList<String>( windowHandles);
       driver.switchTo().window(listOfHandles.get(1));
       //4. Click confirm on Confirm redirect
       driver.findElement(By.xpath("//button[text()='Confirm']")).click();
       // 5. Click Learning 
       Shadow  dom =new Shadow(driver);
       // dom.findElementByXPath("//span[@class='nav-item-label--l1' AND text()='Learning']").click();org.openqa.selenium.InvalidElementStateException:
       dom.findElementByXPath("//span[text()='Learning']").click();
       Actions builder=new Actions(driver);
       //6. And mouse hover on Learning On Trailhead
       WebElement element1=dom.findElementByXPath("//span[text()='Learning on Trailhead']");
       // builder.moveToElement(element1);
       builder.clickAndHold(element1).perform();
       // 7. Clilck on Salesforce Certifications
       WebElement scroll =dom.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.scrollToElement(scroll).perform();
		scroll.click();
		//8. Click on first resulting Ceritificate
		//WebElement scrollAdmn =dom.findElementByXPath("//a[text()='Administrator']");
		WebElement scrollAdmn =driver.findElement(By.xpath("//a[text()='Administrator']"));
		builder.scrollToElement(scrollAdmn).perform();
		scrollAdmn.click();
		//9. verify - Administrator Overview page
		String url=driver.getCurrentUrl();
		if(url.contains("administrator"))
			System.out.println("Administrator Overview page Verified");
		else
			System.out.println("Administrator Overview page NOT Verified");
		String pageTitle=driver.getTitle();
		System.out.println("Page title is"+pageTitle);
		//10.Print the Certifications available for Administrator Certifications (List)
		List<WebElement> m =driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		System.out.println("Total Certifications available for Administrator Certifications :"+m.size());
		// iterate over list
		for(int i = 0; i< m.size(); i++) 
		{
			//obtain text
			String s = m.get(i).getText();
			System.out.println("Certification"+(i+1)+" is: " + s);
		}
		WebElement scrollCert =driver.findElement(By.xpath("//a[text()='Business Administration Specialist']"));
		builder.scrollToElement(scrollCert).perform();
		Thread.sleep(3000);
		//11.Take A snapshot of Certifications.
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/AdminSalesForce.png");
		FileUtils.copyFile(source, dest);
		}
	}
	
	


