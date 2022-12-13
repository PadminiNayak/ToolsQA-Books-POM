package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By login = By.id("login");
	
	public void clickLogin() {
		driver.findElement(login).click();
	}

}
