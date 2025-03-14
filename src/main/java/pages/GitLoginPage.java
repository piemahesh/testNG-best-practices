package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitLoginPage {

	WebDriver driver;

	public GitLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "login")
	WebElement usernameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "commit")
	WebElement signInBtn;

	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickSignIn() {
		signInBtn.click();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

}
