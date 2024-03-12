package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class PriceUpdatePage {
	
	@FindBy(xpath = "//div[@class='form-group']//div//input[@name='startDate']")
	private WebElement startDateTextField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-right uib-right']")
	private WebElement nextArrowButton;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")
	private WebElement priviousArrowButton;
	
	@FindBy(xpath = "//span")
	private WebElement selectDateFromTable;//dynamic
	
	@FindBy(xpath = "//input[contains(@class,'form-control dp ng-isolate-scope ng-valid-date ng-not-empty ng-dirty ng-valid ng-valid-required ng-touched')]")
	private WebElement endDateTextField;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	private WebElement typeDropdown;
	
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

	public PriceUpdatePage getStartDateTextField() {
		ExplicitWaitFactory.click(startDateTextField, WaitStrategy.CLICKABLE, " user clciked on the start date text field");
		
		
		return this;
	}

	public WebElement getNextArrowButton() {
		return nextArrowButton;
	}

	public WebElement getPriviousArrowButton() {
		return priviousArrowButton;
	}

	public PriceUpdatePage getSelectDateFromTable(String selectDate) throws InterruptedException {
		String format = String.format("//span[normalize-space()='%s']", selectDate);
		WebElement element = selectDateFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user selected date as "+selectDate);
		Thread.sleep(3000);
		return this;
	}

	public PriceUpdatePage getEndDateTextField() {
		ExplicitWaitFactory.click(endDateTextField, WaitStrategy.CLICKABLE, " user clciked on the end date text field");

		return this;
	}

	public PriceUpdatePage getTyprDropdown() {
		ExplicitWaitFactory.click(typeDropdown, WaitStrategy.CLICKABLE, " user clciked on the type dropdown");
		return this;
	}

	public PriceUpdatePage getRoomDropdown(String selectRoomTypeByVisibleText) {
		ExplicitWaitFactory.selectValueByVisibleText(roomDropdown, WaitStrategy.VISIBLE, selectRoomTypeByVisibleText, " user selected riim type as "+selectRoomTypeByVisibleText);
		return this;
	}

	public PriceUpdatePage getSubmitButton() {
		ExplicitWaitFactory.click(submitButton, WaitStrategy.CLICKABLE, " user clicked on the submit button");
		return this;
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
