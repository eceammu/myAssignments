package week4.Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertificationsTestCases {
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
        // and password as "Leaf@1234" click login
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
       //And mouse hover on Learning On Trailhead
       dom.findElementByXPath("//span[text()='Learning']").click();
       Actions builder=new Actions(driver);
       //6. And mouse hover on Learning On Trailhead
       WebElement element1=dom.findElementByXPath("//span[text()='Learning on Trailhead']");
       // builder.moveToElement(element1);
       builder.clickAndHold(element1).perform();
       // Click on Salesforce Certifications
       WebElement scroll =dom.findElementByXPath("//a[text()='Salesforce Certification']");
       builder.scrollToElement(scroll).perform();
       scroll.click();
       //7. Choose Your Role as Salesforce Architect
       WebElement scrollArchitect =driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]"));
       builder.scrollToElement(scrollArchitect).perform();
       scrollArchitect.click();
       //verify - Salesforce Architect Overview page
       String url=driver.getCurrentUrl();
       if(url.contains("architectoverview"))
    	   System.out.println("Architectoverview page Verified");
       else
    	   System.out.println("Architectoverview page NOT Verified");
       String pageTitle=driver.getTitle();
       System.out.println("Page title is"+pageTitle);
       driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/following::div[1]")).click();
       //8. Get the Text(Summary) of Salesforce Architect 
       WebElement scrollTextArch =driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/parent::div"));
       String role=scrollTextArch.getText();
       System.out.println(role);
       //9. Get the List of Salesforce Architect Certifications Available
       List<WebElement> m =driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
       System.out.println("Total Certifications available for Salesforce Architect Certifications :"+m.size());
       // iterate over list
       for(int i = 0; i< m.size(); i++)
       {
    	   //obtain text
    	   String s = m.get(i).getText();
    	   System.out.println("Certification"+(i+1)+" is: " + s);
    	}
       Thread.sleep(3000);
       //10.Click on Application Architect 
       driver.findElement(By.linkText("Application Architect")).click();
       // 11.Get the List of Certifications available
       List<WebElement> certificates =driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
       System.out.println("Total Certifications available for Application Architect Certifications :"+certificates.size());
       // iterate over list
       for(int j = 0; j< certificates.size(); j++) 
   {
      //obtain text
      String certificatesTitle = certificates.get(j).getText();
      System.out.println("Certification"+(j+1)+" is: " +  certificatesTitle);
   }
   Thread.sleep(3000);
   // 12.Take A snapshot of Certifications.
   WebElement scrollCert =driver.findElement(By.xpath("//a[text()='Platform App Builder']"));
   builder.scrollToElement(scrollCert).perform();
   Thread.sleep(3000);
   //to take screen shot
   File source=driver.getScreenshotAs(OutputType.FILE);
   File dest=new File("./snaps/ApplicationArchitect.png");
   FileUtils.copyFile(source, dest);
}
}
