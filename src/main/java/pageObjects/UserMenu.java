package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserMenu {
	public WebDriver driver;
	By userDropdown = By.xpath("//*[@id=\"userNav\"]");
	By userMenuList=By.xpath("//div[@id='usrNavMenu']//a");
	By myProfile = By.xpath("//a[@title='My Profile']");
	By mySettings = By.xpath("//a[@title='My Settings']");
	By SwitchToLightning = By.xpath("//*[@id=\"userNav-menuItems\"]/a[4]");
	By DeveloperConsole=By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]");
	By logout=By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]");

	public UserMenu(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUserMenu() {
		return driver.findElement(userDropdown);

	}
	public WebElement getUserMenuList() {
		return driver.findElement(userMenuList);

	}

	public WebElement getMyProfile() {

		return driver.findElement(myProfile);
	}

	public WebElement getMysettings() {
		return driver.findElement(mySettings);
	}

	public WebElement getLightningMode() {
		return driver.findElement(SwitchToLightning);
	}
	public WebElement getDeveloperConsole() {
		return driver.findElement(DeveloperConsole);
	}
	public WebElement getLogOut() {
		return driver.findElement(logout);
	}
	
	

}
