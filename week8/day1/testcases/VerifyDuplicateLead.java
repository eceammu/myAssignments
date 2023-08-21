package  week8.day1.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import  week8.day1.base.BaseclassPOM;
import  week8.day1.pages.LoginPage;

public class VerifyDuplicateLead extends BaseclassPOM
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="LeafTapsWithPOM";
		excelSheetName="DuplicateLead";
		testName="VerifyDuplicateLeadTestcase";
		testDescription="Verify Duplicate Lead Testcase Week8 Day1";
		testCatagory="Agile Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void duplicateLeadTestCase(String uName,String pWord,String companyName,String firstName,String lastName,
			String firstNameLocal,String departmentName,String primaryEmail,String stateProvinance,
			String companyNameDuplicateLeadsPage,String firstNameDuplicateLeadsPage) throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uName).enterPassword(pWord).clickLoginButton()
		  .verifyHomePage().crmsfaLinkClick()
		  .clickLeadsLink()
		  .clickCreateLeadLink()
		  .enterCompanyName(companyName).enterFirstName(firstName).enterLastsName(lastName).enterNameLocal(firstNameLocal)
		  .enterDepartmentName(departmentName).enterPrimaryEmail(primaryEmail).selectStateProvinanceOption(stateProvinance).createLeadButton()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage().clickDuplicateLeadsButton()
		  .updateCompanyNameFieldDuplicateLeadsPage(companyNameDuplicateLeadsPage).updateFirstNameFieldDuplicateLeadsPage(firstNameDuplicateLeadsPage)
		  .clickDuplicateLeadButtonSubmit()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage();
	}
	
			
			
}
