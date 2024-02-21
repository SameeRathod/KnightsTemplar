package com.axisrooms.KnightsTemplar.pricing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class PromotionRulePage {
	
	@FindBy(xpath = "//button[@class='btn btn-flat-primary btn-sm create-rule-btn create-promotion']")
	private WebElement createPromotionRulePage;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/a[1]")
	private WebElement selectAllRoomTypes;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/a[2]")
	private WebElement clearAllRoomType;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/fieldset[1]/div/label[normalize-space()='Deluxe Room']")
	private WebElement selectRoom;//dynamic
	
	@FindBy(xpath = "//div[@class='verticalslider competition-rule ng-scope']/span/div/div/input")
	private WebElement enterValueInDiscountTextField;
	

	
	public PromotionRulePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	public PromotionRulePage getCreatePromotionRulePage() {
		ExplicitWaitFactory.click(createPromotionRulePage, WaitStrategy.CLICKABLE, " user click on create rule button");
		return this;
	}


	public PromotionRulePage getSelectAllRoomTypes() {
		ExplicitWaitFactory.click(selectAllRoomTypes, WaitStrategy.CLICKABLE, " user click on selectAllRoomTypes button");

		return this;
	}



	public PromotionRulePage getClearAllRoomType() {
		ExplicitWaitFactory.click(clearAllRoomType, WaitStrategy.CLICKABLE, " user click on clearAllRoomType button");

		return this;
	}


	public WebElement getSelectRoom() {
		return selectRoom;
	}
	
	public PromotionRulePage getEnterValueInDiscountTextField(String enterDiscount) {
		ExplicitWaitFactory.sendKeys(enterValueInDiscountTextField, enterDiscount, WaitStrategy.CLICKABLE, " user enter value in the discount text field");
		return this;

		
	}


	

}
