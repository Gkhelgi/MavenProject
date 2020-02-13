package SForceTestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseClasses.getData_XL;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BaseClasses.DriverInitializations;
import BaseClasses.ValidationMethods;
import pageObjects.AccountsTab;
import pageObjects.Loginpage;
import pageObjects.MySettingsPage;
import pageObjects.ProfilePage;
import pageObjects.UserMenu;

public class SetUp extends DriverInitializations {
	
	@BeforeMethod
	public void setUp() throws IOException {
		//DriverInitializations di=new DriverInitializations();
		driver = initializeDriver();
		//driver.get("https://login.salesforce.com/");
		logger = reports.startTest("Login into SFDC");
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
	}
	@Test(enabled=false)
	//@Test(priority=1)
	public void setUpBrowser() throws IOException {
				
		getData_XL gd = new getData_XL();
		String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"MyProfileUserMenuDropDown_TC6.xls", "Sheet1");
		 logger = reports.startTest("Start UserMenuDropDown_TC5");
		//UserMenu um=new UserMenu(driver);	
		Loginpage lp = new Loginpage(driver);
		
		lp.getUser().sendKeys(data[1][2]);
		lp.getPswd().sendKeys(data[1][3]);
		lp.getLogin().click();
		lp.getPopup().click();
		UserMenu um=new UserMenu(driver);	
		um.getUserMenu().click();
		ValidationMethods vm= new ValidationMethods();
		vm.UserMenuDropDown();
		
			
	}
	//@Test(priority=2)
	@Test(enabled=false)
	public void MyProfileUserMenuDropDown_TC6() throws IOException, InterruptedException
	{
		getData_XL gd = new getData_XL();
		//Sting str=gd.getDataInput(prop.getProperty("XLData_Path"), filename, Sheetname)
		String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"MyProfileUserMenuDropDown_TC6.xls", "Sheet1");
		 logger = reports.startTest("Start UserMenuDropDown_TC6");
		UserMenu um=new UserMenu(driver);	
		Loginpage lp = new Loginpage(driver);
		ProfilePage pp=new ProfilePage(driver);
		lp.getUser().sendKeys(data[1][2]);
		lp.getPswd().sendKeys(data[1][3]);
		lp.getLogin().click();
		lp.getPopup().click();
		um.getUserMenu().click();
		um.getMyProfile().click();
		Thread.sleep(3000);
		pp.getEditProfile().click();
		Thread.sleep(3000);
		driver.switchTo().frame(prop.getProperty("FrameId"));
		System.out.println(driver.getTitle());
		pp.getAboutTab().click();
		pp.getLastName().sendKeys(data[1][5]);
		Thread.sleep(3000);
		pp.getSaveAll().click();
		pp.getPostMsg().click();
		driver.switchTo().frame(pp.getPostMsgFrameId());
		pp.getTextBox().sendKeys(data[1][5]);
		driver.switchTo().defaultContent();
		pp.getPublishPostMsg().click();
		pp.getAttachFile().click();
		pp.getUploadPhoto().click();
		pp.getChoosefIle().sendKeys(data[1][6]);
		System.out.println(driver.getTitle());
		pp.getsavePic().click();
		
		
		
	}
	@Test(enabled=false)
	//@Test(priority=3)
	public void MySettingsUserMenuDropDown_TC7() throws IOException
	{		
		getData_XL gd = new getData_XL();
			String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"MySettingsUserMenuDropDown_TC7.xls", "Sheet1");
			 logger = reports.startTest("Start UserMenuDropDown_TC7");
			UserMenu um=new UserMenu(driver);	
			Loginpage lp = new Loginpage(driver);
			lp.getUser().sendKeys(data[1][1]);
			lp.getPswd().sendKeys(data[1][2]);
			lp.getLogin().click();
			lp.getPopup().click();
			um.getUserMenu().click();
			um.getMysettings().click();
			MySettingsPage ms=new MySettingsPage(driver);
			ms.getpersonalInfo().click();
			ms.getloginHistory().click();
			ms.getloginHistoryLink().click();
			ms.getdisplayLayout().click();
			ms.getcustomiseAp().click();
			Select select=new Select(ms.getcustomApp());
			select.selectByVisibleText(prop.getProperty("customAppelement"));
			Select select1=new Select(ms.getavailablsTab());
			select1.selectByVisibleText(prop.getProperty("availablesTabElement"));
			ms.getreportsAdded().click();
			ms.getemailSetup().click();
			ms.getemailSettings().click();
			ms.getenterEmail().sendKeys(data[1][3]);
			ms.getenterEmailAddress().sendKeys(data[1][4]);
			ms.getbccRadioBtn().click();
}
	//@Test
	@Test(enabled=false)
	
	public void MySettingsUserMenuDropDown_TC8() throws IOException
	{		
		getData_XL gd = new getData_XL();
			String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"MySettingsUserMenuDropDown_TC8.xls", "Sheet1");
			 logger = reports.startTest("Start UserMenuDropDown_TC8");
			 UserMenu um=new UserMenu(driver);	
				Loginpage lp = new Loginpage(driver);			
			lp.getUser().sendKeys(data[1][1]);
			lp.getPswd().sendKeys(data[1][2]);
			lp.getLogin().click();
			lp.getPopup().click();
			um.getUserMenu().click();
			um.getDeveloperConsole().click();
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentWindow = it.next();
			String childwindow = it.next();
			driver.switchTo().window(childwindow);
			System.out.println(driver.getTitle());
			logger.log(LogStatus.PASS, "Switched to developer console window");
			driver.close();
			logger.log(LogStatus.PASS, "Developer window is closed");
			// Thread.sleep(3000);			
			driver.switchTo().window(parentWindow);
			logger.log(LogStatus.PASS, "Switched to default window");
}
	//@Test
	@Test(enabled=false)
	
	public void LogOutUserMenuDropDown_TC9() throws IOException
	{
		
		getData_XL gd = new getData_XL();
		String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"LogOutUserMenuDropDown_TC9.xls", "Sheet1");
		 logger = reports.startTest("Start UserMenuDropDown_TC9");
		 UserMenu um=new UserMenu(driver);	
			Loginpage lp = new Loginpage(driver);			
		lp.getUser().sendKeys(data[1][2]);
		lp.getPswd().sendKeys(data[1][3]);
		lp.getLogin().click();
		lp.getPopup().click();
		um.getUserMenu().click();
		um.getLogOut().click();
		String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		String expected_url=data[1][1];
		System.out.println(expected_url);
		ValidationMethods vm= new ValidationMethods();
		vm.actualExpected(actual_url,expected_url);
}
	@Test(priority=1)
	
	public void AccountName_CreateAccount_TC10() throws IOException, InterruptedException
	{
		
			logger = reports.startTest("AccountName_CreateAccount_TC10");
			getData_XL gd = new getData_XL();
			String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"NewViewCreateAccount_TC11.xls", "Sheet1");
			
			 UserMenu um=new UserMenu(driver);	
				Loginpage lp = new Loginpage(driver);	
				lp.getUser().sendKeys(data[1][1]);
				lp.getPswd().sendKeys(data[1][2]);
				lp.getLogin().click();
				lp.getPopup().click();
				AccountsTab at=new AccountsTab(driver);
				at.getaccountsTab().click();
				at.getaccountName().sendKeys(data[1][3]);
				at.getsaveBtn().click();
				
}
	//@Test(priority=2)
	@Test(enabled=false)
	public void NewViewCreateAccount_TC11() throws IOException, InterruptedException
	{
		
		getData_XL gd = new getData_XL();
		String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"NewViewCreateAccount_TC11.xls", "Sheet1");
		 logger = reports.startTest("NewViewCreateAccount_TC11");
		 UserMenu um=new UserMenu(driver);	
			Loginpage lp = new Loginpage(driver);	
			lp.getUser().sendKeys(data[1][1]);
			lp.getPswd().sendKeys(data[1][2]);
			lp.getLogin().click();
			lp.getPopup().click();
			AccountsTab at=new AccountsTab(driver);
			at.getaccountsTab().click();
}
}
