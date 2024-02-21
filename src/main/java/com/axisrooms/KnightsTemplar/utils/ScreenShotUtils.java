package com.axisrooms.KnightsTemplar.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.axisrooms.KnightsTemplar.driver.DriverManager;

public class ScreenShotUtils {
	
	public static String getBase64Image() {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

}
