package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuythevalueHandleFrameAlert {

	public static void main(String[] args) throws InterruptedException {
		//Program To handle Buythevalue Handle Frame and Alert TestCase
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Load https://buythevalue.in/
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		//2.Click on first product (eg: Hamdard Hing - 50GM)
		//div[@class='product-image']//a
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='product-image']//a)[1]")).click();
		Thread.sleep(1000);
		/*
		//Handle Frame
		//3. Close chat widget
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement buttonChat =driver.findElement(By.xpath("//div[contains(@class,'hat')]//button']"));
        //Perform Click on CHECK OUT button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", buttonChat);
        Thread.sleep(3000);
		driver.navigate().refresh(); 
	    Thread.sleep(1000);
		try {
			WebElement frameElement=driver.findElement(By.xpath("(//iframe)[2]"));
			driver.switchTo().frame(frameElement);
			frameElement.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement frameElement=driver.findElement(By.xpath("(//iframe)[2]"));
			driver.switchTo().frame(frameElement);
			frameElement.click();
		}
		*/
		//4. Enter the pincode 
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("600063");
		Thread.sleep(1000);
		//5. Click on Check
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(1000);
		//6. Click on ADD TO CART
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[1]")).click();
		Thread.sleep(1000);
		//7. Click on View (closes itself by chromeoptions handling)
		//8. Click on CHECK OUT
        WebElement button =driver.findElement(By.xpath("//span[text()='Checkout']"));
      //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //Perform Click on CHECK OUT button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='checkout']")).click();
        Alert alertShopping=driver.switchTo().alert();
        System.out.println("Alert Message is: "+alertShopping.getText());
        alertShopping.accept();
        System.out.println("Alert Accepted");
        System.out.println("Page Title is:"+driver.getTitle());
        Thread.sleep(1000);
        driver.close();
	}

}
