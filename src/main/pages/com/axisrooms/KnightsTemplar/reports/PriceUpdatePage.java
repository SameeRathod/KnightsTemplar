package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class PriceUpdatePage {
	
	@FindBy(xpath = "//input[@class='form-control dp ng-isolate-scope ng-valid-date ng-touched ng-not-empty ng-dirty ng-valid ng-valid-required']")
	private WebElement startDateTextField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-right uib-right']")
	private WebElement nextArrowButton;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")
	private WebElement priviousArrowButton;
	
	@FindBy(xpath = "//span[normalize-space()='08']")
	private WebElement selectDateFromTable;//dynamic
	
	@FindBy(xpath = "//input[contains(@class,'form-control dp ng-isolate-scope ng-valid-date ng-not-empty ng-dirty ng-valid ng-valid-required ng-touched')]")
	private WebElement endDateTextField;
	
	@FindBy(xpath = "//select[@name='type']")
	private WebElement typrDropdown;
	
	@FindBy(xpath = "//select[@name='room']")
	private WebElement roomDropdown;
	
	@FindBy(xpath = "//button[@type='button'][normalize-space()='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//button[contains(@ng-click,'downloadPriceUpdate()')]")
	private WebElement downloadButton;
	
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
	private WebElement selectNoOfEntityShownInPage;
	
	@FindBy(xpath = "//label[normalize-space()='Search:']//input[@type='search']")
	private WebElement serachTextField;
	
	public PriceUpdatePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public WebElement getStartDateTextField() {
		ExplicitWaitFactory.click(startDateTextField, WaitStrategy.CLICKABLE, " user clciked on the start date text field");
		
		
		return startDateTextField;
	}

	public WebElement getNextArrowButton() {
		return nextArrowButton;
	}

	public WebElement getPriviousArrowButton() {
		return priviousArrowButton;
	}

	public WebElement getSelectDateFromTable() {
		return selectDateFromTable;
	}

	public PriceUpdatePage getEndDateTextField() {
		ExplicitWaitFactory.click(endDateTextField, WaitStrategy.CLICKABLE, " user clciked on the end date text field");

		return this;
	}

	public PriceUpdatePage getTyprDropdown(String selectByTypeText) {
		ExplicitWaitFactory.selectValueByVisibleText(typrDropdown, WaitStrategy.VISIBLE, selectByTypeText, " user select type value as "+selectByTypeText);
		return this;
	}

	public PriceUpdatePage getRoomDropdown(String selectRoomTypeByVisibleText) {
		ExplicitWaitFactory.selectValueByVisibleText(roomDropdown, WaitStrategy.VISIBLE, selectRoomTypeByVisibleText, " user selected riim type as "+selectRoomTypeByVisibleText);
		return this;
	}

	public WebElement getSubmitButton() {
		ExplicitWaitFactory.click(submitButton, WaitStrategy.CLICKABLE, " user clicked on the submit button");
		return submitButton;
	}

	public PriceUpdatePage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " user clicked on the download button");

		return this;
	}

	public PriceUpdatePage getSelectNoOfEntityShownInPage(String selectEntityFromVisibleText) {
		ExplicitWaitFactory.selectValueByVisibleText(selectNoOfEntityShownInPage, WaitStrategy.VISIBLE, selectEntityFromVisibleText, " user selected the no of entity as "+selectEntityFromVisibleText);
		return this;
	}

	public WebElement getSerachTextField(String serachForValue) {
		ExplicitWaitFactory.sendKeys(serachTextField, serachForValue, WaitStrategy.PRESENCE, " user searching for the value as "+serachForValue);
		return serachTextField;
	}
	
	
	
	

}
