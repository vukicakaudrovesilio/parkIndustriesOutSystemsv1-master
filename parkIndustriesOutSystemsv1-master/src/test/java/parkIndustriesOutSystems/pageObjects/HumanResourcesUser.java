package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class HumanResourcesUser {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public HumanResourcesUser(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Human Resources User Link Button
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'Human Resources User')]")
	@CacheLookup
	WebElement lbtnHumanResourcesUser;
	
	//Human Resources User's Requests Header
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement headerHumanResourcesUserRequests;
	
	//Human Resources User Text
	@FindBy(xpath="//span[contains(.,'Human Resources User')]")
	@CacheLookup
	WebElement txtHumanResourcesUser;
	
	//Click Human Resources User Link Button
	public void clickHumanResourcesUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnHumanResourcesUser);
	}
	
	//Confirm Header "Human Resources User's Requests"
	public boolean verifyHeaderHRUR()
	{
		return func.verifyElementDisplayedWithText(headerHumanResourcesUserRequests, "Human Resources User's Requests");
	}
	
	//Human Resources User Text is displayed
	public boolean txtHumanResourcesUser()
	{
		return txtHumanResourcesUser.isDisplayed();
	}
	
}
