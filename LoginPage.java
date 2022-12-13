package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By newUser = By.id("newUser");
	
	By uName = By.id("userName");
	By pwd = By.id("password");
	By login = By.id("login");
	
	public void clickNewUser() {
		driver.findElement(newUser).click();
	}
	
	public void setUserName(String userName) {
		driver.findElement(uName).sendKeys(userName);
	}
	
	public void setPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
}
