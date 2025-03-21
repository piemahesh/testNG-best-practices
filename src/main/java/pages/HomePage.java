package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait; // ✅ Add WebDriverWait

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // ✅ Set a 10-second wait
		PageFactory.initElements(driver, this);
	}

	private By navBar = By.xpath("//*[@id=\"root\"]/section[1]/nav");

	public WebElement getNavBar() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(navBar)); // ✅ Ensure visibility before
																					// returning
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(className = "whatsNewAtOcean")
	WebElement whatsNew;

	public WebElement getWhatsNew() {
		return wait.until(ExpectedConditions.visibilityOf(whatsNew)); // ✅ Wait for element to be visible
	}

	
}
