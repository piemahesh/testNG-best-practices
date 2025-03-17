package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private 
	
	public static WebDriver getDriver() {
		return new ChromeDriver();
	}
}
