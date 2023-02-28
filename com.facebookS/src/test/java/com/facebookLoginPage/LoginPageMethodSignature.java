package com.facebookLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageMethodSignature {
	public WebDriver driver;
	
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public WebElement getUserName(String enterUserName) {
		driver.findElement(By.id("email")).sendKeys(enterUserName);
		return null;

	}

	public WebElement getPassword(String enterPassword) {
		driver.findElement(By.id("pass")).sendKeys(enterPassword);
		return null;

	}

	public WebElement getLogin() {
		driver.findElement(By.id("login")).click();
		return null;

	}

	
	
}
