package com.axisrooms.KnightsTemplar.factories;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.axisrooms.KnightsTemplar.driver.DriverManager;
import com.axisrooms.KnightsTemplar.enums.WaitStrategy;
import com.axisrooms.KnightsTemplar.reports.ExtentLogger;

public class ExplicitWaitFactory {

	// for click
	public static void click(WebElement element, WaitStrategy waitstrategy, String ele) {

		if (waitstrategy == (WaitStrategy.CLICKABLE)) {
			elementToBeClickable(element);
		} else if (waitstrategy == (WaitStrategy.VISIBLE)) {
			elementVisibiity(element);
		}

		element.click();

		try {
			ExtentLogger.pass(ele, true);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

//send keys
	public static void sendKeys(WebElement element, String value, WaitStrategy waitstrategy, String ele) {
		if (waitstrategy == (WaitStrategy.CLICKABLE)) {
			elementToBeClickable(element);
		} else if (waitstrategy == (WaitStrategy.PRESENCE)) {
			elementVisibiity(element);
		}
		element.sendKeys(value);
		try {
			ExtentLogger.pass(" user entred " + "*********" + ele, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// get text
	public static void getText(WebElement element, WaitStrategy waitstrategy, String ele) {
		if (waitstrategy == (WaitStrategy.VISIBLE)) {
			elementToBeClickable(element);
		} else if (waitstrategy == (WaitStrategy.PRESENCE)) {
			elementVisibiity(element);
		}
		element.getText();
		try {
			ExtentLogger.pass(ele, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectValueByVisibleText(WebElement element,WaitStrategy waitstrategy,String selectVisibleText,String ele) {
		if (waitstrategy == (WaitStrategy.PRESENCE)) {
			elementVisibiity(element);
		}
		Select select2 = new Select(element);
		select2.selectByVisibleText(selectVisibleText);
		try {
			ExtentLogger.pass(ele, true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectValueByValue() {

	}

	public static void selectValueByIndex() {

	}

	private static void elementToBeClickable(WebElement forClickAction) {

		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(40))
				.until(ExpectedConditions.elementToBeClickable(forClickAction));
	}

	private static void elementVisibiity(WebElement sendKeys) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOf(sendKeys));
	}

	private static void elementVisibleByText(WebElement element) {

	 new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOf(element));

		

	}

	private static Select elementVisibleByValue(WebElement element) {
		WebElement until = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOf(element));

		return new Select(until);

	}

	private static void elementVisibleByIndex(WebElement element) {
		WebElement until = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOf(element));

		Select select = new Select(until);

	}

}