package com.axisrooms.KnightsTemplar.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class ChainSummaryPage {
	
	@FindBy(xpath = "//md-icon[@aria-label='date_range']")
	private WebElement calenderWidgetIconFromSummaryPage;
	
	@FindBy(xpath = "//span")
	private WebElement getMonth; //dynamic xpath
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[1]/span[1]")
	private WebElement yearText;
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[1]/span[2]")
	private WebElement previousYearArrow;
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[1]/span[3]")
	private WebElement nextMonthArrow;
	
	//====================================================================================================
	
	@FindBy(xpath = "//input[@id='input_0']")
	private WebElement hotelSearchTextField;
	
	@FindBy (xpath = "//button[normalize-space()='EXPORT']")
	private WebElement exportButton;
	
	@FindBy(xpath = "//div[@placeholder='Search Team Member']/span/span[2]/span[2]")
	private WebElement teamMemberDropdown;
	
	@FindBy(xpath = "//input[@placeholder='Search Team Member']")
	private WebElement teamMeberTextField;
	
	@FindBy(xpath = "//input[@placeholder='Search Team Member']/following-sibling::ul/li/div/span/span[normalize-space()='Karthik Reddy']")
	private WebElement selectTeamMeber; //dynamic 
	
	@FindBy(xpath = "//table")
	private WebElement selectPropertyFromTable;	//dynamic
	
	public ChainSummaryPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	
	
	
	
	public ChainSummaryPage getCalenderWidgetIcon(String enterYear , String enterMonth) {
		ExplicitWaitFactory.click(calenderWidgetIconFromSummaryPage, WaitStrategy.CLICKABLE, " user clciked on the calender widget");
		
		boolean loopCondition = true;
		while (loopCondition) {
		    System.out.println("Current Year: " + yearText.getText() + ", Target Year: " + enterYear);

		    if (Integer.parseInt(yearText.getText()) > Integer.parseInt(enterYear)) {
		        System.out.println("Going to Previous Year");
		        if (yearText.getText().equalsIgnoreCase(enterYear)) {
		            System.out.println("Breaking the loop");
		            loopCondition = false;
		        }
		        ExplicitWaitFactory.click(previousYearArrow, WaitStrategy.CLICKABLE, "User clicked on previous year arrow");
		    } else if (Integer.parseInt(yearText.getText()) < Integer.parseInt(enterYear)) {
		        System.out.println("Going to Next Year");
		        if (yearText.getText().equalsIgnoreCase(enterYear)) {
		            System.out.println("Breaking the loop");
		            loopCondition = false;
		        }
		        ExplicitWaitFactory.click(nextMonthArrow, WaitStrategy.CLICKABLE, "User clicked on previous year arrow");
		    } else {
		        // Handle the case when the years are equal
		        System.out.println("Years are equal. Breaking the loop");
		        loopCondition = false;
		    }
		    
		}
		
		String format = String.format("//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[2]/span[text()='%s']", enterMonth);
		WebElement element = getMonth.findElement(By.xpath(format));
        ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, "User selected "+enterMonth+" from table");

		
		return this;
	}



	public WebElement getHotelSearchTextField() {
		return hotelSearchTextField;
	}





	public WebElement getExportButton() {
		return exportButton;
	}





	public WebElement getTeamMemberDropdown() {
		return teamMemberDropdown;
	}





	public WebElement getTeamMeberTextField() {
		return teamMeberTextField;
	}





	public WebElement getSelectTeamMeber() {
		return selectTeamMeber;
	}





	public ChainSummaryPage getSelectPropertyFromTable(String enterHotelName) {
		String format = String.format("//table[@id='myTable2']/tbody/tr/td[normalize-space()='%s']", enterHotelName);
		WebElement element = selectPropertyFromTable.findElement(By.xpath(format));
		ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, " uesr clciked on the "+enterHotelName);
		
		
		return this;
	}
	
	

}
