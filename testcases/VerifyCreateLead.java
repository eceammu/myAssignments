package testcases;

import org.testng.annotations.Test;
import base.BaseclassPOM;
import pages.LoginPage;
import pages.WelcomePage;


public class VerifyCreateLead extends BaseclassPOM
{
	@Test
	public void loginRun()
	{
//		LoginPage lp=new LoginPage();
//		lp.enterUsername();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		WelcomePage wp=new WelcomePage();
//		
//		wp.verifyHomePage();
//		wp.crmsfaLinkClick();
		LoginPage lp=new LoginPage();
		lp.enterUsername().enterPassword().clickLoginButton()
		  .verifyHomePage().crmsfaLinkClick()
		  .clickLeadsLink()
		  .clickCreateLeadLink()
		  .enterCompanyName().enterFirstName().enterLastsName().enterNameLocal()
		  .enterDescription().enterPrimaryEmail().enterPhoneNumber()
		  .selectStateProvinanceOption().createLeadButton()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage();
	}
}
