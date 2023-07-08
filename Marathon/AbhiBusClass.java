package week2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBusClass {

	public static void main(String[] args) {
		//  Abhi Bus Class
		//Launch  Chrome browser 
		ChromeDriver driver=new ChromeDriver();
		//implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.abhibus.com/");
		 driver.manage().window().maximize();
		 //Click on Bus
		 driver.findElement(By.linkText("Bus")).click();
		 //Type "Chennai" in the FROM text box
		 driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		 //Click the first option from the pop up box
		 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		 //Type "Bangalore" in the TO text box 
		 driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		 //Click the first option from the pop up box
		 driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		 //Select tomorrow's date in the Date field
		 driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		 driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		 //Click Search Buses
		 driver.findElement(By.xpath("//a[text()='Search']")).click();
		// Print the name of the first resulting bus
		String title= driver.findElement(By.xpath("//div[@class='search-column1']/h2[1]")).getText();
		System.out.println("Bus is "+title);
		//Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		//Print the first resulting bus seat count
		String title1= driver.findElement(By.xpath("//div[@class='search-column2']//p")).getText();
		System.out.println("Seats Available is "+title1);
		//Click Select Seat
		driver.findElement(By.xpath("//div[@class='col2']//a")).click();
		//Choose any one Available seat
		driver.findElement(By.xpath("//li[contains(@class,'sleeper available')]/a")).click();
		//Print Seats Selected ,Total Fare
		String busSelected= driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println("Selected Bus is "+busSelected);
		String ticketFare= driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("Ticket Fare is "+ticketFare);
		//Select Boarding Point  and Dropping Point
		WebElement boardingPointDD=driver.findElement(By.id("boardingpoint_id"));
		Select selectBoardingPointDD=new Select(boardingPointDD);
		selectBoardingPointDD.selectByIndex(1);
		WebElement droppingPointDD=driver.findElement(By.id("droppingpoint_id"));
		Select selectDropingPointDD=new Select(droppingPointDD);
		selectDropingPointDD.selectByIndex(1);
		//Select Boarding Point  and Dropping Point
		//Get the page title
		String titlePage=driver.getTitle();
		System.out.println("Page Title is "+titlePage);
		//Close the browser
		driver.close();
		
	}

}
