package com.axisrooms.KnightsTemplar.demandInsights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class TravelerSearchTrendPaage {
	
	
	@FindBy(xpath = "//a[normalize-space()='Traveler Search Trend']")
	private WebElement travelerSearchTrendTab;
	
	@FindBy(xpath = "//div[@class='metrics col-md-12 monthsummary ng-scope']/div[2]/div")
	public WebElement travelerSearchTrendText;
	
	public TravelerSearchTrendPaage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public void getTravelerSearchTrendTab() {
		ExplicitWaitFactory.click(travelerSearchTrendTab, WaitStrategy.CLICKABLE, " user clicked on the travelerSearchTrendTab");
	}

}
