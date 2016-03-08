package cucumber.BDD.Defenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AbstractPageStepDefinotion {
	public static WebDriver driver;

//	public WebDriver getDriver() {
//		if (driver == null) {
//			driver = new FirefoxDriver();
//		}
//		return driver;
//	}
	
	@BeforeSuite
	public void openbrowser()
	{
		driver = new FirefoxDriver();		
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();		
	}
}
