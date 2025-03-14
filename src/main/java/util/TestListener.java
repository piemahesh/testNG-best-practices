package util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver;
		try {
			System.out.println();
			String filename = result.getName() + String.valueOf(System.currentTimeMillis());
			driver = (WebDriver) result.getInstance().getClass().getDeclaredField("myDriver").get(result.getInstance());
			ScreenshotUtil.getScreenshot(driver, filename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestFailure(result);
	}

}
