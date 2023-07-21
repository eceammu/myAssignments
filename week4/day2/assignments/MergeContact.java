package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException 
	{
		// Program To handle Merge Contact TestCase
		//Window Handling:
		//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day2/Assignments/MergeContact.java
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    //3. Click on Login Button using Class Locator
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    //4. Click on CRM/SFA Link
	  	driver.findElement(By.linkText("CRM/SFA")).click();
	    //5. Click on contacts Button
	  	driver.findElement(By.linkText("Contacts")).click();
	  	//6. Click on Merge Contacts using Xpath Locator
	  	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	  	// 7. Click on Widget of From Contact
	  	driver.findElement(By.xpath("//span[@class='requiredField']/following::img")).click();
	    //to get set of window handles
	  	Set<String> windowHandles = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandles) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int size = windowHandles.size();
	  	System.out.println("The number of windows for Widget of From Contact are : "+size);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandles = new ArrayList<>(windowHandles);
	  	//switch to the child window
	  	driver.switchTo().window(listofHandles.get(1));
		 // 8. Click on First Resulting Contact
	  	driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
	  	driver.switchTo().window(listofHandles.get(0));
		// 9. Click on Widget of To Contact
	  	driver.findElement(By.xpath("(//span[@class='requiredField']/following::img)[2]")).click();
	    //to get set of window handles
	  	Set<String> windowHandlesTo = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandlesTo) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int sizeTo = windowHandlesTo.size();
	  	System.out.println("The number of windows for Widget of To Contact are : "+sizeTo);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandlesTo = new ArrayList<>(windowHandlesTo);
	  	//switch to the child window
	  	driver.switchTo().window(listofHandlesTo.get(1));
	  	//10. Click on Second Resulting Contact
	  	driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
	  	driver.switchTo().window(listofHandles.get(0));
	  	//11. Click on Merge button using Xpath Locator
	  	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    //12. Accept the Alert
	  	Alert confirmAlert=driver.switchTo().alert();
	  	//Read the text of ALERT
	  	String message=confirmAlert.getText();
	  	System.out.println("Alert Message Is: "+message);
	  	//Accept Alert
	    confirmAlert.accept();
	    Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
	  	
	  	
	}

}
