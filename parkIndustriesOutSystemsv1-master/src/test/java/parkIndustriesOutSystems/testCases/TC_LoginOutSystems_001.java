package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.LoginPage;

public class TC_LoginOutSystems_001 extends BaseClass {
	
	@Test (priority=0)
	public void  loginPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
	
		lp.implicitwait();
		logger.info("AssociateForms is successfully opened");
		
		boolean isPageHeader = lp.verifyHeader();
			if(isPageHeader == true) 
			{
				//Assert.assertTrue(true);
				logger.info("AssociateForms Header is displayed");
			}
			else
			{
				//Assert.assertTrue(false);
				logger.info("AssociateForms Header is not displayed");
			}
		
		lp.txtLoginAsSampleUserDisplayed();
		logger.info("Login as Sample User text is displayed");
		captureScreen(driver, "LoginScreen");
	
	}
	
	@Test (priority=1)
	public void  hrPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		lp.clickHRUser();
		logger.info("HR User is clicked");
		
		lp.clickSampleLogin();
		logger.info("Sample Login is clicked");
	
	}
	
	@Test (priority=2)
	public void  logoutPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		lp.btnLogoutDisplayed();
		logger.info("Logout Text is displayed");
		
		lp.btnLogoutBgColour();
		logger.info("Logout Text Backgorund Color is displayed");
		System.out.println("Background Color is :" + lp.btnLogoutBgColour());
		captureScreen(driver, "Logout");
		
		
		lp.clickLogout();
		logger.info("Logout Button is clicked");
		lp.implicitwait();
		captureScreen(driver, "Logout is not shown");
	
	}
}
