package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}



	private By navBar = By.xpath("//*[@id=\"root\"]/section[1]/nav");

	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}

}
