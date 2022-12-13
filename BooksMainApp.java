package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksMainApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/books";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		DashBoardPage dashBoard = new DashBoardPage(driver);
		dashBoard.clickLogin();
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage(driver);
		//login.clickNewUser();
		
		login.setUserName("Padmini");
		login.setPassword("Selenium*123");
		login.clickLogin();
		
		Thread.sleep(3000);
		
		/*
		 * RegisterPage register = new RegisterPage(driver);
		 * register.setFirstName("Padmini"); register.setLastName("Nayak");
		 * register.setUserName("Padmini"); register.setPassword("Selenium*123");
		 * register.clickCaptcha(); register.clickRegister();
		 */
		
		Thread.sleep(3000);
		driver.quit();
	}

}
