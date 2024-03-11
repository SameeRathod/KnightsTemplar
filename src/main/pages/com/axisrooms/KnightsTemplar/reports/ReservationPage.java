package com.axisrooms.KnightsTemplar.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class ReservationPage {

	@FindBy(xpath = "//form[@id='hotelDetail']//div[contains(@class,'col-sm-3')]//button[contains(@type,'button')]")
	private WebElement hotelDropdownButton;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]/li[normalize-space()='AR demo demo']")
	private WebElement selectHotelFromList;

	@FindBy(xpath = "//select[@name='filter_by']")
	private WebElement filterByDropdown;

	@FindBy(xpath = "//div[@class='input-group ']//input[@name='start_date']")
	private WebElement startDateTextField;

	@FindBy(xpath = "//div[@class='input-group ']//input[@name='end_date']")
	private WebElement endDateTextField;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-right uib-right']")
	private WebElement nextArrow;

	@FindBy(xpath = "//button[@class='btn btn-default btn-sm pull-left uib-left']")
	private WebElement priviousArrow;

	@FindBy(xpath = "//span[normalize-space()='12']")
	private WebElement selectDayFromTable;// dynamic

	@FindBy(xpath = "//button[@ng-click='downloadReservation()']")
	private WebElement downloadButton;

	public ReservationPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public ReservationPage getHotelDropdownButton() {
		ExplicitWaitFactory.click(hotelDropdownButton, WaitStrategy.CLICKABLE, " user clciked on hotelDropdownButton");

		return this;
	}

	public WebElement getSelectHotelFromList() {
		return selectHotelFromList;
	}

	public ReservationPage getFilterByDropdown(String enterTheValueOFFilter) {
		ExplicitWaitFactory.selectValueByVisibleText(downloadButton, WaitStrategy.VISIBLE, enterTheValueOFFilter,
				" user filterd By based on " + enterTheValueOFFilter);
		return this;
	}

	public ReservationPage getStartDateTextField() {
		ExplicitWaitFactory.click(startDateTextField, WaitStrategy.CLICKABLE,
				" user clciked on the start date text field");
		return this;
	}

	public ReservationPage getEndDateTextField() {
		ExplicitWaitFactory.click(endDateTextField, WaitStrategy.CLICKABLE, " user clciked on the end date text field");

		return this;
	}

	public WebElement getNextArrow() {
		return nextArrow;
	}

	public WebElement getPriviousArrow() {
		return priviousArrow;
	}

	public WebElement getSelectDayFromTable() {
		return selectDayFromTable;
	}

	public ReservationPage getDownloadButton() {
		ExplicitWaitFactory.click(downloadButton, WaitStrategy.CLICKABLE, " user clciked on download button");

		return this;
	}

}
