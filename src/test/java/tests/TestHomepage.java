package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.HomePage;

public class TestHomepage extends BaseTest {

	HomePage homepage;

	@Test
	public void testHomePage() {
		homepage = new HomePage(driver);
		driver.get(ConfigReader.get("url"));
//		System.out.println(homepage.getNavBar().isDisplayed());

	}
}
