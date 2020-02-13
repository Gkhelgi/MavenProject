package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class MySettingsPage {

	public WebDriver driver;
	By personalInfo = By.xpath("//*[@id=\"PersonalInfo\"]/a");
	By loginHistory = By.xpath("//*[@id=\"LoginHistory_font\"]");
	By loginHistoryLink = By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a");
	By displayLayout = By.xpath("//*[@id=\"DisplayAndLayout_font\"]");
	By customiseAp = By.xpath("//*[@id=\"CustomizeTabs_font\"]");
	By customApp = By.xpath("//*[@id=\"p4\"]");
	// Select select=new Select(customApp);
	// select.selectByVisibleText("Salesforce Chatter");
	By availablsTab = By.xpath("//*[@id=\"duel_select_0\"]");
	// Select select1=new Select(availablsTab);
	// select1.selectByVisibleText("Reports");
	By reportsAdded = By.xpath("//*[@id=\"duel_select_0_right\"]/img");
	By emailSetup = By.xpath("//*[@id=\"EmailSetup\"]/a");
	By emailSettings = By.xpath("//*[@id=\"EmailSettings_font\"]");
	By enterEmail = By.xpath("//*[@id=\"sender_name\"]");
	By enterEmailAddress = By.xpath("//*[@id=\"sender_email\"]");
	By bccRadioBtn = By.xpath("//*[@id=\"auto_bcc1\"]");

	public MySettingsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getpersonalInfo() {

		return driver.findElement(personalInfo);
	}

	public WebElement getloginHistory() {
		return driver.findElement(loginHistory);
	}

	public WebElement getloginHistoryLink() {
		return driver.findElement(loginHistoryLink);
	}

	public WebElement getdisplayLayout() {
		return driver.findElement(displayLayout);
	}

	public WebElement getcustomiseAp() {
		return driver.findElement(customiseAp);
	}

	public WebElement getavailablsTab() {
		return driver.findElement(availablsTab);
	}

	public WebElement getreportsAdded() {
		return driver.findElement(reportsAdded);
	}

	public WebElement getemailSetup() {
		return driver.findElement(emailSetup);
	}

	public WebElement getemailSettings() {
		return driver.findElement(emailSettings);
	}

	public WebElement getenterEmail() {
		return driver.findElement(enterEmail);
	}

	public WebElement getenterEmailAddress() {
		return driver.findElement(enterEmailAddress);
	}

	public WebElement getcustomApp() {
		return driver.findElement(customApp);
	}

	public WebElement getbccRadioBtn() {
		return driver.findElement(bccRadioBtn);
	}

}
