package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactus {

	WebDriver driver;

	public Contactus(WebDriver driver) {
		this.driver = driver;
	}

	private By enquiryFor = By.name("enquiryFor");

	public void enterEnquiryFor(String value) {
		driver.findElement(enquiryFor).sendKeys(value);
	}
}
