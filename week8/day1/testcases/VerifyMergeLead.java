package  week8.day1.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  week8.day1.base.BaseclassPOM;
import  week8.day1.pages.LoginPage;

public class VerifyMergeLead extends BaseclassPOM
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="LeafTapsWithPOM";
		excelSheetName="MergeLead";
		testName="VerifyMergeLeadTestcase";
		testDescription="Verify Merge Lead Testcase Week8 Day1";
		testCatagory="Automation Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void mergeLeadTestCase(String uName,String pWord,String companyName,String firstNameFromLookUp,String firstNameToLookUp) 
			throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uName).enterPassword(pWord).clickLoginButton()
		  .verifyHomePage().crmsfaLinkClick()
		  .clickLeadsLink().clickMergeLeadsLink().fromLeadLookUpClick()
		  .switchToChildWindow()
		  .enterFirstNameFromLookUp(firstNameFromLookUp).clickFindLeadsChildWindow().clickLeadsIDFrom()
		  .switchToParentWindow().toLeadLookUpClick().switchToChildWindow()
		  .enterFirstNameToLookUp(firstNameToLookUp).clickFindLeadsChildWindow().clickLeadsIDTo()
		  .switchToParentWindow().mergeButtonlickMergeLeadsPage().acceptAlert()
		  .clickFindLeadsLink()
		  .enterLeadsIDMerge().clickFindLeads().findLeads();
	}
	

}
