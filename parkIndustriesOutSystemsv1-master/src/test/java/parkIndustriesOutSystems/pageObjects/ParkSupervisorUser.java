package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class ParkSupervisorUser {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public ParkSupervisorUser(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Park Supervisor User Link Button
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/form/div/div[2]/div/div[2]/div[2]/a/span")
	@CacheLookup
	WebElement lbtnParkSupervisorUser;
	
	//Park Supervisor User's Requests Header
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement headerParkSupervisorUserRequests;
	
	//Taskbox Header
	@FindBy(xpath="//a[contains(.,'Taskbox')]")
	@CacheLookup   
	WebElement headerTaskbox;
	
	//Associate Forms Portal Header
	@FindBy(xpath="//span[@class='font-bold'][contains(.,'Associate Forms Portal')]")
	@CacheLookup   
	WebElement headerAssociates;

	//Park Associate User Taskbox Title
	@FindBy(xpath="//div[@class='ph'][contains(.,'Taskbox')]")
	@CacheLookup
	WebElement pageTaskboxTitle;
	
	//Park Associate User Associates Title
	@FindBy(xpath="//div[@class='ph'][contains(.,'List of All Associates')]")
	@CacheLookup
	WebElement pageAssociatesTitle;
	
	//Park Supervisor User Text
	@FindBy(xpath="//span[contains(.,'Park Supervisor User')]")
	@CacheLookup
	WebElement txtParkSupervisorUser;
	
	//Export To Excel Button
	@FindBy(xpath="//div[@class='btn-label OSInline'][contains(.,'Export To Excel')]")
	@CacheLookup   
	WebElement btnExportExcel;
	
	//Export Options Button
	@FindBy(xpath="//button[@class='btn ThemeGrid_MarginGutter'][contains(.,'Export Options')]")
	@CacheLookup
	WebElement btnExportOptions;
	
	//Export Options Text
	@FindBy(xpath="(//span[@class='heading3'][contains(.,'Export Options')])[2]")
	@CacheLookup
	WebElement txtExportOptions;
	
	//Export Options Choose A Date Range
	@FindBy(xpath="//div[@class='ThemeGrid_Width4'][contains(.,'Choose a date range')]")
	@CacheLookup
	WebElement txtChooseADateRange;
	
	//Export Options Choose A Date Range Checkbox
	@FindBy(xpath="//input[@id='ShowDateRange']")
	@CacheLookup
	WebElement chkboxChooseADateRange;
	
	//Export Options Choose A Date Range Checkbox From Date
	@FindBy(xpath="(//span[@class='heading6'][contains(.,'From:')])[2]")
	@CacheLookup
	WebElement txtFromDate;
	
	//Export Options Choose A Date Range Checkbox From Date
	@FindBy(xpath="(//span[@class='heading6'][contains(.,'From:')])[2]")
	@CacheLookup
	WebElement selectFromDate;
	
	//Export Options Choose A Date Range Checkbox To Date
	@FindBy(xpath="(//span[@class='heading6'][contains(.,'From:')])[2]")
	@CacheLookup
	WebElement txtToDate;
	
	//Export Options Choose A Date Range Checkbox To Date
	@FindBy(xpath="(//span[@class='heading6'][contains(.,'From:')])[2]")
	@CacheLookup
	WebElement selectToDate;
	
	//Export To Excel Button
	@FindBy(xpath="(//div[@class='btn-label OSInline'][contains(.,'Export To Excel')])[2]")
	@CacheLookup   
	WebElement btnExportToExcel;
	
	//Close Button
	@FindBy(xpath="(//button[@class='btn ThemeGrid_MarginGutter'][contains(.,'Close')])[2]")
	@CacheLookup
	WebElement btnClose;
	
	//Click Park Supervisor User Link Button
	public void clickParkSupervisorUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnParkSupervisorUser);
	}
	
	//Confirm Header "Park Supervisor User's Requests"
	public boolean verifyHeaderPSUR()
	{
		return func.verifyElementDisplayedWithText(headerParkSupervisorUserRequests, "Park Supervisor User's Requests");
	}
	
	//Confirm Header "Taskbox"
	public boolean verifyHeaderTaskbox()
	{
		return func.verifyElementDisplayedWithText(headerTaskbox, "Taskbox");
	}
	
	//Confirm Header "Associates"
	public boolean verifyHeaderAssociates()
	{
		return func.verifyElementDisplayedWithText(headerAssociates, "Associates");
	}
	
	//Confirm Title "Taskbox"
	public boolean locateTaskboxTitle()
	{
		if(pageTaskboxTitle.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Taskbox is clickable and displayed
	public void taskboxClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerTaskbox);
	}
	
	//Confirm Title "Associates"
	public boolean locateAssociatesTitle()
	{
		if(pageAssociatesTitle.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Associates is clickable and displayed
	public void associatesClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerAssociates);
	}
	
	//Park Supervisor User Text is displayed
	public boolean txtParkSupervisorUser()
	{
		return txtParkSupervisorUser.isDisplayed();
	}
	
	//Export Excel Button is displayed
	public boolean btnExportExcelDisplayed()
	{
		return btnExportExcel.isDisplayed();
	}
	
	//Export Excel Button Background Color
	public String btnExportExcelBgColor()
	{
		String bgColour = Color.fromString(btnExportExcel.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Export Options Button is displayed
	public boolean btnExportOptionsDisplayed()
	{
		return btnExportOptions.isDisplayed();
	}
	
	//Export Options is clickable and displayed
	public void btnExportOptionsClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnExportOptions);
	}
	
	//Export Options Text is displayed
	public boolean txtExportOptionsTextDisplayed()
	{
		return txtExportOptions.isDisplayed();
	}
		
	//Choose A Date Range Text is displayed
	public boolean txtChooseADateRangeDisplayed()
	{
		return txtChooseADateRange.isDisplayed();
	}
	
	//Choose A Date Range Checkbox is displayed
	public boolean chkboxChooseADateRangeDisplayed()
	{
		return chkboxChooseADateRange.isDisplayed();
	}
	
	//Choose A Date Range Checkbox is clickable and displayed
	public void chkboxChooseADateRangeClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", chkboxChooseADateRange);
	}
	
	//Choose A Date Range From Date Text is displayed
	public boolean txtFromDateDisplayed()
	{
		return txtFromDate.isDisplayed();
	}
	
	//Choose A Date Range From Date Field is displayed
	public boolean selectFromDateDisplayed()
	{
		return selectFromDate.isDisplayed();
	}
	
	//Choose A Date Range To Date Text is displayed
	public boolean txtToDateDisplayed()
	{
		return txtToDate.isDisplayed();
	}
	
	//Choose A Date Range To Date Field is displayed
	public boolean selectToDateDisplayed()
	{
		return selectToDate.isDisplayed();
	}
	
	//Export To Excel Button is displayed
	public boolean btnExportToExcelDisplayed()
	{
		return btnExportToExcel.isDisplayed();
	}
	
	//Close Button is displayed
	public boolean btnCloseDisplayed()
	{
		return btnClose.isDisplayed();
	}
	
	//Close Button is clickable and displayed
	public void btnCloseClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnClose);
	}
}
