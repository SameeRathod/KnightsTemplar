package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class BudgetPage {
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	private WebElement selectViewForYear;
	
	@FindBy(xpath = "//body")
	private WebElement selectValueFromDropdown;//dynamic
	
	@FindBy(xpath = "//button[@ng-click='downloadBudgetingReport()']")
	private WebElement downloadButton;
	
	public BudgetPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public BudgetPage viewForDropdown(String selectValue) throws InterruptedException {
		ExplicitWaitFactory.click(selectViewForYear, WaitStrategy.CLICKABLE, " user clicked on the ");
		String format = String.format("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]/option[normalize-space()='%s']",selectValue );
		WebElement element = selectValueFromDropdown.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user clicked on the  "+selectValue);

		return this;
	}

	public BudgetPage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " User clicked on the Budget Page");
		return this;
	}
	
	

}
