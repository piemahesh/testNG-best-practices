package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.Contactus;

public class TestContactPage extends BaseTest {

	
	Contactus contactpage;
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("contact poage");
	}
	@Test
	public void testContactPage() {
		
		contactpage = new Contactus(driver);
		System.out.println("contact poage");
		driver.get(ConfigReader.get("url")+"/contactus");
		contactpage.enterEnquiryFor("hello world");
		
	}
	@Test
	public void aTest() {
		System.out.println("test 1 from contact page");
	}

	@Test
	public void bTest() {
		System.out.println("test 2 from contact page");
	}

	@Test
	public void cTest() {
		System.out.println("test 3 from contact page");
	}

	@Test
	public void kTest() {
		System.out.println("test 4 from contact page");
	}

	@Test
	public void sTest() {
		System.out.println("test 5 from contact page");
	}

}
