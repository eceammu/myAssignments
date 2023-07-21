package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealTestCaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Program To handle SnapDeal Window Verify TestCase
	    //Window Handling:
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		//2. Go to Mens Fashion
		Actions builder=new Actions(driver);
		// mouse hover on Mens Fashion
	    WebElement element1=driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
	    // builder.moveToElement(element1);
	    builder.clickAndHold(element1).perform();
	    //3. Go to Sports Shoes
	    driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();  
	    Thread.sleep(2000);
	    //4. Get the count of the sports shoes
	    String itemCount=driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	    System.out.println("Count of the sports shoes: "+itemCount);
	    //5. Click Training shoes
	    driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();  
	    Thread.sleep(2000);
	    //6. Sort by Low to High
	    driver.findElement(By.xpath("//span[text()='Sort by:']")).click();  
	    driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();  
	    Thread.sleep(2000);
	    //7. Check if the items displayed are sorted correctly
	    //get all product price
        List<WebElement> ListItems = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        List<Integer> unsortedList = new ArrayList<>();
        //Iterate over each ListItems to get text
        for (WebElement each : ListItems)
        {
            System.out.println("List sports shoe Price Text : " + each.getText());
            System.out.println("List sports shoe Price Text : " + each.getText().substring(4));
            int value = Integer.parseInt(each.getText().substring(4));
            System.out.println(value);
            unsortedList.add(value);
        }
        List<Integer> copyOflist = new ArrayList<>(unsortedList);
        Collections.sort(copyOflist);
        System.out.println("Original list"+unsortedList);
        System.out.println("Sorted List"+copyOflist);
        // compare unsortedList with copyOflist
        if (unsortedList.equals(copyOflist) == true) {
            System.out.println("The items displayed are sorted correctly");
        }
        else
        {
            System.out.println("The items displayed are NOT sorted");
        }
        //8.Select the price range (900-1200)I changed starting value as 500 as no results available in price range(900-1200)
        driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("500");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
        Thread.sleep(1000);
        //9.Filter with color Navy )I changed color as black,as no results available for Navy colour
       // WebElement scroll =driver.findElement(By.xpath("//a[contains(text(),'Navy')]"));
		//builder.scrollToElement(scroll).perform();
        WebElement scroll =driver.findElement(By.xpath("//button[text()='View More ']"));
        builder.scrollToElement(scroll).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='filter-section '][3]//span)[4]")).click();
		Thread.sleep(1000);
		//10 verify the all applied filters 
		String filterApplied=driver.findElement(By.xpath("//div[@class='filters']")).getText();
		System.out.println("Filter Applied"+filterApplied);
		//11. Mouse Hover on first resulting Training shoes
		WebElement element2=driver.findElement(By.xpath("//picture[@class='picture-elem']"));
	    // builder.moveToElement(element1);
	    builder.clickAndHold(element2).perform();
	    //12. click QuickView button
	    driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	    Thread.sleep(3000);
	    //13. Print the cost and the discount percentage
	    String price=driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price:"+price);
		Thread.sleep(1000);
	    String discount=driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount:"+discount);
		//14. Take the snapshot of the shoes.
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/snapdealShoesWeek4.png");
		FileUtils.copyFile(source, dest);
		Thread.sleep(1000);
		//15. Close the current window
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		//16. Close the main window
		driver.close();
	   
	    		
	}

}
