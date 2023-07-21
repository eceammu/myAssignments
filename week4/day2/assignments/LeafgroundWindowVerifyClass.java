package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundWindowVerifyClass {

	public static void main(String[] args) {
		// Program To handle Leaf ground Window Verify TestCase
	    //Window Handling:
		//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day2/Assignments/MergeContact.java
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch URL "https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0"
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		//TEST CASE 1:Click and Confirm new Window Opens
		System.out.println("TEST CASE 1:Click and Confirm new Window Opens");
		System.out.println("******************************************");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//to get set of window handles
	  	Set<String> windowHandles = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandles) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int size = windowHandles.size();
	  	System.out.println("The number of windows :Click and Confirm new Window Opens Option are : "+size);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandles = new ArrayList<>(windowHandles);
	  	//switch to the child window
	  	driver.switchTo().window(listofHandles.get(1));
	  	String title=driver.getTitle();
	    System.out.println("Child Window Title:"+title);
	    //Close Child Window
	    driver.close();
	    //switch to the Parent window
	  	driver.switchTo().window(listofHandles.get(0));
	   //TEST CASE 2:Close all windows except Primary
	  	System.out.println("TEST CASE 2:Close all windows except Primary");
	  	System.out.println("******************************************");
	  	driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	    //to get set of window handles
	  	Set<String> windowHandles2 = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandles2) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int size2 = windowHandles2.size();
	  	System.out.println("The number of windows :Close all windows except Primary option are : "+size2);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandles2 = new ArrayList<>(windowHandles2);
	  	//Close all windows except Primary
	  	for(int i=1;i<size2;i++)
	  	{
	  	driver.switchTo().window(listofHandles2.get(i));
	  	driver.close();
	  	}
	    //switch to the Parent window
	  	driver.switchTo().window(listofHandles2.get(0));
	    //TEST CASE 3:Find the number of opened tabs
	  	System.out.println("TEST CASE 3:Find the number of opened tabs");
	  	System.out.println("******************************************");
	  	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	    //to get set of window handles
	  	Set<String> windowHandles3 = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandles3) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int size3= windowHandles3.size();
	  	System.out.println("The number of windows :Find the number of opened tabs option are : "+size3);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandles3 = new ArrayList<>(windowHandles3);
	  	//Close all windows except Primary
	  	for(int j=1;j<size3;j++)
	  	{
	  	driver.switchTo().window(listofHandles3.get(j));
	  	driver.close();
	  	}
	    //switch to the Parent window
	  	driver.switchTo().window(listofHandles3.get(0));
	    //TEST CASE 4:Wait for 2 new tabs to open
	  	System.out.println("TEST CASE 4:Wait for 2 new tabs to open");
	  	System.out.println("******************************************");
	  	driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
	    //to get set of window handles
	  	Set<String> windowHandles4 = driver.getWindowHandles();
	  	//iterate 
	  	for (String each : windowHandles4) {
	  	System.out.println(each);
	  	}
	  	//to get the size of windows opened
	  	int size4= windowHandles4.size();
	  	System.out.println("The number of windows :Wait for 2 new tabs to open option are : "+size4);
	  	//convert Set to list to switch to a particular window handle
	  	List<String> listofHandles4 = new ArrayList<>(windowHandles4);
	  	//Calculate time to load each window ,then close all windows except Primary
	  	for(int k=1;k<size4;k++)
	  	{
	  	    //capture time before page load
	        long s = System.currentTimeMillis();
	        System.out.println("capture time before page load: "+s+" MilliSeconds");
	        //URL launch
	  	    driver.switchTo().window(listofHandles4.get(k));
	  	    //capture time after page load
	        long e = System.currentTimeMillis();
	        System.out.println("capture time after page load: "+e+" MilliSeconds");
	        //compute time
	        long r = e-s;
	        System.out.println("Page load time in milliseconds:for "+(k)+"st/nd window is:" + r+" MilliSeconds");
	  	    driver.close();
	  	}
	    //switch to the Parent window
	  	driver.switchTo().window(listofHandles4.get(0));
	  	 
	}

}
