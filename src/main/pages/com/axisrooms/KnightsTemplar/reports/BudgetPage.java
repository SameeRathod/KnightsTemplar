package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;
import com.axisrooms.KnightsTemplar.utils.SelectClassUtils;

public class BudgetPage {
	
	@FindBy(xpath = "//select[@class='dropdown-toggle btn-large form-control ng-pristine ng-valid ng-not-empty ng-touched']")
	private WebElement selectViewForYear;
	
	
	@FindBy(xpath = "//button[@ng-click='downloadBudgetingReport()']")
	private WebElement downloadButton;
	
	public BudgetPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public BudgetPage viewForDropdown() throws InterruptedException {
		ExplicitWaitFactory.click(selectViewForYear, WaitStrategy.CLICKABLE, " user clicked on the ");
		return this;
	}

	public BudgetPage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " User clicked on the Budget Page");
		return this;
	}
	
	

}
