package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class BudgetPage {
	
	@FindBy(xpath = "//select[@class='dropdown-toggle btn-large form-control ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement selectViewForYear;
	
	@FindBy(xpath = "//button[@ng-click='downloadBudgetingReport()']")
	private WebElement downloadButton;
	
	public BudgetPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public BudgetPage getSelectViewForYear(String selectVisibleFromDropdown) {
		ExplicitWaitFactory.selectValueByVisibleText(selectViewForYear,WaitStrategy.VISIBLE, selectVisibleFromDropdown, " user select value from dropdown");
		return this;
	}

	public WebElement getDownloadButton() {
		return downloadButton;
	}
	
	

}
