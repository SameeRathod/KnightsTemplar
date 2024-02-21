package com.axisrooms.KnightsTemplar.pricing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class PricingRulePage {

	@FindBy(xpath = "//label[@class='btn btn-default occu-tab']")
	private WebElement occupancyRuleButton;

	@FindBy(xpath = "//span[@class='promo-legend']")
	private WebElement promotionRuleButton;

	@FindBy(xpath = "//span[@class='comp-legend']")
	private WebElement competitionRuleButton;
	
	public PricingRulePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public OccupancyRulePage getOccupancyRuleButton() {
		ExplicitWaitFactory.click(occupancyRuleButton, WaitStrategy.CLICKABLE, " userd clicked on the occupancyRuleButton ");
		return new OccupancyRulePage();
	}

	

	public PromotionRulePage getPromotionRuleButton() {
		ExplicitWaitFactory.click(promotionRuleButton, WaitStrategy.CLICKABLE, " userd clicked on the promotionRuleButton ");

		return new PromotionRulePage();
	}


	public PricingRulePage getCompetitionRuleButton() {
		ExplicitWaitFactory.click(competitionRuleButton, WaitStrategy.CLICKABLE, " userd clicked on the competitionRuleButton ");

		return this;
	}

	
	
	

}
