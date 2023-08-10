package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseclassPOM;
import pages.LoginPage;

public class VerifyDuplicateLead extends BaseclassPOM
{
	@Test
	public void duplicateLeadVerify()
	{
		LoginPage lp=new LoginPage();
		lp.enterUsername().enterPassword().clickLoginButton()
		  .verifyHomePage().crmsfaLinkClick()
		  .clickLeadsLink()
		  .clickCreateLeadLink()
		  .enterCompanyName().enterFirstName().enterLastsName().enterNameLocal()
		  .enterDescription().enterPrimaryEmail().selectStateProvinanceOption().createLeadButton()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage().clickDuplicateLeadsButton()
		  .updateCompanyNameFieldDuplicateLeadsPage().updateFirstNameFieldDuplicateLeadsPage()
		  .clickDuplicateLeadButtonSubmit()
		  .verifyTitleViewLeadPage().getLeadsIDViewLeadPage();
	}
	
			
			
}
