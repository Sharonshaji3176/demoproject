package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	public Loginpage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='user-name']") WebElement username;
	@FindBy(xpath ="//input[@id='password']") WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")  WebElement login ;

	
	public void enterusername() {
		username.sendKeys("standard_user");
		
	}
	public void enterpassword() {
		password.sendKeys("secret_sauce");
	}
	public void login() {
		 login.click();
	}
	}

