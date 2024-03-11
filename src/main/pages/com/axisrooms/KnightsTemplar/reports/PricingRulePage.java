package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class PricingRulePage {
	
	@FindBy(xpath = "//div[@class='tab-pane ng-scope active']//button[@type='submit'][normalize-space()='Download']")
	private WebElement downloadButton;
	
	
	public PricingRulePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	public PricingRulePage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " user clciked on the download button ");
		return this;
	}


	
	
	

}
