package com.axisrooms.KnightsTemplar.reports;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class OptimizerPage {

	@FindBy(xpath = "//md-icon[contains(@aria-label,'date_range')]")
	private WebElement monthWidget;

	@FindBy(xpath = "//div[@class='tab-pane ng-scope active']//button[@type='submit'][normalize-space()='Download']")
	private WebElement downloadButton;

	@FindBy(xpath = "//div[@class='dropdown-menu month_dropdown']/div/div[2]/span")
	private List<WebElement> selectMonthFromTable; // dynamic

	@FindBy(xpath = "//span[@role='button']//i[@class='fa fa-chevron-right']")
	private WebElement nextYearArrow;

	@FindBy(xpath = "//span[contains(@role,'button')]//i[contains(@class,'fa fa-chevron-left')]")
	private WebElement previousYearArrow;

	public OptimizerPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public OptimizerPage getMonthWidget() {
		ExplicitWaitFactory.click(monthWidget, WaitStrategy.CLICKABLE, " user clicke on the monthWidget ");
		return this;
	}

	public OptimizerPage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " user clicke don the download button ");
		return this;
	}

	public OptimizerPage getSelectMonthFromTable() {
		for (int i=1; i<selectMonthFromTable.size(); i++) {

			if (selectMonthFromTable.get(i).isEnabled()) {

				ExplicitWaitFactory.click(selectMonthFromTable.get(i), WaitStrategy.CLICKABLE, " user clcike don the month tab");

			}
		}

		return this;

	}

	public WebElement getNextYearArrow() {
		return nextYearArrow;
	}

	public WebElement getPreviousYearArrow() {
		return previousYearArrow;
	}

}
