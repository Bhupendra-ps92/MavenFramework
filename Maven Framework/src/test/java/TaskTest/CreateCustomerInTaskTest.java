package TaskTest;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomRepository.CreateNewCustomerPage;
import pomRepository.HomePage;
import pomRepository.TaskPage;

public class CreateCustomerInTaskTest extends BaseClass {
	@Test
	public void createCustomerTest() throws IOException {
		// object creation statements
		HomePage home = new HomePage(driver);
		TaskPage task = new TaskPage(driver);
		CreateNewCustomerPage createCutomer = new CreateNewCustomerPage(driver);
		// getting random no
		int randomNo = jUtils.generateRandomNo(1000);
		// fetching data from excel sheet
		String expectedCustomerName = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 0) + randomNo;
		String description = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 1);
		// clicking on Task Button
		home.clickOnTaskButton();
		// clicking on new Customer button
		task.clickOnNewCustomerButton();
		// creating customer
		createCutomer.createCustomerAction(expectedCustomerName, description);
		// verification
		String actualCustomerName = task.verifyCustomerName(expectedCustomerName);
		Assert.assertEquals(actualCustomerName, expectedCustomerName);
		System.out.println("The Customer Name Has been Verified");
	}

}
