package com.axisrooms.KnightsTemplar.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.axisrooms.KnightsTemplar.basetest.BaseTest;
import com.axisrooms.KnightsTemplar.homePage.HomePage;
import com.axisrooms.KnightsTemplar.loginPage.LoginPage;
import com.axisrooms.KnightsTemplar.utils.AssertionUtility;

public class ChainSummaryTest extends BaseTest {

	@Test
	public void chainSummaryTest(Map<String, String> getData) throws InterruptedException {

		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
				.getLoginButton();

		
		new HomePage().getChainSummaryTab();
		
		AssertionUtility.assertElementTextEquals(new HomePage().getNavigateToDashbordPageText,
				"Click on any hotel to navigate to its Dashboard");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/home");

		new HomePage().getProfileDropdown().getLogOutButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/login");

		Thread.sleep(3000);

	}

}
