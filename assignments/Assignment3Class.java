package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Class {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Get the page title
			String titlePage=driver.getTitle();
			System.out.println("Page Title is "+titlePage);
			//Click the first option from the pop up box
			 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			//Close the browser
			driver.close();
	}

}
