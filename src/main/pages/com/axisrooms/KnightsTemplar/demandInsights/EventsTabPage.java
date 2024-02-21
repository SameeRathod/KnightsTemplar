package com.axisrooms.KnightsTemplar.demandInsights;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;

public class EventsTabPage {
	
	@FindBy(xpath = "//i[@class='fa fa-calendar ms_cal_icon']")
	private WebElement calendarWidget;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-chevron-right']")
	private WebElement nextMonthAndYearButton;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-chevron-left']")
	private WebElement previousMonthAndYearButton;
	
	@FindBy(xpath = "//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']/li/div/table/tbody/tr/td/button/span[text()='15']")
	private WebElement selectDateFromTable;//dynamic
	
	@FindBy(xpath = "//strong[@class='ng-binding']")
	private WebElement monthAandYearText;
	
	@FindBy(xpath = "//button[@class='btn btn-primary apply-btns']")
	private WebElement allEventsButton;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]")
	private WebElement totalEventsRegistered;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[3]/div[2]")
	private WebElement eventsInducedDemand;
	
	@FindBy(xpath = "//div[@class='mapBox']/div")
	private List<WebElement> noOfEvent;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[2]/div[2]")
	private  WebElement estimatedAttendees;
	
	@FindBy(xpath = "//div[@class='mapBox']/div/div/div[position() mod 6=0]")
	private List<WebElement> noOfAAttendeesEventvise;

	
	public EventsTabPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	public WebElement getCalendarWidget() {
		return calendarWidget;
	}


	public WebElement getNextMonthAndYearButton() {
		return nextMonthAndYearButton;
	}


	public WebElement getPreviousMonthAndYearButton() {
		return previousMonthAndYearButton;
	}


	public WebElement getSelectDateFromTable() {
		return selectDateFromTable;
	}


	public WebElement getMonthAandYearText() {
		return monthAandYearText;
	}


	public WebElement getAllEventsButton() {
		return allEventsButton;
	}


	public WebElement getTotalEventsRegistered() {
		return totalEventsRegistered;
	}


	public WebElement getEventsInducedDemand() {
		return eventsInducedDemand;
	}


	public List<WebElement> getNoOfEvent() {
		return noOfEvent;
	}


	public WebElement getEstimatedAttendees() {
		return estimatedAttendees;
	}


	public List<WebElement> getNoOfAAttendeesEventvise() {
		return noOfAAttendeesEventvise;
	}
	
	
}
