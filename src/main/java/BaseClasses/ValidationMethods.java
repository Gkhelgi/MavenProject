package BaseClasses;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.UserMenu;

public class ValidationMethods extends DriverInitializations {
	
	public static WebDriver driver;

	public static void UserMenuDropDown( )
	{
		String[] ExpectedUserMenu={"My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience", "Logout" };
	driver.findElement(By.xpath("//*[@id=\\\"userNav\\\"]")).click();
	List<WebElement> dropdownList=driver.findElements(By.xpath("//div[@id='userNavMenu']//a"));
	int count=0;
	for(int i=0;i<ExpectedUserMenu.length;i++)
	{
		if(ExpectedUserMenu[i].equals(dropdownList.get(i).getText()))
		{
			count++;
		}
				else
		{
			System.out.println("Test Failed");
		}
		System.out.println("All the userMenu drop down elemnts are displayed");
		
	}
	}
	
	public  void actualExpected(String actual,String expected)
	{
		System.out.println("hello");
		if(actual.equals(expected) || actual.contains(expected)) {
			System.out.println("Pass");
			logger.log(LogStatus.PASS,"Actual and Expected  are same");
			System.out.println("Pass");
		}
		else
		{
			logger.log(LogStatus.FAIL,"Actual and Expected  are not same");
			System.out.println("fail");
		}
	}

}
