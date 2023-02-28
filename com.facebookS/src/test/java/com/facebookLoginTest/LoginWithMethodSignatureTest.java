package com.facebookLoginTest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebookLoginPage.LoginPageMethodSignature;

public class LoginWithMethodSignatureTest {

	public WebDriver driver;

	@Test

	public void validLoginTest() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();
		lpms.openApp();
		lpms.getUserName("S1");
		lpms.getPassword("yuh");
		lpms.getLogin();

	}

	@Test

	public void validLoginTest1() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();
		lpms.openApp();		
		lpms.getUserName("Sss");
		lpms.getPassword("yuh");
		lpms.getLogin();
	}
}
