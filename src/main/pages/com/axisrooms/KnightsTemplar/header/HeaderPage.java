package com.axisrooms.KnightsTemplar.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axisrooms.KnightsTemplar.dashbord.DashbordPage;
import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.factories.ExplicitWaitFactory;

public class HeaderPage {
	
	
	@FindBy(xpath = "//div[@class='container']/div/ul/li[3]")
	private WebElement dashbordTab;
	
	@FindBy(xpath = "//div[@class='container']/div/ul/li[4]")
	private WebElement demandInsightsTab;
	
	@FindBy(xpath = "//div[@class='container']/div/ul/li[5]")
	private WebElement pricingTab;
	
	@FindBy(xpath = "//div[@class='container']/div/ul/li[6]")
	private WebElement optimizerTab;
	
	@FindBy(xpath = "//div[@class='container']/div/ul/li[7]")
	private WebElement reportsTab;
	
	@FindBy(xpath = "//div[@class='container']/div/ul/li[8]")
	private WebElement configurationTab;
	
	@FindBy(xpath = "//div[@class='container']/div/ul[2]/li[1]")
	private WebElement configurationAlertIcon;
	
	@FindBy(xpath = "//div[@class='container']/div/ul[3]/li")
	private WebElement topEventCalendarIcon;
	
	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v fa-3x']")
	private WebElement ellipsisIcon;
	
	@FindBy(xpath = "//div[@role='progressbar']//span[@class='ng-binding']")
	private WebElement userScoreICon;
	
	public HeaderPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public DashbordPage getDashbordTab() {
		ExplicitWaitFactory.click(dashbordTab, WaitStrategy.CLICKABLE, " user clciked on the dashbord tab");
		return new DashbordPage();
	}

	public WebElement getDemandInsightsTab() {
		ExplicitWaitFactory.click(demandInsightsTab, WaitStrategy.CLICKABLE, " user clciked on the demandInsightsTab ");

		return demandInsightsTab;
	}

	public WebElement getPricingTab() {
		ExplicitWaitFactory.click(pricingTab, WaitStrategy.CLICKABLE, " user clciked on the pricingTab ");

		return pricingTab;
	}

	public WebElement getOptimizerTab() {
		ExplicitWaitFactory.click(optimizerTab, WaitStrategy.CLICKABLE, " user clciked on the optimizerTab ");

		return optimizerTab;
	}

	public WebElement getReportsTab() {
		ExplicitWaitFactory.click(reportsTab, WaitStrategy.CLICKABLE, " user clciked on the reportsTab ");

		return reportsTab;
	}

	public WebElement getConfigurationTab() {
		ExplicitWaitFactory.click(configurationTab, WaitStrategy.CLICKABLE, " user clciked on the configurationTab ");

		return configurationTab;
	}

	public WebElement getConfigurationAlertIcon() {
		ExplicitWaitFactory.click(configurationAlertIcon, WaitStrategy.CLICKABLE, " user clciked on the configurationAlertIcon ");

		return configurationAlertIcon;
	}

	public WebElement getTopEventCalenderIcon() {
		ExplicitWaitFactory.click(topEventCalendarIcon, WaitStrategy.CLICKABLE, " user clciked on the topEventCalenderIcon ");

		return topEventCalendarIcon;
	}

	public WebElement getEllipsisIcon() {
		ExplicitWaitFactory.click(ellipsisIcon, WaitStrategy.CLICKABLE, " user clciked on the ellipsisIcon ");

		return ellipsisIcon;
	}

	public WebElement getUserScoreICon() {
		ExplicitWaitFactory.click(userScoreICon, WaitStrategy.CLICKABLE, " user clciked on the userScoreICon ");

		return userScoreICon;
	}
	
	

}
