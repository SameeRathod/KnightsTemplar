package com.axisrooms.KnightsTemplar.report;

import java.util.Map;

import org.testng.annotations.Test;

import com.axisrooms.KnightsTemplar.basetest.BaseTest;
import com.axisrooms.KnightsTemplar.header.HeaderPage;
import com.axisrooms.KnightsTemplar.homePage.ChainSummaryPage;
import com.axisrooms.KnightsTemplar.homePage.HomePage;
import com.axisrooms.KnightsTemplar.loginPage.LoginPage;
import com.axisrooms.KnightsTemplar.reports.PacePage;
import com.axisrooms.KnightsTemplar.reports.ReportHeaderPage;
import com.axisrooms.KnightsTemplar.utils.AssertionUtility;

public class PaceTest extends BaseTest {

	private PaceTest() {

	}

@Test
	public void paceTest(Map<String, String> getData) throws InterruptedException {
		new LoginPage().getEmailTextField(getData.get("UserName")).getPasswordTextField(getData.get("Password"))
				.getLoginButton();

		new HomePage().getChainSummaryTab();

		AssertionUtility.assertElementTextEquals(new HomePage().getNavigateToDashbordPageText,
				"Click on any hotel to navigate to its Dashboard");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/home");

		new ChainSummaryPage().getSelectPropertyFromTable("AR Demo Hotel");

		AssertionUtility.assertCurrentUrlEquals("https://rm.axisrooms.com/#/dashboard");

		new HeaderPage().getReportsTab();

		AssertionUtility.assertCurrentUrlContains("https://rm.axisrooms.com/#/report");

		new ReportHeaderPage().getSelectTabFromReportHeader("Pace");
		
		new PacePage().getSelectNoOfDaysForReservationWindow("60").getLastYearToggleKey().getDownloadButton();

		Thread.sleep(3000);

	}
}
