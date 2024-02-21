package com.axisrooms.KnightsTemplar.pricing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class CreateCompetitionRulePage {
	
	@FindBy(xpath = "//input[@name='ruleName']")
	private WebElement ruleNameTextFIeld;
	
	@FindBy(xpath = "//label[normalize-space()='Date Range']")
	private WebElement dateRangeCheckBox;
	//===================================================================================================
	@FindBy(xpath = "//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li[1]/div/table/thead/tr[1]/th[1]/button")
	private WebElement priviousArrowButton;
	
	@FindBy(xpath = "//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li[1]/div/table/thead/tr[1]/th[3]/button")
	private WebElement nextArrowButton;
	
	@FindBy(xpath = "//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li[1]/div/table/thead/tr[1]/th[2]/button/strong")
	private WebElement monthAndYearText;
	
	@FindBy(xpath = "//ul")
	private WebElement selectDateFromTable; //dynamic
	
	@FindBy(xpath = "//button[normalize-space()='Today']")
	private WebElement todayButton;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	private WebElement clearButton;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//input[@name='startDate']")
	private WebElement startDateTextField;
	
	@FindBy(xpath = "//input[@name='endDate']")
	private WebElement endDateTExtField;
	//=====================================================================================================
	@FindBy(xpath = "//label[normalize-space()='Specific Dates']")
	private WebElement specificDateCheckBox;
	
	@FindBy(xpath = "//span[@ng-if='!set.multiple_date_popup']//i[@class='fa fa-plus']")
	private WebElement addDateButton;
	
	@FindBy(xpath = "//table[@class='uib-daypicker']/thead/tr[1]/th[1]")
	private WebElement priviousMonthArrowForAddButtonDate;
	
	@FindBy(xpath = "//table[@class='uib-daypicker']/thead/tr[1]/th[3]")
	private WebElement nextMonthArrowForAddButtonDate;
	
	@FindBy(xpath = "//table[@class='uib-daypicker']/thead/tr[1]/th[2]/button/strong")
	private WebElement monthandYearTextForAddButtonDate;
	
	@FindBy(xpath = "//table[@class='uib-daypicker']/tbody/tr/td[normalize-space()='16']")
	private WebElement selectDateFromTableFromAddButtonDate;//dynamic
	
	@FindBy(xpath = "//label[normalize-space()='Done']")
	private WebElement doneButtonFromAddButtonDate;
	//******************************************************************************************************
	
	@FindBy(xpath = "//label[normalize-space()='Booking Window']")
	private WebElement bookingWindowCheckBox;
	
	@FindBy(xpath = "//select[@class='form-control rule-type ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement selectRuleType;
	
	@FindBy(xpath = "//input[@name='startDay']")
	private WebElement startDayTextField;
	
	@FindBy(xpath = "//input[@name='endDay']")
	private WebElement endDayTextField;
	//*******************************************************************************************************
	@FindBy(xpath = "//div[@class='dayOfWeek checkboxButtons']//a[@class='ctrl-for-inputs'][normalize-space()='Select All']")
	private WebElement selectAllWeeksDay;
	
	@FindBy(xpath = "//div[@class='dayOfWeek checkboxButtons']//a[@class='ctrl-for-inputs'][normalize-space()='Clear All']")
	private WebElement clearAllWeekdays;
	
	@FindBy(xpath = "//a[normalize-space()='Weekdays']")
	private WebElement selectOnlyWeekDays;
	
	@FindBy(xpath = "//a[normalize-space()='Weekends']")
	private WebElement selectOnlyWeekends;
	
	@FindBy(xpath = "//label[normalize-space()='Mon']")
	private WebElement selectDay; //dynamic
	//-------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//label[normalize-space()='Blackout Dates']")
	private WebElement blackoutDatesCheckBox;
	
	@FindBy(xpath = "//span[@class='btn btn-default dropdown-toggle plus_button ng-scope']//i[@class='fa fa-plus']")
	private WebElement addDatesForBlackout;
	//----------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//i[@ng-hide='hideKPIPopup']")
	private WebElement addAnotherDateSet;
	
	@FindBy(xpath = "//label[normalize-space()='% Percentage']")
	private WebElement variancesTypeInPercentageTab;
	
	@FindBy(xpath = "//label[@class='btn btn-flat-default btn-sm ng-pristine ng-valid ng-not-empty active ng-touched']")
	private WebElement variancesTypeInFixedPrice;
	
	@FindBy(xpath = "//label[@class='btn btn-flat-default btn-sm ng-pristine ng-untouched ng-valid ng-not-empty active']")
	private WebElement partitionTypeHotel;
	
	@FindBy(xpath = "//label[normalize-space()='Room']")
	private WebElement partitionTypeRoom;
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/a[1]")
	private WebElement selectAllOtas;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/a[2]")
	private WebElement clearAllOtas;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div/div/label[normalize-space()='Yatra']")
	private WebElement selectOta; //dynamic
	//--------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div/div[1]/a[1]")
	private WebElement selectAllCompetitors;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div/div[1]/a[2]")
	private WebElement clearAllCompetitors;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div/label[normalize-space()='COSY CHAMBRE']")
	private WebElement selectCompetitor; //dynamic
	//------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div/div/div/div/fieldset/div[2]/div[1]/a[1]")
	private WebElement selectAllRoomTypes;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div/div/div/div/fieldset/div[2]/div[1]/a[2]")
	private WebElement clearAllRoomTypes;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div/div/div/div/fieldset/div/div/label[normalize-space()='Deluxe Room']")
	private WebElement selectRoom; //dynamic
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//select[@class='form-control dropdown-toggle btn-large ng-pristine ng-valid ng-not-empty ng-touched']")
	private WebElement selectBarprice;
	
	@FindBy(xpath = "//span[normalize-space()='Create']")
	private WebElement createBar;
	
	@FindBy(xpath = "//span[normalize-space()='View']")
	private WebElement viewBar;
	
	@FindBy(xpath = "//span[normalize-space()='Edit']")
	private WebElement editBar;
	
	@FindBy(xpath = "//span[normalize-space()='Duplicate']")
	private WebElement duplicateBar;
	//------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Show')]")
	private WebElement showAdvancedConfiguration;
	
	@FindBy(xpath = "/label[@class='meal_codes second-level-label']")
	private WebElement mealPlanConversion;
	
	@FindBy(xpath = "//label[@class='cons_refundable second-level-label']")
	private WebElement refundOfBEnchmarking;
	
	@FindBy(xpath = "//select[@class='form-control rule-type input-sm ng-pristine ng-valid ng-not-empty ng-touched']")
	private WebElement selectBenchmarkingType;
	//----------------------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//a[@class='btn btn-flat-danger btn-cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//button[normalize-space()='Save Rule']")
	private WebElement saveRule;
	
	@FindBy(xpath = "//input[@class='price-value number ng-untouched ng-valid-min ng-valid-max ng-valid-pattern pleft ng-empty ng-dirty ng-valid-number ng-invalid ng-invalid-required']")
	private WebElement varianceValue;
	
	
	
	public CreateCompetitionRulePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}



	public CreateCompetitionRulePage getRuleNameTextFIeld(String enterRuleName) {
		ExplicitWaitFactory.sendKeys(ruleNameTextFIeld, enterRuleName, WaitStrategy.VISIBLE, " user enter rule name as "+enterRuleName);
		return this;
	}



	public CreateCompetitionRulePage getDateRangeCheckBox() {
		ExplicitWaitFactory.click(dateRangeCheckBox, WaitStrategy.CLICKABLE, " user clicked on the dateRangeCheckBox");

		return this;
	}



	public CreateCompetitionRulePage getPriviousArrowButton() {
		return this;
	}



	public CreateCompetitionRulePage getNextArrowButton() {
		return this;
	}



	public CreateCompetitionRulePage getMonthAndYearText() {
		return this;
	}



	public CreateCompetitionRulePage getSelectDateFromTable() {
		return this;
	}



	public CreateCompetitionRulePage getTodayButton() {
		ExplicitWaitFactory.click(todayButton, WaitStrategy.CLICKABLE, " user clicked on the todayButton");

		return this;
	}



	public CreateCompetitionRulePage getClearButton() {
		ExplicitWaitFactory.click(clearButton, WaitStrategy.CLICKABLE, " user clicked on the clearButton");

		return this;
	}



	public CreateCompetitionRulePage getCloseButton() {
		ExplicitWaitFactory.click(closeButton, WaitStrategy.CLICKABLE, " user clicked on the closeButton");

		return this;
	}



	public CreateCompetitionRulePage getStartDateTextField(String enterStartDateDate) {
		ExplicitWaitFactory.click(startDateTextField, WaitStrategy.CLICKABLE, " user clicked on the startDateTextField");
		String format = String.format("//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li[1]/div/table/tbody/tr/td/button/span[text()='%s']", enterStartDateDate);
		WebElement element = selectDateFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user selected date as "+enterStartDateDate);

		

		return this;
	}



	public CreateCompetitionRulePage getEndDateTExtField(String enterEndDate) {
		ExplicitWaitFactory.click(endDateTExtField, WaitStrategy.CLICKABLE, " user clicked on the endDateTExtField");
		String format = String.format("//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li[1]/div/table/tbody/tr/td/button/span[text()='%s']", enterEndDate);
		WebElement element = selectDateFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " user selected date as "+enterEndDate);

		return this;
	}



	public CreateCompetitionRulePage getSpecificDateCheckBox() {
		ExplicitWaitFactory.click(specificDateCheckBox, WaitStrategy.CLICKABLE, " user clicked on the specificDateCheckBox");

		return this;
		
	}



	public CreateCompetitionRulePage getAddDateButton() {
		ExplicitWaitFactory.click(addDateButton, WaitStrategy.CLICKABLE, " user clicked on the addDateButton");

		return this;
	}



	public CreateCompetitionRulePage getPriviousMonthArrowForAddButtonDate() {
		return this;
	}



	public CreateCompetitionRulePage getNextMonthArrowForAddButtonDate() {
		return this;
	}



	public CreateCompetitionRulePage getMonthandYearTextForAddButtonDate() {
		return this;
	}



	public CreateCompetitionRulePage getSelectDateFromTableFromAddButtonDate() {
		return this;
	}



	public CreateCompetitionRulePage getDoneButtonFromAddButtonDate() {
		ExplicitWaitFactory.click(doneButtonFromAddButtonDate, WaitStrategy.CLICKABLE, " user clicked on the doneButtonFromAddButtonDate");

		return this;
	}



	public CreateCompetitionRulePage getBookingWindowCheckBox() {
		ExplicitWaitFactory.click(bookingWindowCheckBox, WaitStrategy.CLICKABLE, " user clicked on the bookingWindowCheckBox");

		return this;
	}



	public CreateCompetitionRulePage getSelectRuleType() {
		return this;
	}



	public CreateCompetitionRulePage getStartDayTextField() {
		return this;
	}



	public CreateCompetitionRulePage getEndDayTextField() {
		return this;
	}



	public CreateCompetitionRulePage getSelectAllWeeksDay() {
		ExplicitWaitFactory.click(selectAllWeeksDay, WaitStrategy.CLICKABLE, " user clicked on the selectAllWeeksDay");

		return this;
	}



	public CreateCompetitionRulePage getClearAllWeekdays() {
		ExplicitWaitFactory.click(clearAllWeekdays, WaitStrategy.CLICKABLE, " user clicked on the clearAllWeekdays");

		return this;
	}



	public CreateCompetitionRulePage getSelectOnlyWeekDays() {
		ExplicitWaitFactory.click(selectOnlyWeekDays, WaitStrategy.CLICKABLE, " user clicked on the selectOnlyWeekDays");

		return this;
	}



	public CreateCompetitionRulePage getSelectOnlyWeekends() {
		ExplicitWaitFactory.click(selectOnlyWeekends, WaitStrategy.CLICKABLE, " user clicked on the selectOnlyWeekends");

		return this;
	}



	public CreateCompetitionRulePage getSelectDay() {
		return this;
	}



	public CreateCompetitionRulePage getBlackoutDatesCheckBox() {
		ExplicitWaitFactory.click(blackoutDatesCheckBox, WaitStrategy.CLICKABLE, " user clicked on the blackoutDatesCheckBox");

		return this;
	}



	public CreateCompetitionRulePage getAddDatesForBlackout() {
		ExplicitWaitFactory.click(addDatesForBlackout, WaitStrategy.CLICKABLE, " user clicked on the addDatesForBlackout");

		return this;
	}



	public CreateCompetitionRulePage getAddAnotherDateSet() {
		ExplicitWaitFactory.click(addAnotherDateSet, WaitStrategy.CLICKABLE, " user clicked on the addAnotherDateSet");

		return this;
	}



	public CreateCompetitionRulePage getVariancesTypeInPercentageTab() {
		ExplicitWaitFactory.click(variancesTypeInPercentageTab, WaitStrategy.CLICKABLE, " user clicked on the variancesTypeInPercentageTab");

		return this;
	}



	public CreateCompetitionRulePage getVariancesTypeInFixedPrice() {
		ExplicitWaitFactory.click(variancesTypeInFixedPrice, WaitStrategy.CLICKABLE, " user clicked on the variancesTypeInFixedPrice");

		return this;
	}



	public CreateCompetitionRulePage getPartitionTypeHotel() {
		ExplicitWaitFactory.click(partitionTypeHotel, WaitStrategy.CLICKABLE, " user clicked on the partitionTypeHotel");

		return this;
	}



	public CreateCompetitionRulePage getPartitionTypeRoom() {
		ExplicitWaitFactory.click(partitionTypeRoom, WaitStrategy.CLICKABLE, " user clicked on the partitionTypeRoom");

		return this;
	}



	public CreateCompetitionRulePage getSelectAllOtas() {
		ExplicitWaitFactory.click(selectAllOtas, WaitStrategy.CLICKABLE, " user clicked on the selectAllOtas");

		return this;
	}



	public CreateCompetitionRulePage getClearAllOtas() {
		ExplicitWaitFactory.click(clearAllOtas, WaitStrategy.CLICKABLE, " user clicked on the clearAllOtas");

		return this;
	}



	public CreateCompetitionRulePage getSelectOta() {
		return this;
	}



	public CreateCompetitionRulePage getSelectAllCompetitors() {
		ExplicitWaitFactory.click(selectAllCompetitors, WaitStrategy.CLICKABLE, " user clicked on the selectAllCompetitors");

		return this;
	}



	public CreateCompetitionRulePage getClearAllCompetitors() {
		ExplicitWaitFactory.click(clearAllCompetitors, WaitStrategy.CLICKABLE, " user clicked on the clearAllCompetitors");

		return this;
	}



	public CreateCompetitionRulePage getSelectCompetitor() {
		return this;
	}



	public CreateCompetitionRulePage getSelectAllRoomTypes() {
		ExplicitWaitFactory.click(selectAllRoomTypes, WaitStrategy.CLICKABLE, " user clicked on the selectAllRoomTypes");

		return this;
	}



	public CreateCompetitionRulePage getClearAllRoomTypes() {
		ExplicitWaitFactory.click(clearAllRoomTypes, WaitStrategy.CLICKABLE, " user clicked on the clearAllRoomTypes");

		return this;
	}



	public CreateCompetitionRulePage getSelectRoom() {
		return this;
	}



	public CreateCompetitionRulePage getSelectBarprice() {
		
		return this;
	}



	public CreateCompetitionRulePage getCreateBar() {
		ExplicitWaitFactory.click(createBar, WaitStrategy.CLICKABLE, " user clicked on the createBar");

		return this;
	}



	public CreateCompetitionRulePage getViewBar() {
		ExplicitWaitFactory.click(viewBar, WaitStrategy.CLICKABLE, " user clicked on the viewBar");

		return this;
	}



	public CreateCompetitionRulePage getEditBar() {
		ExplicitWaitFactory.click(editBar, WaitStrategy.CLICKABLE, " user clicked on the editBar");

		return this;
	}



	public CreateCompetitionRulePage getDuplicateBar() {
		ExplicitWaitFactory.click(duplicateBar, WaitStrategy.CLICKABLE, " user clicked on the duplicateBar");

		return this;
	}



	public CreateCompetitionRulePage getShowAdvancedConfiguration() {
		ExplicitWaitFactory.click(showAdvancedConfiguration, WaitStrategy.CLICKABLE, " user clicked on the showAdvancedConfiguration");

		return this;
	}



	public CreateCompetitionRulePage getMealPlanConversion() {
		ExplicitWaitFactory.click(mealPlanConversion, WaitStrategy.CLICKABLE, " user clicked on the mealPlanConversion");

		return this;
	}



	public CreateCompetitionRulePage getRefundOfBEnchmarking() {
		ExplicitWaitFactory.click(refundOfBEnchmarking, WaitStrategy.CLICKABLE, " user clicked on the refundOfBEnchmarking");

		return this;
	}



	public CreateCompetitionRulePage getSelectBenchmarkingType() {
		return this;
	}



	public CreateCompetitionRulePage getCancelButton() {
		ExplicitWaitFactory.click(cancelButton, WaitStrategy.CLICKABLE, " user clicked on the cancelButton");
		return this;
	}



	public CreateCompetitionRulePage getSaveRule() {
		ExplicitWaitFactory.click(saveRule, WaitStrategy.CLICKABLE, " user clicked on the saveRule");

		return this;
	}
	
	public CreateCompetitionRulePage getVarianceValue(String enterVarianceValue) {
		ExplicitWaitFactory.sendKeys(varianceValue, enterVarianceValue, WaitStrategy.VISIBLE, " user enter rule name as "+enterVarianceValue);
		return this;
	}

	
	
	
	
	

}
