package com.facebookRegistrationPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
	
	WebDriver driver;
	@Test
	
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Eman");
		driver.findElement(By.name("lastname")).sendKeys("Ra");
		driver.findElement(By.name("reg_email__")).sendKeys("Eman@Tep.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Eman@Tep.com");
		driver.findElement(By.id("password_step_input")).sendKeys("M416999$");
		
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText("Aug");
		
		Select dropdown1 = new Select(driver.findElement(By.id("day")));
		dropdown1.selectByVisibleText("8");
		
		Select dropdown2 = new Select(driver.findElement(By.id("year")));
		dropdown2.selectByVisibleText("1998");
		
		driver.findElement(By.xpath(".//input[@value='2']")).click();
		
		
		
		driver.findElement(By.name("websubmit")).click();


	}
	
	
}
