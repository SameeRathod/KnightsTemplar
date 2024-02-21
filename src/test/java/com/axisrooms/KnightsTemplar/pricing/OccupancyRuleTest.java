package com.axisrooms.KnightsTemplar.pricing;

import java.util.Map;

import org.testng.annotations.Test;

import com.axisrooms.KnightsTemplar.basetest.BaseTest;
import com.axisrooms.KnightsTemplar.header.HeaderPage;
import com.axisrooms.KnightsTemplar.homePage.ChainSummaryPage;
import com.axisrooms.KnightsTemplar.homePage.HomePage;
import com.axisrooms.KnightsTemplar.loginPage.LoginPage;
import com.axisrooms.KnightsTemplar.utils.AssertionUtility;

public class OccupancyRuleTest extends BaseTest {

	
	@Test
	public void createOccupancyRule(Map<String, String> getData) throws InterruptedException {
		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
				.getLoginButton();

		new HomePage().getChainSummaryTab();

		AssertionUtility.assertElementTextEquals(new HomePage().getNavigateToDashbordPageText,
				"Click on any hotel to navigate to its Dashboard");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/home");

		new ChainSummaryPage().getSelectPropertyFromTable("AR Demo Hotel");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/dashboard");

		new HeaderPage().getPricingTab();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/rules/view");

		new PricingRulePage().getOccupancyRuleButton().getCreateRuleButton();

		Thread.sleep(3000);
	}

}
