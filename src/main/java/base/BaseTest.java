package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.DriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeSuite
	public void setup() {
		this.driver = DriverManager.getDriver();
	}

	@AfterSuite
	public void tearDown() {
		
			System.out.println("quited");
			driver.quit();
		
	}

}
