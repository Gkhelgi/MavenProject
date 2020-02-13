package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class AccountsTab {
	public WebDriver driver;

	By accountsTab = By.xpath("//*[@id=\"Account_Tab\"]/a");
	By accountName = By.xpath("//*[@id=\"2\"]");
	By viewName=By.id("fname");
	By viewUniqueName=By.id("devname");
	By saveBtn1=By.name("save");
	By viewPage=  By.xpath("//*[@class='title']");

	By saveBtn = By.name("save");

	public AccountsTab(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getaccountsTab() {
		return driver.findElement(accountsTab);

	}

	public WebElement getaccountName() {
		return driver.findElement(accountName);

	}

	public WebElement getsaveBtn() {

		return driver.findElement(saveBtn1);
	}
	public WebElement getviewName() {

		return driver.findElement(viewName);
	}
	public WebElement getviewUniqueName() {

		return driver.findElement(viewUniqueName);
	}
	public WebElement getsaveBtn1() {

		return driver.findElement(saveBtn1);
	}
	public WebElement getviewPage() {

		return driver.findElement(viewPage);
	}


}
