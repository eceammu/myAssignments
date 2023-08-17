package Marathon.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Marathon.base.BaseClassLastMarathon;

public class IndividualsPageSalesforce extends BaseClassLastMarathon
{
	        //Test Steps:
	        //4. Click on the Dropdown icon in the Individuals tab
	        //5. Click on New Individual
	
	       //4. Click on the Individuals tab 
	        //5. Search the Individuals 'Kumar'
	        //6. Click on the Dropdown icon and Select Edit
			public IndividualsPageSalesforce(RemoteWebDriver driver)
			{
				this.driver=driver;
			}
			public IndividualsPageSalesforce selectDropDownIndividualTab()
			{
				
				driver.findElement(By.xpath("//span[text()='Individuals']/following::a")).click();
				//driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
				return this;
			}
			public NewIndividualPageSalesforce selectNewIndividual()
			{
				WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
				driver.executeScript("arguments[0].click();", clk);
				return new NewIndividualPageSalesforce(driver);
			}
			public IndividualsPageSalesforce verifyIndiviualCreated(String lName) throws IOException
			{
				String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
				//verify Individuals Name
				System.out.println("message :"+message);
				try {
					if(message.contains(lName))
					{
						System.out.println("Individuals Name Verified");
						reportStep("Individual Created Succesfully","Pass");
					}
						
					else
					{
						System.out.println("Individuals Name NOT Verified");
						reportStep("Individual NOT Created","fail");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					if(message.contains(lName)==false)
						System.out.println("Individuals Name NOT Verified");
					    reportStep("Individual NOT Created","fail");
				}
				return this;
			}
			public IndividualsPageSalesforce ClickIndividualsTabEditorDelete()
			{
				WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
				driver.executeScript("arguments[0].click();", clk);
				return this;
			}
			public IndividualsPageSalesforce searchIndividualsEditorDelete(String individulName) throws InterruptedException
			{
				WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
			name.sendKeys(individulName);
			name.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
				return this;
			}
			public IndividualsPageSalesforce ClickDropdowniconEditorDelete() throws InterruptedException
			{
				WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
				driver.executeScript("arguments[0].click();", ele);
				Thread.sleep(3000);
				return this;
			}
			public  EditIndividualsPageSalesforce SelectEdit()
			{   
				WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
				driver.executeScript("arguments[0].click();", edit);
				return new  EditIndividualsPageSalesforce(driver);
			}
			public IndividualsPageSalesforce verifyIndiviualEdited(String fName) throws IOException
			{
				
					String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
					   //Verify the first name as 'Ganesh'
						System.out.println("msg :"+msg);
						try {
							if(msg.contains(fName))
							{
								System.out.println("Individuals first name verified as "+fName);
								System.out.println("Individual edited Sucessfully");
								reportStep("Individual edited Sucessfully","Pass");
							}
							else
							{
								if(msg.contains(fName)==false)
									System.out.println("Individual Not edited Sucessfully");
								    reportStep("Individual NOT edited","Fail");
							}
				          } catch (Exception e) 
						{
				           e.printStackTrace();
					       reportStep("Individual NOT edited","Fail");
					     }
				return this;
			}
			
			public  IndividualsPageSalesforce SelectDelete() throws InterruptedException
			{   
				WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
				driver.executeScript("arguments[0].click();", delete);
				Thread.sleep(3000);
				WebElement delete1 = driver.findElement(By.xpath("//span[text()='Delete']"));
				driver.executeScript("arguments[0].click();", delete1);
				return this;
			}
			
			public  IndividualsPageSalesforce messageToastdisplayDelete() throws InterruptedException, IOException
			{   
			
				try 
				{
					String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
					System.out.println(msg);
					reportStep("Deleted Succesfully","Pass");
				}
				catch (Exception e) 
				{
					e.printStackTrace();
					reportStep("Not Deleted","Fail");
				}
				return this;
			}
			public  IndividualsPageSalesforce EnterLastNameForDeleteMessage(String lastName) throws InterruptedException
			{   
				 driver.findElement(By.xpath("//input[@class='slds-input']")).clear();
				 driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(lastName,Keys.ENTER);
				 Thread.sleep(3000);
				return this;
			}
			public  IndividualsPageSalesforce verifyDeleteMessage() throws InterruptedException
			{   
				String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
				//Verify Whether Individual is Deleted using Individual last name"
				System.out.println("verify message :"+verify);
				Thread.sleep(3000);
				return this;
			}
			
			
}
