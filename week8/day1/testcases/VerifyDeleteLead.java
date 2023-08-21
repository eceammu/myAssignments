package  week8.day1.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  week8.day1.base.BaseclassPOM;
import  week8.day1.pages.LoginPage;

public class VerifyDeleteLead extends BaseclassPOM 
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="LeafTapsWithPOM";
		excelSheetName="DeleteLead";
		testName="VerifyDeleteLeadTestcase";
		testDescription="Verify Delete Lead Testcase Week8 Day1";
		testCatagory="Sanity Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
public void deleteLeadTestCase(String uName,String pWord,String phoneNumber)
				throws InterruptedException, IOException
{
	LoginPage lp=new LoginPage(driver);
	lp.enterUsername(uName).enterPassword(pWord).clickLoginButton()
	  .verifyHomePage().crmsfaLinkClick()
	  .clickLeadsLink().clickFindLeadsLink()
	  .clickPhoneTab().enterPhoneNumber(phoneNumber).clickFindLeads()
	  .findLeadsResultDisplay().clickDeleteLeadsButton().clickFindLeadsLink()
	  .enterLeadsID().clickFindLeads().findLeadsResultDisplayDeleteLead();
	  
	}
}
