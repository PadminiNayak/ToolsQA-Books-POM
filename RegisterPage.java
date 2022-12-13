package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By fName = By.id("firstname");
	By lName = By.id("lastname");
	By uName = By.id("userName");
	By pwd = By.id("password");
	By captcha = By.id("recaptcha-anchor");
	By registerButton = By.id("register");
	
	
	public void setFirstName(String firstName) {
		driver.findElement(fName).sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		driver.findElement(lName).sendKeys(lastName);
	}
	public void setUserName(String userName) {
		driver.findElement(uName).sendKeys(userName);
	}
	public void setPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void clickCaptcha() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		driver.findElement(captcha).click();
	}
	
	public void clickRegister() {
		driver.findElement(registerButton).click();
	}
	
	

}
