package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Plabani\\eclipse-workspace\\AutomationBasic\\src\\Driver\\driver1\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		BasePage page=new BasePage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.enterUsername("Admin");
		page.enterPassword("admin123");
		page.clickLogin();
	}

}
