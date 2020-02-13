package BaseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverInitializations {
	public WebDriver driver;
	
	public Properties prop;
	public static ExtentReports reports;
	public static ExtentTest logger;
	
	
	public WebDriver initializeDriver() throws IOException {
		String path = "C:\\Users\\Megha\\Desktop\\Automation_Architect\\ExtentReports\\SFDC.html";
		reports = new ExtentReports(path);
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Megha\\Documents\\eclipse\\E2EProject\\src\\main\\java\\BaseClasses\\Data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
			 driver = new ChromeDriver();		
			
		}
		else
			if(browserName=="firefox") {
				System.setProperty("webdriver.firfox.driver", "C:\\Users\\Megha\\geckodriver.exe");
				 driver = new FirefoxDriver();
				
			}
			else
				if(browserName=="IE") {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
					 driver = new ChromeDriver();
				}
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
		}

}
