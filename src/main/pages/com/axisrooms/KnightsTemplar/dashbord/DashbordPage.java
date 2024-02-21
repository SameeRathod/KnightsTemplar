package com.axisrooms.KnightsTemplar.dashbord;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;

public class DashbordPage {
	
	@FindBy(xpath = "//div[@class='date icon-wrapper']//i[@class='fa fa-calendar ms_cal_icon']")
	private WebElement kpiCalendarIcon;
	
	@FindBy(xpath = "//i[@ng-click='openKeyPopup()']")
	private WebElement kpiInformationIcon;
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']//div[@class='date']//span//i[@class='fa fa-calendar ms_cal_icon']")
	private WebElement snapShortOfTheMonthCalendarIcon;
	
	@FindBy(xpath = "//i[@ng-click='openMonthSnapshotPopup()']")
	private WebElement snapShortOfTheMonthInformationIcon;
	
	@FindBy(xpath = "//i[@ng-click='openInfoPopup()']")
	private WebElement monthAndYtdSummaryInformationIcon;
	
	@FindBy(xpath = "//div[@id='flats-cal-date-picker']//i[@class='fa fa-calendar ms_cal_icon']")
	private WebElement segmentationAndChannelMixCalendarIcon;
	
	@FindBy (xpath = "//i[@ng-click='openSegmentationPopup()']")
	private WebElement segmentationAndChannelMixInformationIcon;
	
	@FindBy(xpath = "//i[@ng-click='openWeeklyAveragePopup()']")
	private WebElement averageWeeklyStatsInformationIcon;
	
	@FindBy(xpath = "//div[8]//div[1]//div[1]//div[2]//div[1]//div[1]//span[1]//i[1]")
	private WebElement reservationPickupCalendarIcon;
	
	@FindBy(xpath = "//i[@ng-click='openDailyPickupPopup()']")
	private WebElement reservationPickupInformationIcon;
	
	@FindBy(xpath = "//div[9]//div[1]//div[1]//div[2]//div[1]//div[1]//span[1]//i[1]")
	private WebElement bookWindowCalendarIcon;
	
	@FindBy(xpath = "//i[@ng-click='bookWindowPopup()']")
	private WebElement bookWindowInformationIcon;
	
	@FindBy(xpath = "//span[@role='button']//i[@class='fa fa-calendar ms_cal_icon']")
	private WebElement bookingCurveCalendarIcon;
	
	@FindBy(xpath = "//i[@ng-click='openBookingCurvePopup()']")
	private WebElement bookingCurveInformationIcon;
	
	
	public DashbordPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	

}
