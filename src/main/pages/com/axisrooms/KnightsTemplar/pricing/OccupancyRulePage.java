package com.axisrooms.KnightsTemplar.pricing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class OccupancyRulePage {
	
	
	@FindBy(xpath = "//button[@class='btn btn-flat-primary btn-sm create-rule-btn create-occupancy']")
	private WebElement createRuleButton;
	
	
	public OccupancyRulePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	public WebElement getCreateRuleButton() {
		ExplicitWaitFactory.click(createRuleButton, WaitStrategy.CLICKABLE, " user clicked on the createRuleButton");
		return createRuleButton;
	}
	
	

}
