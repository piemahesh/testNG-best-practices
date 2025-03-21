package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.HomePage;

public class TestHomepage extends BaseTest {

	HomePage homepage;

	@BeforeGroups
	public void setupChild() {
		System.out.println("Initializing HomePage in TestHomepage...");
		if (driver == null) {
			throw new RuntimeException("Driver is NULL in TestHomepage! Check BaseTest.");
		}
		homepage = new HomePage(driver);
		driver.get(ConfigReader.get("url"));
		
	}

	@Test(groups = {"regression"})
	public void testHomePage() throws InterruptedException {
		System.out.println("Driver in testHomePage: " + driver);
		System.out.println(homepage.getDriver().getCurrentUrl());
		System.out.println("Home page is tested");
	}

	@Test(groups = { "sanity" })
	public void aTest() {

		WebElement whatsNew = homepage.getWhatsNew();
		System.out.println("=============================");
		System.out.println("Is 'What's New' displayed? " + whatsNew.isDisplayed());
	}

	@Test(groups = { "regression", "sanity" })
	public void bTest() {
		System.out.println("test 2 regression");
	}

	@Test
	public void cTest() {
		System.out.println("test 3");
	}

	@Test(groups = { "adhoc" })
	public void kTest() {
		System.out.println("test 4 adhoc");
	}

	@Test
	public void sTest() {
		System.out.println("test 5");
	}

}
