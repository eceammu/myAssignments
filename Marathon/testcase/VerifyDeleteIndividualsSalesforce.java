package Marathon.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Marathon.base.BaseClassLastMarathon;
import Marathon.pages.LoginPageSalesforce;

public class VerifyDeleteIndividualsSalesforce extends BaseClassLastMarathon
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="Salesforce";
		excelSheetName="Sheet3";
		testName="Verify Delete Individual Testcase";
		testDescription="Verify Delete Individual Testcase Last Marathon";
		testCatagory="Sanity Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void VerifyEditIndividual(String uName,String pWord,String individulName,String lastName) throws InterruptedException, IOException
	{
		LoginPageSalesforce lp=new LoginPageSalesforce(driver);
		lp.enterUserName(uName).enterPassWord(pWord).enterLoginButton()
		.clickToggleMenu().clickSelectAll().selectIndividuals()
		.ClickIndividualsTabEditorDelete().searchIndividualsEditorDelete(individulName)
		.ClickDropdowniconEditorDelete().SelectDelete().messageToastdisplayDelete().EnterLastNameForDeleteMessage(lastName)
		.verifyDeleteMessage();
    }
}
