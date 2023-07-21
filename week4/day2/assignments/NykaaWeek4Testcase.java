package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaWeek4Testcase {

	public static void main(String[] args) throws InterruptedException {
		//Program To handle Nykaa Week 4 Testcase
		//Window Handling:
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1) Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();	
		//2) Mouseover on Brands and Search L'Oreal Paris
		// mouse hover on Mens Fashion
	    WebElement element1=driver.findElement(By.xpath("//a[text()='brands']"));
	    // builder.moveToElement(element1);
	    Actions builder=new Actions(driver);
	    builder.clickAndHold(element1).perform();
		//3) Click L'Oreal Paris
	    driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
	    String pageTitle=driver.getTitle();
	    System.out.println(pageTitle);
        if(pageTitle.contains("Oreal Paris"))
        	System.out.println("The title contains L'Oreal Paris");
        Thread.sleep(1000);
        //5) Click sort By and select customer top rated
        driver.findElement(By.xpath("//span[@class='sort-name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
        Thread.sleep(1000);
        //6) Click Category and click Hair->Click haircare->Shampoo
        driver.findElement(By.xpath("//span[text()='Category']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Hair']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
        Thread.sleep(1000);
        WebElement scroll=driver.findElement(By.xpath("//span[text()='Gender']"));
        builder.scrollToElement(scroll).perform();
        //7) Click->Concern->Color Protection
        driver.findElement(By.xpath("//span[text()='Concern']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
        //8)check whether the Filter is applied with Shampoo
        System.out.println("Filter is applied with Shampoo are");
        String filter1=driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[1]")).getText();
        String filter2=driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[2]")).getText();
        String filter3=driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[3]")).getText();
        System.out.println(filter1+" , "+filter2+" , "+filter3);
        Thread.sleep(1000);
        //9) Click on L'Oreal Paris Colour Protect Shampoo
        driver.findElement(By.xpath("//div[text()='All Products']/following::img[1]")).click();
        Thread.sleep(1000);
        //10) GO to the new window and select size as 175ml
        //to get set of window handles
	  	Set<String> windowHandles = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandles) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int size = windowHandles.size();
	  	System.out.println("The number of windows :are : "+size);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandles = new ArrayList<>(windowHandles);
	  	//switch to the child window
	  	driver.switchTo().window(listofHandles.get(1));
	  	//Select size as 175ml.
	  	//I selected 180 ml as 175 ml not available
	  	 driver.findElement(By.xpath("//span[text()='180ml']")).click();
        //11) Print the MRP of the product
	  	 String price=driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
	  	 System.out.println("Price is:"+price);
	  	//12) Click on ADD to BAG
	  	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
        Thread.sleep(1000);
        //13) Go to Shopping Bag 
        driver.findElement(By.xpath("//span[@class='cart-count']")).click();
        Thread.sleep(1000);
        WebElement frame1=driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	  	//14) Print the Grand Total amount
        driver.switchTo().frame(frame1);
        Thread.sleep(1000);
        String grandTotalAmount=driver.findElement(By.xpath("//p[text()='You Pay']/following::p")).getText();
	  	System.out.println("Grand Total Amount is:"+grandTotalAmount);
	    //15) Click Proceed
	  	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        Thread.sleep(1000);
        //to get set of window handles
	  	Set<String> windowHandlesProceed = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandlesProceed) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int sizeProceed = windowHandlesProceed.size();
	  	System.out.println("The number of windows are : "+sizeProceed);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandlesProceed = new ArrayList<>(windowHandlesProceed);
	  	//switch to the child window
	  	driver.switchTo().window(listofHandlesProceed.get(1));
	  	Thread.sleep(1000);
	  	//16) Click on Continue as Guest
	  	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	  	Thread.sleep(1000);
	  	driver.findElement(By.xpath("(//p[text()='New Address']/preceding::img)[7]")).click();
        Thread.sleep(1000);
        //17) Check if this grand total is the same in step 14
        String grandTotalAmountGuest=driver.findElement(By.xpath("//p[text()='Price Details']/following::p")).getText();
	  	System.out.println("Grand Total Amount  for Continue as guest is:"+grandTotalAmountGuest);
	    if(grandTotalAmount.equalsIgnoreCase(grandTotalAmountGuest))
	    	System.out.println("This grand total is the same in step 14");
	    else
	    	System.out.println("Not Same as Step 14");
	    Thread.sleep(2000);
	    //18) Close all windows
	    driver.quit();
	}

}
