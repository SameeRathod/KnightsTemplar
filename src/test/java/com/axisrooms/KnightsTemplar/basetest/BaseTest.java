package com.axisrooms.KnightsTemplar.basetest;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.axisrooms.KnightsTemplar.driver.Drivers;

public class BaseTest {
	
	protected BaseTest() {
		
	}

	@BeforeMethod
	public void setUp(Object[] data) {

		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) data[0];

		Drivers.initDrivers(map.get("Browser"));

		// DriverManager.getDriver().navigate().to("https://rm.axisrooms.com/#/login");

	}

	@AfterMethod
	public void tearDown() {

		Drivers.quitDriver();

	}

}
