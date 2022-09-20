package basicTestOfTesntNG;

import org.testng.annotations.Test;

public class ToPerformGroupExecution {
	
	@Test(groups = "smokeTesting")
	public void login() {
		System.out.println("Login is Successfull");
	}
	@Test (groups = "{smoke, regression}")
	public void select() {
		System.out.println("Product is selected");
	}
	@Test (groups = "regressionTesting")
	public void addToCart() {
		System.out.println("Product added to the cart");
	}
	@Test (groups = "regressionTesting")
	public void payment() {
		System.out.println("Payment is Successful");
	}
	@Test (groups = "smokeTesting")
	public void logout() {
		System.out.println("logged out successfully");
	}
	


}
