package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;

public class SalesPage {
	
	@FindBy(xpath = "//input[@class='form-control flat-cal-date-picker date ng-valid ng-isolate-scope ng-not-empty ng-valid-date ng-touched ng-dirty']")
	private WebElement fromMonthTextField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-right uib-right']")
	private WebElement nextYearArrow;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")
	private WebElement priviousYearArrow;
	
	@FindBy(xpath = "//span[@class='ng-binding'][normalize-space()='May']")
	private WebElement selectMonthFromTable; //dynamic
	
	@FindBy(xpath = "//input[contains(@class,'form-control flat-cal-date-picker date ng-valid ng-isolate-scope ng-not-empty ng-valid-date ng-dirty ng-touched')]")
	private WebElement toMonthTextField;
	
	@FindBy(xpath = "//select[@class='btn dropdown-toggle btn-large form-control btn-head ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement selectStatus;
	
	@FindBy(xpath = "//a[@class='btn btn-flat-success apply-btns']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/span[1]/i")
	private WebElement lastYearToggleKey;
	
	@FindBy(xpath = "//button[contains(@ng-click,'downloadSales()')]")
	private WebElement downloadButton;
	
	@FindBy (xpath = "//div[@class='rm-data-group-title large col-md-5 calculation']/md-radio-group/md-radio-button/div[2][normalize-space()='Hotel Level']")
	private WebElement selectRatePlaceBreakupBasedOn;//dynamic
	
	public SalesPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public WebElement getFromMonthTextField() {
		return fromMonthTextField;
	}

	public WebElement getNextYearArrow() {
		return nextYearArrow;
	}

	public WebElement getPriviousYearArrow() {
		return priviousYearArrow;
	}

	public WebElement getSelectMonthFromTable() {
		return selectMonthFromTable;
	}

	public WebElement getToMonthTextField() {
		return toMonthTextField;
	}

	public WebElement getSelectStatus() {
		return selectStatus;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getLastYearToggleKey() {
		return lastYearToggleKey;
	}

	public WebElement getDownloadButton() {
		return downloadButton;
	}

	public WebElement getSelectRatePlaceBreakupBasedOn() {
		return selectRatePlaceBreakupBasedOn;
	}
	
	
	
	

}
