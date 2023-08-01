package week6.day2.assignment.seviceNow;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.support.ui.Select;
    import org.testng.annotations.DataProvider;
    import org.testng.annotations.Test;
	import io.github.sukgu.Shadow;

	public class UpdateInidentDynamicParameterization extends BaseClassServiceNowWeek6{
	@Test(dataProvider="sendData")
		public void UpdateExistingIncidentDynamic(String urgencyDynamic,String stateDynmaic) throws InterruptedException 
		{
			// Program To Update New Incident Service Now
			Shadow  dom =new Shadow(driver);
			dom.setImplicitWait(30);
			String incidentNumberFromIncidentsViewPage=dom.findElementByXPath("//a[@class='linked formlink']").getText();
			System.out.println("incident Number From Incidents View Page"+incidentNumberFromIncidentsViewPage);
			dom.findElementByXPath("//a[@class='linked formlink']").click();
			Thread.sleep(500);
			String incidentNumber=dom.findElementByXPath("input[@id='incident.number']").getAttribute("value");
			System.out.println("incident Number"+incidentNumber);
			//6.Update the incidents with Urgency as High and State as In Progress and click Update button
			WebElement urgencyDD=dom.findElementByXPath("//select[@id='incident.urgency']");
			Select selectUrgency=new Select(urgencyDD);
			selectUrgency.selectByVisibleText(urgencyDynamic);
			//Thread.sleep(500);
			WebElement incidentStateDD=dom.findElementByXPath("//select[@id='incident.state']");
			Select selectIncidentState=new Select(incidentStateDD);
			selectIncidentState.selectByVisibleText(stateDynmaic);
			Thread.sleep(500);
			dom.findElementByXPath("button[@id='sysverb_update_bottom']").click();
			Thread.sleep(1000);
			dom.findElementByXPath("//input[@class='form-control']").sendKeys(incidentNumber,Keys.ENTER);
			Thread.sleep(500);
			//7. Click on the incident again and Verify the Incident state 
			dom.findElementByXPath("//a[text()='"+incidentNumberFromIncidentsViewPage+"']").click();
			//dom.findElementByXPath("//a[@class='linked formlink']").click();
			Thread.sleep(1000);
			dom.setImplicitWait(35);
			String urgency=new Select(driver.findElement(By.id("incident.urgency"))).getFirstSelectedOption().getText();
			String state=new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText();
			System.out.println("Incident urgency After Updated is: "+new Select(driver.findElement(By.id("incident.urgency"))).getFirstSelectedOption().getText());
			System.out.println("Incident state After Updated is: "+new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText());
			if(urgency.equalsIgnoreCase(urgencyDynamic)  &&  state.equalsIgnoreCase(stateDynmaic)) 
			{
				System.out.println("SUCCESS....Incident updated successfully with urgengy as :"+urgencyDynamic+" and state as :"+stateDynmaic);
			}
			else
			{
				System.out.println("Incident NOT updated");
			}
			
		}
	@DataProvider
	public String[][] sendData()
	{
		String[][] data=new String[2][2];
		//First Set Of Data
		data[0][0]="1 - High";
		data[0][1]="In Progress";
		//Second Set Of Data
		data[1][0]="2 - Medium";
		data[1][1]="Resolved";
		//Third Set Of Data
		return data;
		
	}
	}
