package com.axisrooms.KnightsTemplar.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.axisrooms.KnightsTemplar.basetest.BaseTest;
import com.axisrooms.KnightsTemplar.homePage.HomePage;
import com.axisrooms.KnightsTemplar.loginPage.LoginPage;
import com.axisrooms.KnightsTemplar.utils.AssertionUtility;

public class TeamSummaryTest extends BaseTest {

	@Test
	public void teamSummaryTest(Map<String, String> getData) throws InterruptedException {

		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
				.getLoginButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/team");

		new HomePage().getCalenderWidgetIcon("2023", "Dec");

		AssertionUtility.assertElementTextEquals(new HomePage().kpiText, "Key Performance Indicators");

		new HomePage().getProfileDropdown().getLogOutButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/login");

		Thread.sleep(3000);

	}

	@Test
	public void teamTrackerTest(Map<String, String> getData) throws InterruptedException {

		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
				.getLoginButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/team");

		new HomePage().getCalenderWidgetIcon("2023", "Dec");

		AssertionUtility.assertElementTextEquals(new HomePage().kpiText, "Key Performance Indicators");

		new HomePage().getTeamName("Prathap");

		AssertionUtility.assertElementTextEquals(new HomePage().getNavigateToDashbordPageText,
				"Click on any hotel to navigate to its Dashboard");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/home");

		new HomePage().getProfileDropdown().getLogOutButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/login");

		Thread.sleep(3000);

	}

	@Test
	public void teamMemberTest(Map<String, String> getData) throws InterruptedException {

		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
				.getLoginButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/team");

		new HomePage().getCalenderWidgetIcon("2023", "Dec");

		AssertionUtility.assertElementTextEquals(new HomePage().kpiText, "Key Performance Indicators");

		new HomePage().getTeamMembers("Karthik");

		AssertionUtility.assertElementTextEquals(new HomePage().getNavigateToDashbordPageText,
				"Click on any hotel to navigate to its Dashboard");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/home");

		new HomePage().getProfileDropdown().getLogOutButton();

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/login");
		Thread.sleep(3000);

	}

}
