package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {
			setDriver("chrome"); // Default to Chrome if no browser is set
		}
		return driver.get();
	}

	public static void setDriver(String browser) {
		if (driver.get() == null) { // Ensure a fresh instance per thread
			if (browser.equalsIgnoreCase("chrome")) {
				driver.set(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver.set(new FirefoxDriver());
			}
		}
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
}
