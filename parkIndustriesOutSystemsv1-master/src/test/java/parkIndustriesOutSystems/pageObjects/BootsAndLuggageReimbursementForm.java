package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class BootsAndLuggageReimbursementForm {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public BootsAndLuggageReimbursementForm(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Boots and Luggage Reimbursement Link Button
	@FindBy(xpath="//a[contains(.,'Boots & Luggage Reimbursement')]")
	@CacheLookup
	WebElement lbtnBootsAndLuggageReimbursement;
	
	//Associate Forms Portal Header
	@FindBy(xpath="//a[contains(.,'Associate Forms Portal')]")
	@CacheLookup
	WebElement headerAssociateFormsPortal;
	
	//Boots & Luggage Header
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter active'][contains(.,'Boots & Luggage Reimbursement')]")
	@CacheLookup
	WebElement headerBootsLuggageReimbursement;
	
	//Go To Sample Login Header
	@FindBy(xpath="//a[@class='margin-left-base'][contains(.,'Go To Sample Login')]")
	@CacheLookup
	WebElement headerGoToSampleLogin;
	
	//Boots & Luggage Reimbursement Header Main
	@FindBy(xpath="//span[@class='font-bold'][contains(.,'Boots & Luggage Reimbursement')]")
	@CacheLookup
	WebElement headerBootsLuggageMain;
	
	//Park Associate User
	@FindBy(xpath="(//span[contains(.,'Park Associate User')])[1]")
	@CacheLookup
	WebElement txtParkAssociateUser;
	
	//Request List Header
	@FindBy(xpath="//h1[contains(.,'Request List')]")
	@CacheLookup
	WebElement headerRequestList;
	
	//Search Bar
	@FindBy(xpath="//input[@type='search'][contains(@id,'TextVar')]")
	@CacheLookup
	WebElement txtSearchBar;
	
	//Boots & Luggage Reimbursement Form Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Boots & Luggage Reimbursement Form')]")
	@CacheLookup
	WebElement headerBootsLuggageReimbursementForm;
	
	//Column ID 
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Case #')]")
	@CacheLookup
	WebElement columnID;
	
	//Column Associate 
	@FindBy(xpath="(//th[@class='sortable'][contains(.,'Associate')])[1]")
	@CacheLookup
	WebElement columnAssociate;
	
	//Column Associate Number
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Associate #')]")
	@CacheLookup   
	WebElement columnAssociateNumber;
		
	//Column Department 
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Department')]")
	@CacheLookup
	WebElement columnDepartment;
		
	//Column Status 
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Status')]")
	@CacheLookup
	WebElement columnStatus;
		
	//Column Date Submitted 
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Date Submitted')]")
	@CacheLookup
	WebElement columnDateSubmitted;
		
	//Column Year 
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Year')]")
	@CacheLookup
	WebElement columnYear;
	
	//New Request Button 
	@FindBy(xpath="//button[@class='btn btn-primary OSFillParent'][contains(.,'New Request')]")
	@CacheLookup   
	WebElement btnNewRequest;
	
	//Boots & Luggage Reimbursement Request Header 
	@FindBy(xpath="//h1[contains(.,'Boots & Luggage Reimbursement Request')]")
	@CacheLookup
	WebElement headerBootsLuggageReimbursementRequest;
	
	//Personal Info Header 
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Personal Info')]")
	@CacheLookup
	WebElement headerPersonalInfo;
	
	//Associate Reimbursement Request Employee Number Text
	@FindBy(xpath="//span[@class='label-text'][contains(.,'Employee Number')]")
	@CacheLookup
	WebElement txtEmployeeNumber;
	
	//Associate Reimbursement Request Employee Number 
	@FindBy(xpath="//span[contains(@class,'item-text')]")
	@CacheLookup
	WebElement EmployeeNumber;
	
	//Associate Reimbursement Request Associate Name Text
	@FindBy(xpath="//div[@class='label-text'][contains(.,'Associate Name')]")
	@CacheLookup
	WebElement txtAssociateName;
	
	//Associate Reimbursement Request Associate Name 
	@FindBy(xpath="(//span[contains(.,'Park Associate User')])[2]")
	@CacheLookup
	WebElement AssociateName;
	
	//Associate Reimbursement Request Department Text
	@FindBy(xpath="//span[@class='text-neutral-7'][contains(.,'Department')]")
	@CacheLookup
	WebElement txtDepartment;
	
	//Associate Reimbursement Request Department 
	@FindBy(xpath="//span[contains(.,'SS Customer Service')]")
	@CacheLookup
	WebElement Department;
	
	//Add Comment Header
	@FindBy(xpath="//span[@class='heading5'][contains(.,'Add Comment')]")
	@CacheLookup
	WebElement headerAddComment;
	
	//Add Comment Text
	@FindBy(xpath="//textarea[contains(@placeholder,'Enter your comments here...')]")
	@CacheLookup
	WebElement txtAddComment;
	
	//Add Comment Save Button
	@FindBy(xpath="//button[@class='btn btn-primary'][contains(.,'Save')]")
	@CacheLookup
	WebElement btnSave;
	
	//Time line for Added Comment
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[3]/div[1]/span")
	@CacheLookup
	WebElement txtAddedCommentTimeline;
	
	//Reimbursement Form Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Reimbursement Form Details')]")
	@CacheLookup
	WebElement headerReimbursementForm;
	
	//Created Button
	@FindBy(xpath="(//span[contains(.,'Created')])[1]")
	@CacheLookup
	WebElement btnCreated;
	
	//Boots & Luggage Reimbursement Policy Header
	@FindBy(xpath="(//div[contains(.,'Boots & Luggage Reimbursement Policy')])[22]")
	@CacheLookup
	WebElement headerBLRFormPolicy;
	
	//Boots & Luggage Reimbursement Policy 
	@FindBy(xpath="//div[@data-block='MainFlow.BootsLuggageReimbursementPolicy'][contains(.,'Park Industries provides safety Personal Protective Equipment (PPE) to all associates as required by OSHA 1910 requirements. Shop associates, installers and field service associates must wear ANSI approved (OSHA Z41 or Z41.1 approved) steel-toe footwear. Calendar Year Reimbursement AllowedBoots:•   $400.00 annually: Large Machine, Plasma/Flame, Paint, Blast, Maintenance, Installation and Field Service•   $200.00 annually: All other departments ***Park does not reimburse for orthotics.Luggage: •   $200.00 annually for Installers and Field Service only')]")
	@CacheLookup
	WebElement txtBLRFormPolicy;
	
	//Calendar Year Reimbursement Allowed Header
	@FindBy(xpath="//div[@class='margin-top-s font-bold'][contains(.,'Calendar Year Reimbursement Allowed')]")
	@CacheLookup
	WebElement headerCalendarYearReimbursementAllowed;
	
	//Boots Header
	@FindBy(xpath="//div[@class='margin-top-s font-bold'][contains(.,'Boots:')]")
	@CacheLookup
	WebElement headerBoots;
	
	//Boots Policy 
	@FindBy(xpath="(//div[contains(.,'•   $400.00 annually: Large Machine, Plasma/Flame, Paint, Blast, Maintenance, Installation and Field Service•   $200.00 annually: All other departments')])[23]")
	@CacheLookup
	WebElement txtBoots;
	
	//Policy Note 
	@FindBy(xpath="//span[@class='font-size-xs'][contains(.,'***Park does not reimburse for orthotics.')]")
	@CacheLookup
	WebElement txtPolicyNote;
	
	//Luggage Header
	@FindBy(xpath="//div[@class='margin-top-s font-bold'][contains(.,'Luggage:')]")
	@CacheLookup
	WebElement headerLuggage;
	
	//Luggage Policy 
	@FindBy(xpath="//div[@data-block='MainFlow.BootsLuggageReimbursementPolicy'][contains(.,'Park Industries provides safety Personal Protective Equipment (PPE) to all associates as required by OSHA 1910 requirements. Shop associates, installers and field service associates must wear ANSI approved (OSHA Z41 or Z41.1 approved) steel-toe footwear. Calendar Year Reimbursement AllowedBoots:•   $400.00 annually: Large Machine, Plasma/Flame, Paint, Blast, Maintenance, Installation and Field Service•   $200.00 annually: All other departments ***Park does not reimburse for orthotics.Luggage: •   $200.00 annually for Installers and Field Service only')]")
	@CacheLookup
	WebElement txtLuggage;
	
	//Year Text 
	@FindBy(xpath="//label[@class='mandatory OSFillParent'][contains(.,'Year')]")
	@CacheLookup
	WebElement txtYear;
	
	//Year Text Field 
	@FindBy(xpath="//input[@type='number'][contains(@id,'Year')]")
	@CacheLookup
	WebElement txtYearInput;
	
	//Delete Request
	@FindBy(xpath="(//div[contains(.,'Delete Request')])[22]")
	@CacheLookup
	WebElement lbtnDeleteRequest;
	
	//Receipts Header
	@FindBy(xpath="//span[@class='heading6'][contains(.,'Receipts')]")
	@CacheLookup
	WebElement headerReceipts;
	
	//Add Receipt Button
	@FindBy(xpath="//button[@class='main-button btn btn-primary ThemeGrid_Width10'][contains(.,'Add Receipt')]")
	@CacheLookup
	WebElement btnAddReceipt;
	
	//Add New Receipt
	@FindBy(xpath="//div[@class='font-bold'][contains(.,'Add New Receipt')]")
	@CacheLookup
	WebElement txtAddNewReceipt;
	
	//Receipt Type Header
	@FindBy(xpath="//label[@class='OSFillParent'][contains(.,'Receipt Type')]")
	@CacheLookup
	WebElement headerReceiptType;
	
	//Drop Down Receipt Type
	@FindBy(xpath="//select[contains(@class,'dropdown-display dropdown')]")
	@CacheLookup
	WebElement ddReceiptType;
	
	//USD Requested Header
	@FindBy(xpath="//label[@class='OSFillParent'][contains(.,'USD Requested')]")
	@CacheLookup
	WebElement headerUSDRequested;
	
	//USD Requested Text Field
	@FindBy(xpath="//input[@type='number'][contains(@id,'USDValue')]")
	@CacheLookup
	WebElement txtUSDRequested;
	
	//Drop Down Receipt Type Boots
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div[1]/form/div[4]/div/form/div[2]/div/div/div[1]/div/div/select/option[2]")
	@CacheLookup
	WebElement ddReceiptTypeBoots;
	
	//Drop Down Receipt Type Luggage
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div[1]/form/div[4]/div/form/div[2]/div/div/div[1]/div/div/select/option[3]")
	@CacheLookup
	WebElement ddReceiptTypeLuggage;
	
	//Add Receipt File Button
	@FindBy(xpath="//*[@id=\"b17-Upload1\"]")
	@CacheLookup   
	WebElement btnAddReceiptFile;
	
	//Save and Submit Button
	@FindBy(xpath="//div[@class='btn-label OSInline'][contains(.,'Save & Submit')]")
	@CacheLookup
	WebElement btnSaveSubmit;
	
	//Back Button
	@FindBy(xpath="//button[@class='btn margin-right-m'][contains(.,'Back')]")
	@CacheLookup
	WebElement btnBack;
	
	//Request Summary Header
	@FindBy(xpath="//span[@class='heading4'][contains(.,'Request Summary')]")
	@CacheLookup
	WebElement headerRequestSummary;
	
	//Boots and Luggage Reimbursement Link Button
	public void clickBootsandLuggageReimbursement()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnBootsAndLuggageReimbursement);
	}
	
	//Confirm Header "Associate Forms Portal"
	public boolean verifyHeaderAssociateFormsPortal()
	{
		return func.verifyElementDisplayedWithText(headerAssociateFormsPortal, "Associate Forms Portal");
	}
	
	//Confirm Header "Boots & Luggage Reimbursement"
	public boolean verifyBootsLuggageReimbursement()
	{
		return func.verifyElementDisplayedWithText(headerBootsLuggageReimbursement, "Boots & Luggage Reimbursement");
	}
	
	//Confirm Header "Go To Sample Login"
	public boolean verifyHeaderGoToSampleLogin()
	{
		return func.verifyElementDisplayedWithText(headerGoToSampleLogin, "Go To Sample Login");
	}
	
	//Boots & Luggage Reimbursement Main is displayed
	public boolean txtBootsLuggageReimbursementMain()
	{
		return headerBootsLuggageMain.isDisplayed();
	}
	
	//Confirm Header "Request List"
	public boolean verifyHeaderRequestList()
	{
		return func.verifyElementDisplayedWithText(headerRequestList, "Request List");
	}
	
	//Search Bar is displayed
	public boolean txtSearchBar()
	{
		if(txtSearchBar.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Confirm Header "Boots & Luggage Reimbursement Form"
	public boolean verifyHeaderBootsLuggageReimbursementForm()
	{
	  return func.verifyElementDisplayedWithText(headerBootsLuggageReimbursementForm,"Boots & Luggage Reimbursement Form"); 
	}
	
	//Column Headers for Case iD, Form Name, Requester and Status
	public boolean locateColumnHeaders()
	{
		if(columnID.isDisplayed() && columnAssociate.isDisplayed() && columnAssociateNumber.isDisplayed() && columnDepartment.isDisplayed() && columnStatus.isDisplayed() && columnDateSubmitted.isDisplayed() && columnYear.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Column Headers for Case iD, Form Name, Requester and Status
	public boolean locateColumnHeadersVolunteerGrants()
	{
		if(columnID.isDisplayed() && columnAssociate.isDisplayed() && columnAssociateNumber.isDisplayed() && columnDepartment.isDisplayed() && columnStatus.isDisplayed() && columnDateSubmitted.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//New Request is displayed
	public boolean btnNewRequestDisplayed()
	{
		return btnNewRequest.isDisplayed();
	}
	
	//Logout Button Background Color
	public String btnNewRequestBgColor()
	{
		String bgColour = Color.fromString(btnNewRequest.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//New Request is clickable and displayed
	public void newRequestClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnNewRequest);
	}
	
	//Confirm Header "Boots & Luggage Reimbursement Request"
	public boolean verifyHeaderBootsLuggageReimbursementRequest()
	{
		return func.verifyElementDisplayedWithText(headerBootsLuggageReimbursementRequest, "Boots & Luggage Reimbursement Request");
	}
	
	//Confirm Header "Personal Info"
	public boolean verifyHeaderPersonalInfo()
	{
		return func.verifyElementDisplayedWithText(headerPersonalInfo, "Personal Info");
	}
	
	//Employee Number text is displayed
	public boolean txtEmployeeNumberDisplayed()
	{
		if(txtEmployeeNumber.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Employee Number is displayed
	public boolean employeeNumberDisplayed()
	{
		return EmployeeNumber.isDisplayed();
	}
	
	//Associate Name text is displayed
	public boolean txtAssociateNameDisplayed()
	{
		if(txtAssociateName.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Associate Name is displayed
	public boolean associateNameDisplayed()
	{
		return AssociateName.isDisplayed();
	}
	
	//Department text is displayed
	public boolean txtDepartmentDisplayed()
	{
		if(txtDepartment.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Department is displayed
	public boolean departmentDisplayed()
	{
		return Department.isDisplayed();
	}
	
	//Confirm Header "Add Comment"
	public boolean verifyAddComment()
	{
		return func.verifyElementDisplayedWithText(headerAddComment, "Add Comment");
	}
	
	//Add Comment Text is displayed
	public boolean addCommentDisplayed()
	{
		return txtAddComment.isDisplayed();
	}
	
	//Save Button is displayed
	public boolean saveDisplayed()
	{
		return btnSave.isDisplayed();
	}
	
	//Save Button Background Color
	public String btnSaveBgColour()
	{
		String bgColour = Color.fromString(btnSave.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Add Comments Placeholder
	public String addCommentsPlaceholder()
	{
		String placeholder = txtAddComment.getCssValue("placeholder");
		return placeholder;
	}
	
	//Enter Comments and Click Save Button
	public void enterComments()
	{
		txtAddComment.sendKeys("New Comment");
		btnSave.click();
	}
	
	//Save Button is displayed
	public boolean addedCommentDisplayed()
	{
		return txtAddedCommentTimeline.isDisplayed();
	}
	
	//Confirm Header "Reimbursement Form Details"
	public boolean verifyHeaderReimbursementFormDetails()
	{
		return func.verifyElementDisplayedWithText(headerReimbursementForm, "Reimbursement Form Details");
	}
	
	//Created Button is displayed
	public boolean createdDisplayed()
	{
		return btnCreated.isDisplayed();
	}
	
	//Created Button Background Color
	public String btnCreatedBgColour()
	{
		String bgColour = Color.fromString(btnCreated.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Header "Boots & Luggage Reimbursement Policy"
	public boolean verifyHeaderBootsLuggageReimbursementPolicy()
	{
		return func.verifyElementDisplayedWithText(headerBLRFormPolicy, "Boots & Luggage Reimbursement Policy");
	}
	
	//Boots & Luggage Reimbursement Policy is displayed
	public boolean bootsLuggageReimbursementPolicyDisplayed()
	{
		return txtBLRFormPolicy.isDisplayed();
	}
	
	//Confirm Header "Calendar Year Reimbursement Allowed"
	public boolean verifyHeaderCalendarYearReimbursementAllowed()
	{
		return func.verifyElementDisplayedWithText(headerCalendarYearReimbursementAllowed, "Calendar Year Reimbursement Allowed");
	}
	
	//Confirm Header "Boots"
	public boolean verifyHeaderBoots()
	{
		return func.verifyElementDisplayedWithText(headerBoots, "Boots:");
	}
	
	//Boots Policy is displayed
	public boolean bootsPolicyDisplayed()
	{
		return txtBoots.isDisplayed();
	}
	
	//Policy Note is displayed
	public boolean policyNoteDisplayed()
	{
		return txtPolicyNote.isDisplayed();
	}
	
	//Confirm Header "Luggage"
	public boolean verifyHeaderLuggage()
	{
		return func.verifyElementDisplayedWithText(headerLuggage, "Luggage:");
	}
	
	//Luggage Policy is displayed
	public boolean luggagePolicyDisplayed()
	{
		return txtLuggage.isDisplayed();
	}
	
	//Year is displayed
	public boolean yearDisplayed()
	{
		return txtYear.isDisplayed();
	}
	
	//Year Text Input is displayed
	public boolean yearInputDisplayed()
	{
		return txtYearInput.isDisplayed();
	}
	
	//Year Text Input
	public void yearInput()
	{
		txtYearInput.sendKeys("2021");
	}
	
	//Delete Request Link Button is displayed
	public boolean deleteRequestDisplayed()
	{
		return lbtnDeleteRequest.isDisplayed();
	}
	
	//Delete Request is clickable and displayed
	public void deleteRequestClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnDeleteRequest);
	}
	
	//Confirm Header "Receipt"
	public boolean verifyHeaderReceipt()
	{
		return func.verifyElementDisplayedWithText(headerReceipts, "Receipt");
	}
	
	//Add Receipt Button is displayed
	public boolean addReceiptDisplayed()
	{
		return btnAddReceipt.isDisplayed();
	}
	
	//Add Receipt Button Background Color
	public String btnAddReceiptBgColour()
	{
		String bgColour = Color.fromString(btnAddReceipt.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Save and Submit Button is clickable and displayed
	public void btnAddReceiptClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnAddReceipt);
	}
	
	//Confirm Header "Receipt Type"
	public boolean receiptTypeDisplayed()
	{
		return func.verifyElementDisplayedWithText(headerReceiptType, "Receipt Type");
	}
	
	//Confirm Header "USD Requested"
	public boolean uSDRequestedDisplayed()
	{
		return func.verifyElementDisplayedWithText(headerUSDRequested, "USD Requested");
	}
	
	//Select "Boots" as Receipt Type
	public void selectBootsType() 
	{
		ddReceiptType.click();
		ddReceiptTypeBoots.click();
	}
	
	//Enter "50" as USD Request for Price
	public void enterUSDRequest() 
	{
		txtUSDRequested.sendKeys("50");
	}
	
	//Back Button is displayed
	public boolean backDisplayed()
	{
		return btnBack.isDisplayed();
	}
	
	//Save & Submit Button is displayed
	public boolean saveSubmitDisplayed()
	{
		return btnSaveSubmit.isDisplayed();
	}
	
	//Save & Submit Button Background Color
	public String btnSaveSubmitBgColour()
	{
		String bgColour = Color.fromString(btnSaveSubmit.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Confirm Header "Request Summary"
	public boolean verifyHeaderRequestSummary()
	{
		return func.verifyElementDisplayedWithText(headerRequestSummary, "Request Summary");
	}
	
	//Back Button is clickable and displayed
	public void backClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnBack);
	}
	
	//Save and Submit Button is clickable and displayed
	public void saveSubmitClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnSaveSubmit);
	}
}

