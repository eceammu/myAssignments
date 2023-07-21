package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonWeek4TestCase {
	public static void main(String[] args) throws InterruptedException, IOException {
		//Program To handle Amazon Week4 Assignment Testcase
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//2.search as oneplus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		Thread.sleep(1000);
		//3.Get the price of the first product
		String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		price=price.replaceAll("\\W", "");
		System.out.println("Price of First Product for  oneplus 9 pro is :"+price );
		//4. Print the number of customer ratings for the first displayed product
		driver.findElement(By.xpath("(//span[text()='Results'])/following::a[3]")).click();
		String rating=driver.findElement(By.xpath(" //table[@id='histogramTable']/preceding::span[2]")).getText();
	    System.out.println("Csustomer ratings for the first displayed product for  oneplus 9 pro is : "+rating );
	    // 5. Click the first text link of the first image
		driver.findElement(By.xpath("(//span[text()='Results'])/following::a[2]")).click();
		//6. Take a screen shot of the product displayed
		Set<String> windowHandles=driver.getWindowHandles();
	    System.out.println("Size of window is"+windowHandles.size());
	    List<String> listOfHandles=new ArrayList<String>( windowHandles);
	    //Move control to child window
	    driver.switchTo().window(listOfHandles.get(1));
	    File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/AmazonWeek4AssignOneplus.png");
		FileUtils.copyFile(source, dest);
		Thread.sleep(1000);
		//7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("attach-close_sideSheet-link")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nav-cart-count")).click();
		//8. Get the cart subtotal and verify if it is correct.
		String subtotal = driver.findElement(By.xpath("//span[@class='currencyINR']/parent::span")).getText();
		System.out.println("SubTotal"+subtotal);
		subtotal=subtotal.replaceAll(".00", "").replaceAll("\\W", "");
		System.out.println("SubTotal:"+subtotal);
		if(price.equalsIgnoreCase(subtotal))
			System.out.println("Sub Total Verified");
		Thread.sleep(1000);
		//9.close the browser
		driver.quit();
		
		
	}

}
