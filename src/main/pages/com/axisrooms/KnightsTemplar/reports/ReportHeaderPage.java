package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class ReportHeaderPage {
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[normalize-space()='Sales']")
	private WebElement selectValueFromHeader;//dynamic
	
	public ReportHeaderPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public ReportHeaderPage getSelectTabFromReportHeader(String selectTabForClick) {
		
		String selectValue=String.format("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[normalize-space()='%s']", selectTabForClick);
		WebElement element = selectValueFromHeader.findElement(By.xpath(selectValue));
		
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user clicked on the "+selectTabForClick);
		
		return this;
	}
}
