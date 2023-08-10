package testcases;

import org.testng.annotations.Test;

import base.BaseclassPOM;
import pages.LoginPage;

public class VerifyMergeLead extends BaseclassPOM
{
	@Test
	public void mergeLeadVerify() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.enterUsername().enterPassword().clickLoginButton()
		  .verifyHomePage().crmsfaLinkClick()
		  .clickLeadsLink().clickMergeLeadsLink().fromLeadLookUpClick()
		  .switchToChildWindow()
		  .enterFirstNameFromLookUp().clickFindLeadsChildWindow().clickLeadsIDFrom()
		  .switchToParentWindow().toLeadLookUpClick().switchToChildWindow()
		  .enterFirstNameToLookUp().clickFindLeadsChildWindow().clickLeadsIDTo()
		  .switchToParentWindow().mergeButtonlickMergeLeadsPage().acceptAlert()
		  .clickFindLeadsLink()
		  .enterLeadsIDMerge().clickFindLeads().findLeads();
		
	}
	

}
