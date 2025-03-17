package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.HomePage;

public class TestHomepage extends BaseTest {

	HomePage homepage;

	@Test
	public void testHomePage() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Home page is tested");
		homepage = new HomePage(driver);
		driver.get(ConfigReader.get("url"));
		System.out.println("Home page is tested");
//		System.out.println(homepage.getNavBar().isDisplayed());

	}

	@Test
	public void aTest() {
		System.out.println("test 1");
	}

	@Test
	public void bTest() {
		System.out.println("test 2");
	}

	@Test
	public void cTest() {
		System.out.println("test 3");
	}

	@Test
	public void kTest() {
		System.out.println("test 4");
	}

	@Test
	public void sTest() {
		System.out.println("test 5");
	}

}
