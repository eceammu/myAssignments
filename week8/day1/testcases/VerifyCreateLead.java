package week8.day1.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import week8.day1.base.BaseclassPOM;
import  week8.day1.pages.LoginPage;
import  week8.day1.pages.WelcomePage;


public class VerifyCreateLead extends BaseclassPOM
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="LeafTapsWithPOM";
		excelSheetName="CreateLead";
		testName="VerifyCreateLeadTestcase";
		testDescription="Verify Create Lead Testcase Week8 Day1";
		testCatagory="Smoke Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void createLeadTestCase(String uName,String pWord,String companyName,String firstName,String lastName,
			String firstNameLocal,String departmentName,String primaryEmail,String phoneNumber,String stateProvinance) throws IOException
	{
//		LoginPage lp=new LoginPage();
//		lp.enterUsername();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		WelcomePage wp=new WelcomePage();
//		
//		wp.verifyHomePage();
//		wp.crmsfaLinkClick();
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uName).enterPassword(pWord).clickLoginButton()
		  .verifyHomePage().crmsfaLinkClick()
		  .clickLeadsLink()
		  .clickCreateLeadLink()
		  .enterCompanyName(companyName).enterFirstName(firstName).enterLastsName(lastName).enterNameLocal(firstNameLocal)
		  .enterDepartmentName(departmentName).enterPrimaryEmail(primaryEmail).enterPhoneNumber(phoneNumber)
		  .selectStateProvinanceOption(stateProvinance).createLeadButton()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage();
	}
}
