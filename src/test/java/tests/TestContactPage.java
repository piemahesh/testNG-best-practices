package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.Contactus;

public class TestContactPage extends BaseTest {

	Contactus contactpage;

	@Test(groups = {"sanity"})
	public void testContactPage() {
		contactpage = new Contactus(driver);
		driver.get(ConfigReader.get("url") + "/contactus");
		contactpage.enterEnquiryFor("hello world");
		System.out.println("contact page sanity");

	}

	@Test
	public void aTest() {
		System.out.println("test 1 from contact page");
	}

	@Test(groups = {"sanity"})
	public void bTest() {
		System.out.println("test 2 from contact page sanity");
	}

	@Test
	public void cTest() {
		System.out.println("test 3 from contact page");
	}

	@Test
	public void kTest() {
		System.out.println("test 4 from contact page");
	}

	@Test(groups = {"regression"})
	public void sTest() {
		System.out.println("test 5 from contact page regression");
	}

}
