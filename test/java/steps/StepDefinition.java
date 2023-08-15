package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass
{
	  @Given("Launch browser") 
	  public void openBrowser()
	  {
		  driver=new ChromeDriver(); 
	  }
	 	  
	  @And("Load the url") 
	  public void loadUrl() 
	  {
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  }
	 
	@And("Enter the username as {string}")
	public void enterUsername(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And("Enter the password as {string}")
	public void enterPassword(String pWord)
	{
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on the Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("HomePage should be displayed")
	public void homePageDisplay()
	{
		String title=driver.getTitle();
		if(title.contains("Leaftaps"))
			System.out.println("Login Successful");
		else
			System.out.println("Login Unuccessful");
	}
	@When("Click on crmsfaLink") 
	public void clickCRMSFALink()
	{
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click Leads Button") 
	public void clickLeadsButton()
	{
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
	}
	@But("ErrorMessage should be displayed")   
	public void displayErrorMessage() throws InterruptedException
	{
		String errorMessage= driver.findElement(By.id("errorDiv")).getText();
				if(errorMessage.contains("Error"))
					System.out.println("Error Message is Verified");
				else
					System.out.println("Error Message NOT Verified");
				Thread.sleep(2000);
	}
	@Then("Close browser")  
	public void closeBrowser()
	{
		driver.close();
	}
	}

