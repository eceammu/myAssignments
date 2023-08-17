package Marathon.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Marathon.base.BaseClassLastMarathon;
import Marathon.pages.LoginPageSalesforce;

public class VerifyCreateIndividualTestcase extends BaseClassLastMarathon
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="Salesforce";
		excelSheetName="Sheet1";
		testName="VerifyCreateIndividualTestcase";
		testDescription="Verify Create Individual Testcase Last Marathon";
		testCatagory="Smoke Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void VerifyCreateIndividual(String uName,String pWord,String lastName,String lName) throws InterruptedException, IOException
	{
		LoginPageSalesforce lp=new LoginPageSalesforce(driver);
		lp.enterUserName(uName).enterPassWord(pWord).enterLoginButton()
		.clickToggleMenu().clickSelectAll().selectIndividuals()
		.selectDropDownIndividualTab().selectNewIndividual()
		.enterLastName(lastName).clickSaveButton()
		.verifyIndiviualCreated(lName);
    }
}
