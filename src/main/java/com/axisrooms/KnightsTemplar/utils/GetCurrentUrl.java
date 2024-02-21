package com.axisrooms.KnightsTemplar.utils;

import org.openqa.selenium.WebDriver;

public class GetCurrentUrl {

	public static String getUrl(WebDriver driver) {
		
		String currentUrl =driver.getCurrentUrl();
		return currentUrl;
		

	}

}
