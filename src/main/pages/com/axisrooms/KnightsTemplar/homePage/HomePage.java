package com.axisrooms.KnightsTemplar.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class HomePage  {
	
	@FindBy(xpath = "//a[@ui-sref='private.home']")
	private WebElement chainSummaryTab;
	
	@FindBy(xpath = "//a[@ui-sref='private.team']")
	private WebElement teamSummaryTab;
	
	@FindBy(xpath = "//li[@class='dropdown']//a[@id='profile-setting']")
	private WebElement profileDropdown;
	
	@FindBy(xpath = "//a[@ng-click='logout()']")
	private WebElement logOutButton;
	
	@FindBy(xpath = "//div")
	private WebElement teamName; //dynamic
	
	@FindBy(xpath = "//div")
	private WebElement teamMembers; //dynamic
//===================================================================================================	
	@FindBy(xpath = "//md-icon[@aria-label='date_range']")
	private WebElement calenderWidgetIcon; 
	
	@FindBy(xpath = "//span")
	private WebElement getMonth; //dynamic xpath
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[1]/span[1]")
	private WebElement yearText;
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[1]/span[2]")
	private WebElement previousYearArrow;
	
	@FindBy(xpath = "//span[@id='flat-cal-date-picker']/following-sibling::div/div/div[1]/span[3]")
	private WebElement nextMonthArrow;
//========================================================================================
	@FindBy(xpath = "//div[@class='row base_header']/following-sibling::table/tbody/tr/td[contains(text(),' AR Demo Hotel')]")
	private WebElement selectHotelName;//dynamic
	
	@FindBy (xpath = "//div[@class='row kpi']/p")
	public WebElement kpiText;
	
	@FindBy(xpath = "//div[@class='row base_header']/div[1]/p")
	public WebElement getNavigateToDashbordPageText;
	
	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public HomePage getChainSummaryTab() {
		ExplicitWaitFactory.click(chainSummaryTab, WaitStrategy.CLICKABLE, " user clicked on the chain summary tab");
		return this;
	}

	public HomePage getTeamSummaryTab() {
		ExplicitWaitFactory.click(teamSummaryTab, WaitStrategy.CLICKABLE, " user clicked on the team summary tab");

		return this;
	}

	public HomePage getProfileDropdown() {
		ExplicitWaitFactory.click(profileDropdown, WaitStrategy.CLICKABLE, " user clicked on the profile dropdown");

		return this;
	}

	public HomePage getLogOutButton() {
		ExplicitWaitFactory.click(logOutButton, WaitStrategy.CLICKABLE, " user clicked on the logout button");

		return this;
	}

	public HomePage getTeamName(String teamTrackerName) {
		String formatTeamName = String.format("//div[@class='team_tracker']/table/tbody/tr/td[contains(text(),'%s')]", teamTrackerName);
		WebElement element = teamName.findElement(By.xpath(formatTeamName));
        ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, "User selected "+teamTrackerName+" from table");
		return this;
	}

	public HomePage getTeamMembers(String teamMemberName) {
		String formatTeamMember = String.format("//div[@class='team-members']/div/div/div[normalize-space()='%s']", teamMemberName);
		WebElement element = teamMembers.findElement(By.xpath(formatTeamMember));
        ExplicitWaitFactory.click(element, WaitStrategy.CLICKABLE, "User selected "+teamMemberName+" from table");
		return this;
	}

	public HomePage getCalenderWidgetIcon(String enterYear , String enterMonth) {
		ExplicitWaitFactory.click(calenderWidgetIcon, WaitStrategy.CLICKABLE, " user clciked on the calender widget");
		
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

	public HomePage getSelectHotelName() {
		return this;
	}
	
	
	
	

}
