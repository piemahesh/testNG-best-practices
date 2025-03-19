package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import util.DriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("im parent home test before class");
		System.out.println("==============================");
		this.driver = DriverManager.getDriver();
		if (this.driver == null) {
			throw new RuntimeException("WebDriver not initialized!");
		}
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		DriverManager.quitDriver();
	}
}
