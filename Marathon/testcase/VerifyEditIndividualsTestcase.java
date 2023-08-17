package Marathon.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Marathon.base.BaseClassLastMarathon;
import Marathon.pages.LoginPageSalesforce;

public class VerifyEditIndividualsTestcase  extends BaseClassLastMarathon
{
	@BeforeTest
	public void setValues()
	{
		excelFileName="Salesforce";
		excelSheetName="Sheet2";
		testName="Verify Edit Individual Testcase";
		testDescription="Verify Edit Individual Testcase Last Marathon";
		testCatagory="Agile Test";
		TestAuthor="Alamelumangai.T";
	}
	@Test(dataProvider="sendData")
	public void VerifyEditIndividual(String uName,String pWord,String individulName,String firstName,String fName) throws InterruptedException, IOException
	{
		LoginPageSalesforce lp=new LoginPageSalesforce(driver);
		lp.enterUserName(uName).enterPassWord(pWord).enterLoginButton()
		.clickToggleMenu().clickSelectAll().selectIndividuals()
		.ClickIndividualsTabEditorDelete().searchIndividualsEditorDelete(individulName)
		.ClickDropdowniconEditorDelete().SelectEdit().selectSalvation()
		.selectMr().enterFirstName(firstName).clickSaveButton()
		.verifyIndiviualEdited(fName);
    }
}
