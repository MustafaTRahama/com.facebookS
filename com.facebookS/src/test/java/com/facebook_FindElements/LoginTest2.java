package com.facebook_FindElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest2 {
	
	WebDriver driver;
	@BeforeTest
	public void openApp() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // open browser
		driver.get("https://www.facebook.com/"); // open application/website
		
		driver.manage().window().maximize();
	

}
	@Test
	
	public void validLoginTest() {
		System.out.println("This is an validLogin test");
		invalidLoginTest();
		
	
		
	}
	public void invalidLoginTest() {
		System.out.println("This is an invalidLogin test");
		
	}
}
