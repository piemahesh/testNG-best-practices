package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.HomePage;

public class TestHomepage extends BaseTest {

	HomePage homepage;
	
	@BeforeClass
	public void setup() {
		
		System.out.println("im child home test before class");
		System.out.println(driver+"dsfsdafasdf");
		homepage = new HomePage(driver);
		System.out.println(driver);
		System.out.println("====================");
	}

	@Test
	public void testHomePage() throws InterruptedException {

		System.out.println(driver);
		driver.get(ConfigReader.get("url"));
		System.out.println("Home page is tested");
		homepage.whatsNew();
//		System.out.println(homepage.getNavBar().isDisplayed());

	}

	@Test(groups = { "sanity" })
	public void aTest() {
		WebElement whatsNew = homepage.getWhatsNew();
		System.out.println("=============================");
		System.out.println(whatsNew.isDisplayed());
		System.out.println("test 1 sanity");
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
