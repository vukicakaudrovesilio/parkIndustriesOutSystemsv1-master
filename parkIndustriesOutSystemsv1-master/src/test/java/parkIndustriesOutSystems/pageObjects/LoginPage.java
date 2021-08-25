package parkIndustriesOutSystems.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class LoginPage {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public LoginPage(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//AssociateForms Page Header
	@FindBy(xpath="//span[@class='heading5 text-neutral-8'][contains(.,'AssociateForms')]")
	@CacheLookup	
	WebElement pageHeader;
	
	//Login as Sample User Text Field
	@FindBy(xpath="//span[@class='heading6'][contains(.,'Login as Sample User')]")
	@CacheLookup
	WebElement txtLoginAsSampleUser;
	
	//Park Theme Image on Sample User Login
	@FindBy(xpath="//img[@src='/HRForms/img/Park_Theme.park_logo.png?oTXVEko_F5fd_wGyCRdyiA']")
	@CacheLookup
	WebElement imgParkTheme;
	
	//Human Resources User Link Button
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'Human Resources User')]")
	@CacheLookup
	WebElement lbtnHRUser;
	
	//Park Theme Image on Sample User Login
	@FindBy(xpath="//img[contains(@class,'app-logo')]")
	@CacheLookup
	WebElement imgParkHR;
	
	//Go To Sample Login Link Button
	@FindBy(xpath="//a[@class='margin-left-base'][contains(.,'Go To Sample Login')]")
	@CacheLookup
	WebElement lbtnSampleLogin;
	
	//Logout Button
	@FindBy(xpath="//button[@class='btn btn-primary'][contains(.,'Logout Sample User')]")
	@CacheLookup
	WebElement btnLogout;
	
	//Implicit Wait Function
	public void implicitwait() 
	{
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//Confirm Header "HRForms"
	public boolean verifyHeader()
	{
		return func.verifyElementDisplayedWithText(pageHeader, "HRForms");
	}
	
	//Login as Sample User text is displayed
	public boolean txtLoginAsSampleUserDisplayed()
	{
		return txtLoginAsSampleUser.isDisplayed();
	}
	
	//Login as Sample User text is displayed
	public boolean btnLogoutDisplayed()
	{
		return btnLogout.isDisplayed();
	}
	
	//Logout Button Background Color
	public String btnLogoutBgColour()
	{
		String bgColour = Color.fromString(btnLogout.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Click Human Resources User Link Button
	public void clickHRUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnHRUser);
	}
	
	//Click Human Go To Sample Login Link Button
	public void clickSampleLogin()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnSampleLogin);
	}
	
	//Click Logout Button
	public void clickLogout()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnLogout);
	}
}
