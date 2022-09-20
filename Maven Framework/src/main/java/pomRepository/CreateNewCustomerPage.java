package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	
	WebDriver driver;
	public CreateNewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTxtField;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropDown;
	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	
	
	
	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getEnterCustomerNameTxtField() {
		return enterCustomerNameTxtField;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomerDropDown() {
		return selectCustomerDropDown;
	}
	
	public void createCustomerAction(String customerName, String descreiption) {
		enterCustomerNameTxtField.sendKeys(customerName);
		enterCustomerDescription.sendKeys(descreiption);
		selectCustomerDropDown.click();
		Actions action=new Actions(driver);
		action.moveByOffset(170, 500).click().perform();
		createCustomerButton.click();
		
	}
	
	

}
