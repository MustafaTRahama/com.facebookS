package com.facebookLoginTest;

import org.testng.annotations.Test;
import com.facebookLoginPage.LoginPageWithVariables;

public class LoginPageWithVariablesTest {
	@Test
	public void boundaryLoginTest() {
		LoginPageWithVariables lpv = new LoginPageWithVariables();
		lpv.openApp();
		lpv.getUserName("suarez");
		lpv.getPassword("pass1232");
		lpv.getLoginButton();
		
	}

}
