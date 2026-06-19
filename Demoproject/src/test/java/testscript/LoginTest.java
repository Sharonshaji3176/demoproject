package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTest extends Base{
	//@Test(retryAnalyzer=retry.Retry.java )-for failed testcases
	@Test
	public void verifyUserValidCredentials() {
		Loginpage lp = new Loginpage(driver);
		lp.enterusername();
	    lp.enterpassword();
	    lp.login();
	}
	@Test

	public void verifyUserInvalidusername() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	    username.sendKeys("error");
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys("secret_sause");
	    WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	    login.click();
		
	}
	@Test

	public void verifyUserInvalidpassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	    username.sendKeys("standard_user");
	    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys("secret");
	    WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	    login.click();
	}
}
		
	


