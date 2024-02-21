package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {
	
	@FindBy(xpath = "//input[@class='form-control flat-cal-date-picker date ng-pristine ng-valid ng-isolate-scope ng-not-empty ng-valid-required ng-valid-date ng-touched']")
	private WebElement startDateTextField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-right uib-right']")
	private WebElement nextMonthArrowButton;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-chevron-left']")
	private WebElement priviousMonthArrowButton;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-chevron-left']/../../../th[2]/button")
	private WebElement monthAndYearText;
	
	@FindBy(xpath = "//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li/div/table/tbody/tr/td/button[normalize-space()='05']")
	private WebElement selectdayFromTable;//dynamic
	
	@FindBy(xpath = "//div[@class='input-group']//input[@name='end_date']")
	private WebElement endDateTextField;
	
	@FindBy(xpath = "//div[@class='multiselect-parent btn-group dropdown-multiselect open']//button[@type='button']")
	private WebElement selectSegementDropdown;
	
	@FindBy(xpath = "//div[@class='multiselect-parent btn-group dropdown-multiselect open']//button[@type='button']/../../ul/li/a[normalize-space()='Check All']")
	private WebElement selectSegment;//dynamic
	
	//user is not able to select segment dropdown value
	
	
	

}
