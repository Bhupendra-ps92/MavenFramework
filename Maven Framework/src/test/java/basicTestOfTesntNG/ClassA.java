package basicTestOfTesntNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test 
	public void demo1() {
		System.out.println("From demo1");
		Reporter.log("Message from demo1", false);
			
	}
	@Test
	public void demo2() {
		System.out.println("From demo2");
			
	}
	@Test
	public void demo3() {
		System.out.println("From demo3");
		System.out.println("From demo3");
		

			
	}

}
