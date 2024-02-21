package com.axisrooms.KnightsTemplar.constants;

import com.axisrooms.KnightsTemplar.enums.ConfigProperties;
import com.axisrooms.KnightsTemplar.utils.PropertyUtils;

// if we don't want to allow people to extend this  class make class as final
//if we want to restrict to people for creating object create private constructor
public final class FrameworkConstant {

	private FrameworkConstant() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir");
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/src/test/resources/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/src/test/resources/config/config.properties";
	private static final String EXCELFILEPATH = RESOURCESPATH + "/src/test/resources/excelFiles/RMS_TestData.xlsx";
	private static final String JSONFILEPATH = RESOURCESPATH + "/src/test/resources/Json/config.json";
	private static final String EXTENTREPORTFOLDERPATH = RESOURCESPATH + "/extent-test-output";
	private static  String extentReportFilePath = "";
	private static final String RUNMANAGERSHEET="Sheet1";
	private static final String ITERATIONDATASHEET="Data";

	public static String getExtentReportFilePath() throws Exception {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath=createReportPath();
			
		}
		return extentReportFilePath;
	}
	private static String createReportPath() throws Exception {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
		}
		else {
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static String excelFilePath() {
		return EXCELFILEPATH;
	}

	public static String jsonFilePath() {
		return JSONFILEPATH;
	}
	
	public static String runManagerSheet() {
		return RUNMANAGERSHEET;
	}
	public static String iterationSheet() {
		return ITERATIONDATASHEET;
	}

	/*public static String extentReportPath() throws Exception {
		if (PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
			return EXTENTREPORTPATH + "/" + System.currentTimeMillis() + "/index.html";
		}
		else {
			return EXTENTREPORTPATH+"/index.html";
			
		}
		
	}*/

}
