package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import util.DriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Initializing WebDriver in BaseTest...");

		DriverManager.setDriver("chrome"); //  Explicitly set the driver first
		this.driver = DriverManager.getDriver();

		if (this.driver == null) {
			throw new RuntimeException("WebDriver not initialized!");
		}

		System.out.println("Driver initialized successfully: " + driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		DriverManager.quitDriver();
	}
}
