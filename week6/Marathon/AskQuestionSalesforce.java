package week6.Marathon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day2.assignment.seviceNow.BaseClassServiceNowWeek6;
import week6.day2.assignment.seviceNow.ReadExcelWeek6;

public class AskQuestionSalesforce extends BaseclassSalesForce
{
	
		String  excelFileName;
			
		@BeforeTest
		public void setValues() 
		{
			    excelFileName="AskQuestion";
		}
			
	@Test(dataProvider="sendData")
	public void AskQuestionSalesforceTest(String questions,String details) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content",Keys.ENTER);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		Thread.sleep(1000);
		WebElement click=driver.findElement(By.xpath("//span[text()='Chatter']"));
		//driver.executeScript("arguments[0].click;", chatterTab);
		driver.executeScript("arguments[0].click();", click);
		System.out.println("Title of Page :"+driver.getTitle());
		WebElement click1=driver.findElement(By.xpath("//span[text()='Question']"));
		//driver.executeScript("arguments[0].click;", chatterTab);
		driver.executeScript("arguments[0].click();", click1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(questions);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']/following::p")).sendKeys(details);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		String questionsFromUI=driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
		System.out.println("questionsFromUI: ["+questionsFromUI+"]");
		System.out.println("questions XL: ["+questionsFromUI+"]");
		String detailsFromUI=driver.findElement(By.xpath("(//span[@class='uiOutputText'])[4]")).getText();
		System.out.println("detailsFromUI ["+details+"]");
		System.out.println("questions XL: ["+questions+"]");
		/*if(questionsFromUI.equalsIgnoreCase(questions))
		{
			System.out.println("Question appears correctly");
		}
		else
		{
			System.out.println("Question NOT appears");
				
		}
		if(detailsFromUI.equalsIgnoreCase(details))
		{
			System.out.println("Details appears correctly");
		}
		else
		{
			System.out.println("Details NOT appears");
				
		}
		*/
		Thread.sleep(1000);
	}
	@DataProvider
	public String[][] sendData() throws IOException
	{
		String[][] data=ReadExcelMarathon.readExcelData(excelFileName);
				System.out.println("data "+data);
		//return data;
			return ReadExcelMarathon.readExcelData(excelFileName);
	}
}
