package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class BAR_PickupPage {
	
	@FindBy(xpath = "//input[@name='stay_date']")
	private WebElement stayDateField;
	
	@FindBy(xpath = "//span")
	private WebElement selectDateFromTable;//dynamic
	
	@FindBy(xpath = "//button[normalize-space()='Load Data']")
	private WebElement loadDataButton;
	
	public BAR_PickupPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public BAR_PickupPage getStayDateField() {
		ExplicitWaitFactory.click(stayDateField, WaitStrategy.CLICKABLE, " user clicked on the stay date text field ");
		return this;
	}

	public BAR_PickupPage getSelectDateFromTable(String enterTheDateValyeInDD_Format) {
		String format = String.format("//span[normalize-space()='%s']", enterTheDateValyeInDD_Format);
		WebElement element = selectDateFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user selected day as "+enterTheDateValyeInDD_Format);
		return this;
	}

	public BAR_PickupPage getLoadDataButton() {
		ExplicitWaitFactory.click(loadDataButton, WaitStrategy.CLICKABLE, " user clciked on the loadDataButton ");
		return this;
	}
	
	
}
