package parkIndustriesOutSystems.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;

public class TC_BootsAndLuggageReimbursementForm_001 extends BaseClass {

	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		logger.info("HRForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
	
	}
	
	@Test (priority=1)
	public void  clickBootsandLuggageReimbursement() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.clickBootsandLuggageReimbursement();
		logger.info("Boots and Luggage Reimbursement Form is clicked");
		
	}
	
	@Test (priority=2)
	public void  associateFormsHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderAssociateFormsPortal();
		if(isPageHeader == true) 
		{
			logger.info("Associate Forms Portal Header is displayed");
		}
		else
		{
			logger.info("Associate Forms Portal Header is not displayed");
		}
		
	}
	
	@Test (priority=3)
	public void  bootsLuggageReimbursementHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyBootsLuggageReimbursement();
		if(isPageHeader == true) 
		{
			logger.info("Boots & Luggage Reimbursement is displayed");
		}
		else
		{
			logger.info("Boots & Luggage Reimbursement is not displayed");
		}
		
	}
	
	@Test (priority=4)
	public void  goToSampleLoginHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderGoToSampleLogin();
		if(isPageHeader == true) 
		{
			logger.info("Go To Sample Login Header is displayed");
		}
		else
		{
			logger.info("Go To Sample Login is not displayed");
		}
		
	}
	
	@Test (priority=5)
	public void  bootsLuggageReimbursementDetails1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtBootsLuggageReimbursementMain();
		logger.info("Boots & Luggage Reimbursement Main is displayed");
		
		balrf.txtSearchBar();
		logger.info("Search Bar is displayed");
	}
	
	@Test (priority=6)
	public void  requestListHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderRequestList();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Request List Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Request List Header is not displayed");
		}
		
	}
	
	@Test (priority=7)
	public void  associateReimbursementFormHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementForm();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Form Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Form is not displayed");
		}
		
	}
	
	@Test (priority=8)
	public void  bootsLuggageReimbursementDetails2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();		
		boolean column = balrf.locateColumnHeaders();
		if(column == true)
		{
			logger.info("Displays column headers correctly");
			captureScreen(driver, "ColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
	}
	
	@Test (priority=9)
	public void  newRequest1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();		
		boolean newRequest = balrf.btnNewRequestDisplayed();
		if(newRequest == true)
		{
			logger.info("New Request is displayed correctly");
			captureScreen(driver, "NewRequest");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
		
		balrf.btnNewRequestBgColor();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnNewRequestBgColor());
		captureScreen(driver, "NewRequest");
		
		balrf.newRequestClickable();
		logger.info("New Request is clicked");
	}
	
	@Test (priority=9)
	public void  newRequest2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementRequest();
		if(isPageHeader == true) 
		{
			logger.info("Boots & Luggage Reimbursement Request Header is displayed");
		}
		else
		{
			logger.info("Boots & Luggage Reimbursement Request is not displayed");
		}
	}
		
	@Test (priority=10)
	public void  newRequest3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();	
		
		boolean isPageHeader = balrf.verifyHeaderPersonalInfo();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Personal Info Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Personal Info is not displayed");
		}
	}
	
	@Test (priority=11)
	public void  newRequest4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtEmployeeNumberDisplayed();
		logger.info("Employee Number Text is displayed");
		
		balrf.employeeNumberDisplayed();
		logger.info("Employee Number is displayed");
		
		balrf.txtAssociateNameDisplayed();
		logger.info("Associate Name Text is displayed");
		
		balrf.associateNameDisplayed();
		logger.info("Associate Name is displayed");
		
		balrf.txtDepartmentDisplayed();
		logger.info("Department Text is displayed");
		
		balrf.departmentDisplayed();
		logger.info("Department is displayed");
		
	}
	
	@Test (priority=11)
	public void  newRequest5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyAddComment();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Add Comment Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Add Comment is not displayed");
		}
		
		balrf.addCommentDisplayed();
		logger.info("Enter Comments Field Text is displayed");
		
		balrf.saveDisplayed();
		logger.info("Save Button is displayed");
		
		balrf.btnSaveBgColour();
		logger.info("Save Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnSaveBgColour());
		captureScreen(driver, "SaveButton");
	}
	
	@Test (priority=12)
	public void  newRequest6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.enterComments();
		logger.info("Comments are entered and save button is clicked");
		
		balrf.addCommentDisplayed();
		logger.info("Added Comments Timeline is displayed");
	}
	
	@Test (priority=13)
	public void  bootsLuggageReimbursementForm1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderReimbursementFormDetails();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Form Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Form is not displayed");
		}
		
		balrf.createdDisplayed();
		logger.info("Created Button is displayed");
		
		balrf.btnCreatedBgColour();
		logger.info("Created Button Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnCreatedBgColour());
		captureScreen(driver, "CreatedButton");
	}
	
	@Test (priority=14)
	public void  bootsLuggageReimbursementForm2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementPolicy();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Policy Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Policy Header is not displayed");
		}
		
		balrf.bootsLuggageReimbursementPolicyDisplayed();
		logger.info("Boots & Luggage Reimbursement Policy is displayed");
	}
	
	@Test (priority=14)
	public void  bootsLuggageReimbursementForm3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderCalendarYearReimbursementAllowed();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Calendar Year Reimbursement Allowed Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Calendar Year Reimbursement Allowed Header is not displayed");
		}
	}
	
	@Test (priority=15)
	public void  bootsLuggageReimbursementForm4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBoots();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots Header is not displayed");
		}
		
		balrf.bootsPolicyDisplayed();
		logger.info("Boots Policy is displayed");
		
		balrf.policyNoteDisplayed();
		logger.info("Policy Note is displayed");
	}
	
	@Test (priority=16)
	public void  bootsLuggageReimbursementForm5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderLuggage();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Luggage Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Luggage Header is not displayed");
		}
		
		balrf.luggagePolicyDisplayed();
		logger.info("Luggage Policy is displayed");
	}
	
	@Test (priority=17)
	public void  bootsLuggageReimbursementForm6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.yearDisplayed();
		logger.info("Year Text is displayed");
		
		balrf.yearInputDisplayed();
		logger.info("Year Input Field is displayed");
		
		balrf.yearInput();
		logger.info("Year 2021 is entered");
		
		balrf.deleteRequestDisplayed();
		logger.info("Delete Request is displayed");
		
		balrf.deleteRequestClickable();
		logger.info("Delete is clicked");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();	
		
		balrf.newRequestClickable();
		logger.info("New Request Button is clicked again");
	}
	
	@Test (priority=18)
	public void  bootsLuggageReimbursementForm7() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderReceipt();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Receipt Header is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Receipt Header is not displayed");
		}
		
		balrf.addReceiptDisplayed();
		logger.info("Add Receipt Button is displayed");
		
		balrf.btnAddReceiptBgColour();
		logger.info("Add Receipt Button Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnAddReceiptBgColour());
		captureScreen(driver, "AddReceiptButton");
	}
	
	@Test (priority=19)
	public void  bootsLuggageReimbursementForm8() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		balrf.yearInput();
		logger.info("Year 2021 is entered again");
		
		boolean isPageHeader = balrf.receiptTypeDisplayed();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Receipt Type Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Receipt Type Header is not displayed");
		}
		
		balrf.selectBootsType();
		logger.info("Boots Type Receipt is selected");
	}
	
	@Test (priority=20)
	public void  bootsLuggageReimbursementForm9() throws InterruptedException, IOException, AWTException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.uSDRequestedDisplayed();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("USD Requested Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("USD Requested Header is not displayed");
		}
		
		balrf.enterUSDRequest();
		logger.info("USD Requested is entered");
		
		balrf.backDisplayed();
		logger.info("Back Button is displayed");
		
		balrf.backClickable();
		logger.info("Back Button is clicked");
		
		balrf.newRequestClickable();
		logger.info("New Request is clicked");
	}
	
	
	@Test (priority=21)
	public void  bootsLuggageReimbursementForm10() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		balrf.yearInput();
		logger.info("Year 2021 is entered again");
		
		balrf.selectBootsType();
		logger.info("Boots Type Receipt is selected");
		
		balrf.enterUSDRequest();
		logger.info("USD Requested is entered");
		
		boolean isPageHeader = balrf.verifyHeaderRequestSummary();
		if(isPageHeader == true) 
		{
			logger.info("Request Summary Header is displayed");
		}
		else
		{
			logger.info("Request Summary is not displayed");
		}
		
		
		/*
		 * balrf.btnAddReceiptClickable(); logger.info("Add Receipt Button is clicked");
		 * 
		 * pau.waitForPageLoaded(); pau.waitForPageLoaded(); pau.waitForPageLoaded();
		 * 
		 * Runtime.getRuntime().exec(
		 * "C:\\Users\\karal\\Documents\\FileUpload\\FileUpload.exe");
		 */
		
		balrf.saveSubmitDisplayed();
		logger.info("Save and Submit button is displayed");
		
		balrf.btnSaveSubmitBgColour();
		logger.info("Save and Submit Button Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnSaveSubmitBgColour());
		captureScreen(driver, "SaveSubmitButton");
		
		balrf.saveSubmitClickable();
		logger.info("Save and Submit button is clicked");
	}
	
	
}
