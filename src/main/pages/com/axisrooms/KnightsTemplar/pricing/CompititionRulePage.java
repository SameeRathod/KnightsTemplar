package com.axisrooms.KnightsTemplar.pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class CompititionRulePage {

	@FindBy(xpath = "//button[@class='btn btn-flat-primary btn-sm create-rule-btn create-competition']")
	private WebElement createCompetitonRuleButton;

	@FindBy(xpath = "//button[@class='btn btn-flat-danger btn-sm remove-auto-rules-btn']")
	private WebElement deleteCompetitonRuleButton;

	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement confirmButtonFromPopup;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancelButtonFromPopup;

	@FindBy(xpath = "//div[@class='ngdialog-close']")
	private WebElement closeIconFromPopup;

	@FindBy(xpath = "//button[@class='btn btn-flat-primary toggle-sidebar-right btn-sm']")
	private WebElement hamburgerButton;

	@FindBy(xpath = "//span[normalize-space()='Active']")
	private WebElement activeTab;

	@FindBy(xpath = "//span[normalize-space()='Inactive']")
	private WebElement inactiveTab;

	@FindBy(xpath = "//span")
	private WebElement verifyRulePresentInActiveTab;// dynamic

	@FindBy(xpath = "//span")
	private WebElement deactiveRuleButton;// dynamic

	@FindBy(xpath = "//span")
	private WebElement deleteRuleButtonFromActiveTab;// dynamic

	@FindBy(xpath = "//span")
	private WebElement verifyRulePresentInInactiveTab;// dynamic

	@FindBy(xpath = "//span")
	private WebElement deleteRuleFromInactiveTab;// dynamic

	@FindBy(xpath = "//span")
	private WebElement activeRuleButton;// dynamic

	public CompititionRulePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public CompititionRulePage getCreateCompetitonRuleButton() {
		ExplicitWaitFactory.click(createCompetitonRuleButton, WaitStrategy.CLICKABLE,
				" user clciked on the createCompetitonRuleButton");
		return this;
	}

	public CompititionRulePage getDeleteCompetitonRuleButton() {
		ExplicitWaitFactory.click(deleteCompetitonRuleButton, WaitStrategy.CLICKABLE,
				" user clciked on the deleteCompetitonRuleButton");

		return this;
	}

	public CompititionRulePage getHamburgerButton() {
		ExplicitWaitFactory.click(hamburgerButton, WaitStrategy.CLICKABLE, " user clciked on the hamburgerButton");

		return this;
	}

	public CompititionRulePage getActiveTab() {
		ExplicitWaitFactory.click(activeTab, WaitStrategy.CLICKABLE, " user clciked on the activeTab");

		return this;
	}

	public CompititionRulePage getInactiveTab() {
		ExplicitWaitFactory.click(inactiveTab, WaitStrategy.CLICKABLE, " user clciked on the inactiveTab");

		return this;
	}

	public CompititionRulePage getDeactiveRuleButton(String ruleName) {
		String format = String.format(
				"//span[normalize-space()='Active']/../following-sibling::ul[1]/li/div/div[normalize-space()='%s']/following-sibling::div/div[3]/span[1]/i",
				ruleName);
		WebElement element = deactiveRuleButton.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE,
				" user click on toggel key to deactivate rule --> " + ruleName);
		return this;
	}

	public CompititionRulePage getDeleteRuleButtonFromActiveTab(String ruleName) {
		String format = String.format(
				"//span[normalize-space()='Active']/../following-sibling::ul[1]/li/div/div[normalize-space()='%s']/following-sibling::div/div[3]/span[2]/i",
				ruleName);
		WebElement element = deleteRuleButtonFromActiveTab.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE,
				" user click on delete rule button for rule name --> " + ruleName);
		return this;
	}

	public CompititionRulePage getDeleteRuleFromInactiveTab(String ruleName) {
		String format = String.format(
				"//span[normalize-space()='Inactive']/../following-sibling::ul[2]/li/div/div[normalize-space()='%s']/following-sibling::div/div[3]/span[2]/i",
				ruleName);
		WebElement element = deleteRuleFromInactiveTab.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE,
				" user click on delete rule button for rule name --> " + ruleName);
		return this;
	}

	public CompititionRulePage getActiveRuleButton(String ruleName) {
		String format = String.format(
				"//span[normalize-space()='Inactive']/../following-sibling::ul[2]/li/div/div[normalize-space()='%s']/following-sibling::div/div[3]/span[1]/i",
				ruleName);
		WebElement element = activeRuleButton.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE,
				" user click on toggel key to Active rule --> " + ruleName);
		return this;
	}

	public CompititionRulePage getVerifyRulePresentInActiveTab(String ruleName) {
		String format = String.format(
				"//span[normalize-space()='Active']/../following-sibling::ul[1]/li/div/div[normalize-space()='%s']",
				ruleName);
		WebElement element = verifyRulePresentInActiveTab.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE,
				" user click on toggel key to deactivate rule --> " + ruleName);
		return this;
	}

	public CompititionRulePage getVerifyRulePresentInInactiveTab(String ruleName) {
		String format = String.format(
				"//span[normalize-space()='Inactive']/../following-sibling::ul[2]/li/div/div[normalize-space()='%s']",
				ruleName);
		WebElement element = verifyRulePresentInInactiveTab.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE,
				" user click on toggel key to deactivate rule --> " + ruleName);
		return this;
	}

	public WebElement getConfirmButtonFromPopup() {
		ExplicitWaitFactory.click(confirmButtonFromPopup, WaitStrategy.CLICKABLE,
				" user clicked on the confirmButtonFromPopup");
		return confirmButtonFromPopup;
	}

	public WebElement getCancelButtonFromPopup() {
		ExplicitWaitFactory.click(cancelButtonFromPopup, WaitStrategy.CLICKABLE,
				" user clicked on the cancelButtonFromPopup");
		return cancelButtonFromPopup;
	}

	public WebElement getCloseIconFromPopup() {
		ExplicitWaitFactory.click(closeIconFromPopup, WaitStrategy.CLICKABLE,
				" user clicked on the closeIconFromPopup");
		return closeIconFromPopup;
	}

}
