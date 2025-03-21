package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {
			System.out.println("Driver is null, initializing...");
			setDriver("chrome"); // Ensures driver is always set before getting
		}
		return driver.get();
	}

	public static void setDriver(String browser) {
		if (driver.get() == null) { // Prevents multiple WebDrivers in the same thread
			System.out.println("Setting up WebDriver for: " + browser);
			if (browser.equalsIgnoreCase("chrome")) {
				driver.set(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver.set(new FirefoxDriver());
			} else {
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}
		}
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			System.out.println("Quitting WebDriver...");
			driver.get().quit();
			driver.remove();
		}
	}
}
