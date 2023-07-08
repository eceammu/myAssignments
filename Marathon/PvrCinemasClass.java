package week2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemasClass {

	public static void main(String[] args) throws InterruptedException {
		// Pvr Cinemas Class
		//Launch  Chrome browser 
		ChromeDriver driver=new ChromeDriver();
		//implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.pvrcinemas.com/");
		 driver.manage().window().maximize();
		 //Click  on Movie Library
		 driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		 driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		 WebElement cityDD=driver.findElement(By.name("city"));
			Select selectCity=new Select(cityDD);
			selectCity.selectByVisibleText("Chennai");
			WebElement genreDD=driver.findElement(By.name("genre"));
			Select selectGenreDD=new Select(genreDD);
			selectGenreDD.selectByVisibleText("ANIMATION");
			WebElement langDD=driver.findElement(By.name("lang"));
			Select selectLangDD=new Select(langDD);
			selectLangDD.selectByVisibleText("ENGLISH");
			//select[@name='city']
			driver.findElement(By.xpath("//button[text()='Apply']")).click();
			//driver.findElement(By.cssSelector("div.movie-list div")).click();
			Thread.sleep(5000);
			String titlePage=driver.getTitle();
			System.out.println("Page Title is "+titlePage);
			//driver.navigate().refresh(); 
			//driver.findElement(By.cssSelector("web element locator")).click();
			 WebElement movie = driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']//div[2]"));
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()", movie);
			  driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
			  WebElement cinemaNameDD=driver.findElement(By.id("cinemaName"));
				Select selectCinemaNameDD=new Select(cinemaNameDD);
				selectCinemaNameDD.selectByIndex(2);
				driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input")).click();
				//div[@class='datepicker-container datepicker-default']/input
				driver.findElement(By.xpath(" //span[contains(@class,'day-unit ng-star-inserted')][2]")).click();
				 WebElement timingsDD=driver.findElement(By.name("timings"));
					Select selectTimings=new Select(timingsDD);
					selectTimings.selectByIndex(3);
					driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
					driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Alamelumangai");
					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("eceammu@gmail.com");
					driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9095632408");
					 WebElement foodDD=driver.findElement(By.name("food"));
						Select selectFoodDD=new Select(foodDD);
						selectFoodDD.selectByVisibleText("Yes");
						driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No Comments");
						driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
						//driver.findElement(By.xpath("(//li[@class='cancel-btn text-center']/button)[3]")).click();
						//driver.findElement(By.xpath("//button[@class='btn already-member' and text()='CANCEL']")).click();
						 WebElement cancel = driver.findElement(By.xpath("//button[@class='btn already-member' and text()='CANCEL']"));
						  JavascriptExecutor js1 = (JavascriptExecutor)driver;
						  js1.executeScript("arguments[0].click()",cancel);
						  Thread.sleep(5000);
						  WebElement cancelOTP =driver.findElement(By.xpath("//button[@class='swal2-close']"));
						  JavascriptExecutor js2 = (JavascriptExecutor)driver;
						  js2.executeScript("arguments[0].click()",cancelOTP);
							String title=driver.getTitle();
							System.out.println("Page Title is "+title);
						//JavascriptExecutor javascript = (JavascriptExecutor) driver;
						//javascript.executeScript("var element = document.querySelector('locator'); element.value = 'whatever';")
						//li[@class='cancel-btn text-center']/button[3]
			//div[@class='movie-wrapper ng-star-inserted']
			//driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']//div[2]")).click();
			//div[@class='movie-wrapper ng-star-inserted']//div
		//driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']/div)[1]")).click();
			//WebElement l = driver.findElement(By.xpath("//img[@alt='https://originserver-static1-uat.pvrcinemas.com/app/movies']"));
			 //driver.findElement(By.xpath("//img[contains(@src,'https://originserver-static1-uat.pvrcinemas.com/app/movies/')]")).click();
			// WebElement wb= driver.findElement(By.xpath("//img[contains(@src,'https://originserver-static1-uat.pvrcinemas.com/app/movies/')]"));
			//div[@class='movie-wrapper ng-star-inserted']/div
			 //wb.click();
	}

}
