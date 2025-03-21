package tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestOnlineShoping {

	@Test(groups = { "sanity", "regression" })
	public void login() {
		System.out.println("login");

	}


	@Test(dependsOnMethods = { "login" }, groups = { "sanity" })
	public void checkStock() {
		long count = Math.round(Math.random() * 10);
		System.out.println(count);
		System.out.println("checking stock....");
		if (count < 5) {
			Assert.fail("out of stock");
		}
	}

	@Test(dependsOnMethods = { "login", "checkStock" }, ignoreMissingDependencies = true)
	public void payment() {
		System.out.println("payment ....");
	}

	@Test(dependsOnMethods = { "login", "payment" }, alwaysRun = true)
	public void fillAddress() {
		System.out.println("address fill");
	}

	@Test(dependsOnMethods = { "login", "fillAddress", "payment" })
	public void checkPaymentStatus() {
		System.out.println("checking payment....");
	}

	@Test(dependsOnMethods = { "login", "checkPaymentStatus", "payment" })
	public void placeOrder() {
		System.out.println("placed order");
	}

}

//@Test(priority = 1)
//public void login() {
//	System.out.println("login");
//	Assert.fail();
//}
//
//@Test(priority = 2)
//public void checkStock() {
//	System.out.println("checking stock....");
//}
//
//@Test(priority = 3)
//public void payment() {
//	System.out.println("payment ....");
//}
//
//@Test(priority = 4)
//public void fillAddress() {
//	System.out.println("address fill");
//}
//
//@Test(priority = 5)
//public void checkPaymentStatus() {
//	System.out.println("checking payment....");
//}
//
//@Test(priority = 6)
//public void placeOrder() {
//	System.out.println("placed order");
//}
