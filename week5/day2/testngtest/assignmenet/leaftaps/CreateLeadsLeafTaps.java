package week5.day2.testngtest.assignmenet.leaftaps;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

	public class CreateLeadsLeafTaps extends BaseClassLeafTaps{

	@Test
		public  void CreateLeadTest() {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("Testleaf"))
			{
				System.out.println("Lead created successfully");
			}
			else 
			{
				System.out.println("Lead is not created");
			}
			
		}

	}