package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import config.ConfigReader;
import pages.GitLoginPage;
import util.TestListener;

@Listeners(TestListener.class)
public class TestGitLogin extends BaseTest {

	GitLoginPage gitLoginPage;
	SoftAssert softAssert = new SoftAssert();
	public WebDriver myDriver;

	@Test(testName = "hello")
	public void testLogin() {
		myDriver = driver;
		gitLoginPage = new GitLoginPage(driver);
		driver.get(ConfigReader.get("gitLink"));
		driver.manage().window().maximize();
		gitLoginPage.enterUsername("piemahesh@gmail.com");
		gitLoginPage.enterPassword("Eshwara@19");
		gitLoginPage.clickSignIn();
		System.out.println(gitLoginPage.getCurrentUrl());
//		Assert.fail();
		softAssert.assertEquals(ConfigReader.get("successGitLink"), gitLoginPage.getCurrentUrl());
		softAssert.assertAll();
	}

}
