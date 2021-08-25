package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class AccountingUser {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public AccountingUser(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Accounting User Link Button
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'Accounting User')]")
	@CacheLookup
	WebElement lbtnAccountingUser;
	
	//Accounting User's Requests Header
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement headerAccountingUserRequests;
	
	//Accounting User Text
	@FindBy(xpath="//span[contains(.,'Accounting User')]")
	@CacheLookup
	WebElement txtAccountingUser;
	
	//Click Accounting User Link Button
	public void clickAccountingUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnAccountingUser);
	}
	
	//Confirm Header "Accounting User's Requests"
	public boolean verifyHeaderAUR()
	{
		return func.verifyElementDisplayedWithText(headerAccountingUserRequests, "Accounting User's Requests");
	}
	
	//Accounting User Text is displayed
	public boolean txtAccountingUser()
	{
		return txtAccountingUser.isDisplayed();
	}
	
}
