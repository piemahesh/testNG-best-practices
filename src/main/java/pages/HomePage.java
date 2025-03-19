package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private By navBar = By.xpath("//*[@id=\"root\"]/section[1]/nav");

	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWhatsNew() {
		return whatsNew;
	}

	@FindBy(className = "whatsNewAtOcean")
	WebElement whatsNew;

	public boolean whatsNew() {
		System.out.println(whatsNew.isDisplayed());
		return whatsNew.isDisplayed();
	}

}
