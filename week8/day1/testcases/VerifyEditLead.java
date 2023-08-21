package  week8.day1.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  week8.day1.base.BaseclassPOM;
import  week8.day1.pages.LoginPage;

public class VerifyEditLead extends BaseclassPOM
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="LeafTapsWithPOM";
		excelSheetName="EditLead";
		testName="VerifyEditLeadTestcase";
		testDescription="Verify Edit Lead Testcase Week8 Day1";
		testCatagory="Load Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void EditLeadTestCase(String uName,String pWord,String companyName,String firstName,String lastName,
			String firstNameLocal,String departmentName,String primaryEmail,String phoneNumber,String stateProvinance,
			String importantNote) throws IOException
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
		  .enterDepartmentName(departmentName).enterPrimaryEmail(primaryEmail).selectStateProvinanceOption(stateProvinance)
		  .createLeadButton()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage()
		  .clickEditButton().clearLeadFormDescription().updatexImportantNote(importantNote)
		  .clickEditButtonInEditPage().verifyTitleViewLeadPage().getLeadsIDViewLeadPage();
	}
}
