package week4.Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.sukgu.Shadow;

public class ServiceNowTestCase 
{
public static void main(String[] args) throws InterruptedException, IOException {
// Marathon test case no 3
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(option);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//1. Launch ServiceNow application
driver.get("https://dev31913.service-now.com/");
driver.manage().window().maximize();
//2. Login with valid credentials username as admin and password
driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("q+NozS5Qe8!E");
driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
Shadow  dom =new Shadow(driver);
dom.setImplicitWait(30);
dom.findElementByXPath("//div[@id='all']").click();
dom.findElementByXPath("//span[text()='Service Catalog']").click();
//dom.setImplicitWait(20);
//4. Click on  mobiles
WebElement frameElement=dom.findElementByXPath("//iframe[@id='gsft_main']");
driver.switchTo().frame(frameElement);
driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
//5. Select Apple iphone6s
WebElement elementMobile=driver.findElement(By.xpath(" (//a[@class='service_catalog'])[1]"));
String mobileName=elementMobile.getText();
System.out.println(mobileName);
if(mobileName.contains("iPhone 6s"))
elementMobile.click();
// 6. Update color field to Gold and storage field to 128GB
WebElement colourDD=driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[1]"));
Select selectColourDD=new Select(colourDD);
selectColourDD.selectByVisibleText("Gold");
WebElement storageDD=driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
Select selectStorageDD=new Select(storageDD);
selectStorageDD.selectByVisibleText("128");
// 7. Select  Order now option
driver.findElement(By.id("oi_order_now_button")).click();
//8. Verify order is placed and copy the request number"
WebElement elementOrder=driver.findElement(By.xpath("//div[@class='notification notification-success']"));
String message=elementOrder.getText();
System.out.println(message);
if(message.contains("Thank you, your request has been submitted"))
System.out.println("Verified, order is placed");
WebElement orderID=driver.findElement(By.xpath("//a[@id='requesturl']"));
String orderNumber=orderID.getText();
System.out.println("Request Number:"+orderNumber);
//9. Take a snapshot of the ordered page.
File source=driver.getScreenshotAs(OutputType.FILE);
File dest=new File("./snaps/ServiceNow.png");
FileUtils.copyFile(source, dest);
}
}
