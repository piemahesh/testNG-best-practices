package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import config.ConfigReader;
import pages.Contactus;

public class TestContactPage extends BaseTest {

	
	Contactus contactpage;
	
	@Test
	public void testContactPage() {
		contactpage = new Contactus(driver);
		driver.get(ConfigReader.get("url")+"/contactus");
		contactpage.enterEnquiryFor("hello world");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
