package com.axisrooms.KnightsTemplar.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.axisrooms.KnightsTemplar.basetest.BaseTest;
import com.axisrooms.KnightsTemplar.homePage.HomePage;
import com.axisrooms.KnightsTemplar.loginPage.LoginPage;
import com.axisrooms.KnightsTemplar.utils.AssertionUtility;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTest(Map<String,String>getData) {
		
		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
		.getLoginButton();
		
		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/team");
		AssertionUtility.assertElementTextEquals(new HomePage().kpiText, "Key Performance Indicators");
		
		new HomePage().getProfileDropdown().getLogOutButton();
		
		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/login");
		
		
		
		
		
		
	}

}
