package week2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBag {

	public static void main(String[] args) {
		// Amazon Bag Class
		//Launch  Chrome browser 
				ChromeDriver driver=new ChromeDriver();
				//implicit wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 driver.get("https://www.amazon.in/");
				 driver.manage().window().maximize();
				//Type "Bags" in the Search box
				 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
				//div[(contains(@class,'s-suggestion-ellipsis-direction') ) AND (text()='bags for b')]
				 driver.findElement(By.xpath("//span[text()=' for boys']")).click();
				// Print the total number of results
	String stringTotalResults= driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
	//System.out.println(stringTotalResults);
	String totalResults = stringTotalResults.substring(7, 28);
    System.out.println("Total number of results for bag search : "+totalResults);
   //Select the first 2 brands in the left menu(like American Tourister, Generic)
    driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
    driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
    driver.findElement(By.xpath("//span[text()='Featured']")).click();
    //Choose New Arrivals (Sort)
    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
  //Print the first resulting bag info (name, discounted price)
    String bagName= driver.findElement(By.xpath("((//div[@class='a-section a-spacing-base a-text-center'])[1]//span)[2]")).getText();
	System.out.println("First resulting bag name is "+bagName);
	String discountPrice= driver.findElement(By.xpath("((//div[@class='a-section a-spacing-base a-text-center'])[1]//span)[5]")).getText();
	System.out.println("First resulting bag discount Price is "+discountPrice);
	//Get the page title
			String titlePage=driver.getTitle();
			System.out.println("Page Title is "+titlePage);
			//Close the browser
			driver.close();
	}

}
