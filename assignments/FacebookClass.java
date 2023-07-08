package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookClass {

	public static void main(String[] args)
	{
		
			// Face Book
			ChromeDriver driver=new ChromeDriver();
			 driver.get("https://en-gb.facebook.com/");
			 driver.manage().window().maximize();
			 //implicit wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Click on Create new account link
				driver.findElement(By.linkText("Create new account")).click();
				//enter first name
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("AlameluMangai");
				
				//driver.findElement(By.name("firstname")).sendKeys("AlameluMangai");
				
				//enter Last name
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thiagarajan");
				//driver.findElement(By.name("lastname")).sendKeys("Thiagarajan");
				//enter mobile number or email address
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("eceammu@gmail.com");
				
				driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("eceammu@gmail.com");
				//Enter new password
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("rajanthi");
				
				
				WebElement dayDD=driver.findElement(By.id("day"));
				Select selectdayDD=new Select(dayDD);
				selectdayDD.selectByIndex(26);
				
				WebElement monthDD=driver.findElement(By.id("month"));
				Select selectMonthDD=new Select(monthDD);
				selectMonthDD.selectByIndex(8);
				
				WebElement yearDD=driver.findElement(By.id("year"));
				Select selectYearDD=new Select(yearDD);
				 selectYearDD.selectByVisibleText("1986");
				 driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
				 
	}

}
