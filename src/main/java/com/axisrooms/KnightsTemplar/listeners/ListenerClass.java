package com.axisrooms.KnightsTemplar.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.axisrooms.KnightsTemplar.reports.ExtendReport;
import com.axisrooms.KnightsTemplar.reports.ExtentLogger;

public class ListenerClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		try {
			ExtendReport.initReports();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			ExtendReport.flushReports();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtendReport.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		ExtentLogger.pass(result.getMethod().getMethodName() + " is passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		ExtentLogger.fail(result.getMethod().getMethodName() + " is failed");
		ExtentLogger.fail(result.getThrowable().toString());
		// ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		// Print each line of the stack trace on a new line
		StackTraceElement[] stackTrace = result.getThrowable().getStackTrace();
		for (StackTraceElement element : stackTrace) {
			ExtentLogger.fail(element.toString());
		}	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() + " is Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		/* For now we are not using this */

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		/* For now we are not using this */
	}

	@Override
	public void onStart(ITestContext context) {
		/*
		 * we are having just one test in our suit. so we don't have any special
		 * implementation as of now
		 */
	}

	@Override
	public void onFinish(ITestContext context) {
		/*
		 * we are having just one test in our suit. so we don't have any special
		 * implementation as of now
		 */
	}

}
