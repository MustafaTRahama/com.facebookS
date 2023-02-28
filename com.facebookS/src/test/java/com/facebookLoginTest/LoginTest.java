package com.facebookLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebookLoginPage.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public WebDriver driver;
	@BeforeTest
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // open browser
		driver.get("https://www.facebook.com/"); // open application/website
		
		driver.manage().window().maximize();
	

}
	@Test
     public void validLoginTest1() {
		LoginPage Ip = new LoginPage();
		Ip.openApp();
		Ip.getUserName();
		Ip.getpassword();
		Ip.getlogin();
		
	}
	@Test
	public void validLoginTest2() {
		LoginPage Ip = new LoginPage();
		Ip.openApp();
		Ip.getUserName();
		Ip.getpassword();
		Ip.getlogin();
		
	}
	@Test
	public void validLoginTest3() {
		
	}
	@Test
	public void validLoginTest4() {
		
	}
	@AfterTest
	public void closeApplication() {
		driver.quit();
		
	}
}
