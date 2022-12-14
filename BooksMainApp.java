package pom.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksMainApp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("windows.chrome.driver", "C://WebDrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		FileInputStream fis = new FileInputStream("C:\\Eclipse\\PageObjectModel\\Test-Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("LoginData");
		XSSFRow row = sheet.getRow(1);
		
		
		String URL = "https://demoqa.com/books";
		driver.get(row.getCell(1).getStringCellValue());
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		DashBoardPage dashBoard = new DashBoardPage(driver);
		dashBoard.clickLogin();
		
		Thread.sleep(3000);
		LoginPage login = new LoginPage(driver);
		//login.clickNewUser();
		
		login.setUserName(row.getCell(2).getStringCellValue());
		login.setPassword(row.getCell(3).getStringCellValue());
		login.clickLogin();
		
		Thread.sleep(3000);
		
		/*
		 * RegisterPage register = new RegisterPage(driver);
		 * register.setFirstName("Padmini"); register.setLastName("Nayak");
		 * register.setUserName("Padmini"); register.setPassword("Selenium*123");
		 * register.clickCaptcha(); register.clickRegister();
		 */
		
		Thread.sleep(3000);
		System.out.println("Testing GIT");
		driver.quit();
	}

}
