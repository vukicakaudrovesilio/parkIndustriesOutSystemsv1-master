package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;

public class TC_ParkAssociateUser_001 extends BaseClass {

	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		logger.info("AssociateForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
	
	}
	
	@Test (priority=1)
	public void  parkAssociateUserHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = pau.verifyHeaderPAUR();
		if(isPageHeader == true) 
		{
			logger.info("Park Associate User Header is displayed");
			captureScreen(driver, "ParkAssociateUser");
		}
		else
		{
			logger.info("Park Associate User Header is not displayed");
		}
		
	}
	
	@Test (priority=2)
	public void  myRequestsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderMyRequests();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("My Requests Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("My Requests is not displayed");
		}
		
	}
	
	@Test (priority=3)
	public void formsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderForms();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Forms Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Forms is not displayed");
		}
		
	}
	
	@Test (priority=4)
	public void  goToSampleLoginHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderGoToSampleLogin();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Go To Sample Login Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Go To Sample Login is not displayed");
		}
		
	}
	
	@Test (priority=5)
	public void  parkAssociateUserDetails1() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.imgParkHRDisplayed();
		logger.info("AssociateForms Logo is displayed");
		
		pau.txtParkAssociateUser();
		logger.info("Park Associate User Text is displayed");
		
		pau.btnClearDisplayed();
		logger.info("Clear Button is displayed");
		
		pau.btnClearBgColor();
		logger.info("Clear Text Background Color is displayed");
		System.out.println("Background Color is :" + pau.btnClearBgColor());
		captureScreen(driver, "ClearButton");
		
		pau.searchbar();
		logger.info("Search Bar is displayed");
		
		pau.selectValuesSearchBar();
		logger.info("Search Options is selected");
		
		pau.clearClickable();
		logger.info("Clear Button is clicked");
	}
	
	@Test (priority=6)
	public void  pendingItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderAllItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("All Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("All Items is not displayed");
		}
		
	}
	
	@Test (priority=7)
	public void  completedItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderActiveItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Active Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Active Items is not displayed");
		}
		
	}
	
	@Test (priority=8)
	public void  rejectedItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderClosedItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Closed Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Closed Items is not displayed");
		}
		
	} 
	
	@Test (priority=9)
	public void  parkAssociateUserDetails2() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.btnFilterDisplayed();
		logger.info("Filter Button is displayed");
		
		pau.filterClickable();
		logger.info("Filter Button is clicked");
		
		boolean column1 = pau.locateFilterOptions();
		if(column1 == true)
		{
			logger.info("Displays filter options correctly");
			captureScreen(driver, "FilterOptions");
		}
		else
		{
			logger.info("Filter Options is not displayed correctly");
		}
		
		boolean column2 = pau.locateColumnHeaders();
		if(column2 == true)
		{
			logger.info("Displays column headers correctly");
			captureScreen(driver, "ColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
	}
	
	@Test (priority=10)
	public void  parkAssociateUserRequests() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		pau.myRequestsClickable();
		logger.info("My Requests is clicked");
		
		boolean isPageHeader = pau.locateMyRequests(); 
		if(isPageHeader == true) {
			 logger.info("My Requests is displayed correctly");
			 captureScreen(driver, "MyRequests");
		} 
		else 
		{
			 logger.info("My Requests is missing"); 
		}
		
	}
	
	@Test (priority=11)
	public void  parkAssociateForms() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		pau.formsClickable();
		logger.info("Forms is clicked");
		
		boolean isPageHeader = pau.locateDropDownForms(); 
		if(isPageHeader == true) {
			 logger.info("Forms dropdown is displayed correctly"); 
		} 
		else 
		{
			 logger.info("Forms dropdown is missing"); 
		}
	}
	
	@Test (priority=12)
	public void  associatesFormsSignIn() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		pau.goToSampleLoginClickable();
		logger.info("Go To Sample Login is clicked");
		
		pau.locateLoginasSampleUser();
		logger.info("Login as Sample User is displayed");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
		
		pau.iconParkAssociateUserClickable();
		logger.info("Park Associate User Icon is clicked");
		
		pau.hrFormsSignIn();
		logger.info("Associates Forms Sign In Page is displayed");
		captureScreen(driver, "AssociatesFormsSignIn");
	}
	
}
