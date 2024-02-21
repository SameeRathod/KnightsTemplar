package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;

public class PacePage {
	
	@FindBy(xpath = "//select[@class='btn dropdown-toggle btn-large form-control ng-pristine ng-untouched ng-valid ng-not-empty']")
	private WebElement selectNoOfDaysForReservationWindow;
	
	@FindBy(xpath = "//div[@class='rm-comparatives clearfix col-md-6']/div/div/span/i")
	private WebElement lastYearToggleKey;
	
	@FindBy(xpath = "//button[contains(@ng-click,'downloadPaceReport()')]")
	private WebElement downloadButton;
	
	public PacePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

}
