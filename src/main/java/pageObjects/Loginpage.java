package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	By userName = By.id("username");
	By passWord = By.id("password");
	By logIn = By.id("Login");
	By popUp = By.id("tryLexDialogX");
	By rememberMe=By.id("rememberUn");
	By forgotPassword=By.id("forgot_password_link");

	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getUser() {
		return driver.findElement(userName);
	}

	public WebElement getPswd() {
		return driver.findElement(passWord);
	}

	public WebElement getLogin() {
		return driver.findElement(logIn);
	}

	public WebElement getPopup() {
		return driver.findElement(popUp);
	}
	public WebElement getrememberMe() {
		return driver.findElement(rememberMe);
	}
	public WebElement getforgotPassword() {
		return driver.findElement(forgotPassword);
	}


}
