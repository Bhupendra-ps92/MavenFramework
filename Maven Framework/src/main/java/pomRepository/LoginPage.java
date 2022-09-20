package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//Constructor which will load all the findBy during object creation
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//We Are identifying all the elements
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;

	//Getters Methods 
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business Logic/Generic Method for Login
	public void loginAction(String username, String password) {
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	

}
