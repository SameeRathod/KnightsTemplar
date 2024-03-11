package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DailyPerformancePage {
	
	@FindBy(xpath = "//form[@id='optimizerReport']//button[contains(@type,'button')]")
	private WebElement  hotelsDrodpdown;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-form ng-scope']/li[normalize-space()='AR demo demo']")
	private WebElement listOfHotels;
	
	@FindBy(xpath = "//input[contains(@type,'month')]")
	private WebElement selectMonthField;
	
	@FindBy(xpath = "//div[@class='tab-pane ng-scope active']//button[@type='submit'][normalize-space()='Download']")
	private WebElement downloadButton;

}
