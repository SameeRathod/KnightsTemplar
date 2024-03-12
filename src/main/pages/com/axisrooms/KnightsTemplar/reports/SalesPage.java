package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class SalesPage {
	
	@FindBy(xpath = "//span[normalize-space()='From']/../input")
	private WebElement fromMonthTextField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-right uib-right']")
	private WebElement nextYearArrow;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")
	private WebElement priviousYearArrow;
	
	@FindBy(xpath = "//ul")
	private WebElement selectMonthFromTable; //dynamic
	
	
	@FindBy(xpath = "//span[normalize-space()='To']/../input")
	private WebElement toMonthTextField;
	
	@FindBy(xpath = "//ul")
	private WebElement selectMonthTOTable; //dynamic
	
	@FindBy(xpath = "//select[@class='btn dropdown-toggle btn-large form-control btn-head ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement selectStatus;
	
	@FindBy(xpath = "//a[@class='btn btn-flat-success apply-btns']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/span[1]/i")
	private WebElement lastYearToggleKey;
	
	@FindBy(xpath = "//button[contains(@ng-click,'downloadSales()')]")
	private WebElement downloadButton;
	
	@FindBy (xpath = "//div")
	private WebElement selectRatePlaceBreakupBasedOn;//dynamic
	
	public SalesPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public SalesPage getFromMonthTextField() {
		ExplicitWaitFactory.click(fromMonthTextField, WaitStrategy.CLICKABLE, " user clicked on the from month field");
		return this;
	}

	public WebElement getNextYearArrow() {
		return nextYearArrow;
	}

	public WebElement getPriviousYearArrow() {
		return priviousYearArrow;
	}

	public SalesPage getSelectMonthFromTable(String selectMonth) throws InterruptedException {
		String format = String.format("//ul[@role='button']/li/div/table/tbody/tr/td[normalize-space()='%s']", selectMonth);
		WebElement element = selectMonthFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user select month as "+selectMonth);
		Thread.sleep(3000);
		return this;
	}
	public SalesPage getSelectMonthToTable(String selectMonth) throws InterruptedException {
		Thread.sleep(3000);
		String format = String.format("//ul[@role='button']/li/div/table/tbody/tr/td[normalize-space()='%s']", selectMonth);
		WebElement element = selectMonthTOTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user select month as "+selectMonth);
		return this;
	}


	public SalesPage getToMonthTextField() throws InterruptedException {
		Thread.sleep(3000);
		ExplicitWaitFactory.click(toMonthTextField, WaitStrategy.CLICKABLE, " user clicked on the to month field");
		Thread.sleep(3000);
		return this;
	}

	public SalesPage getSelectStatus(String enterStatus) {
		ExplicitWaitFactory.selectValueByVisibleText(selectStatus, WaitStrategy.VISIBLE, enterStatus, " user select Staus as "+enterStatus);
		return this;
	}

	public SalesPage getSubmitButton() {
		ExplicitWaitFactory.click(submitButton, WaitStrategy.CLICKABLE, " user clicked on submit button");

		return this;
	}

	public SalesPage getLastYearToggleKey() {
		ExplicitWaitFactory.click(lastYearToggleKey, WaitStrategy.CLICKABLE, " user clicked on lastYearToggleKey ");

		return this;
	}

	public SalesPage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " user clicked on downloadButton ");

		return this;
	}

	public SalesPage getSelectRatePlaceBreakupBasedOn(String ratePlan) {
		String format = String.format("//div[@class='rm-data-group-title large col-md-5 calculation']/md-radio-group/md-radio-button/div[2][normalize-space()='%s']", ratePlan);
		WebElement element = selectMonthFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user select rate plan based on as  "+ratePlan);
		return this;
	}
	
	
	
	

}
