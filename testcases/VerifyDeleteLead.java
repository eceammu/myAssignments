package testcases;

import org.testng.annotations.Test;

import base.BaseclassPOM;
import pages.LoginPage;

public class VerifyDeleteLead extends BaseclassPOM 
{
@Test
public void deleteLeadVerify() throws InterruptedException
{
	LoginPage lp=new LoginPage();
	lp.enterUsername().enterPassword().clickLoginButton()
	  .verifyHomePage().crmsfaLinkClick()
	  .clickLeadsLink().clickFindLeadsLink()
	  .clickPhoneTab().enterPhoneNumber().clickFindLeads()
	  .findLeadsResultDisplay().clickDeleteLeadsButton().clickFindLeadsLink()
	  .enterLeadsID().clickFindLeads().findLeadsResultDisplayDeleteLead();
	  
	}
}
