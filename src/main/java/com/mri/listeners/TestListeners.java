package com.mri.listeners;

import com.gurock.java.APIException;
import com.mri.annotations.FrameworkAnnotation;
import com.mri.rails.TestRailsManager;
import com.mri.reports.ExtentLogger;
import com.mri.reports.ExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners
public class TestListeners implements ITestListener, ISuiteListener {

    public String testCaseId="";

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite Started");
        ExtentReport.initReport();
    }

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("On Test Start Listener");
        ExtentReport.createTest("Starting Execution for test: " + result.getMethod().getMethodName());

        String[] authors = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).author();
        ExtentReport.addAuthor(authors);

        String[] categories = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).category();
        ExtentReport.addCategory(categories);
    }

    @Override
    public void onTestSuccess(ITestResult result) {


        try {
            testCaseId = (String) result.getInstance().getClass().getDeclaredField("testCaseId").get(result.getInstance());
            System.out.println("in success: " + testCaseId);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        ExtentLogger.pass(result.getMethod().getMethodName() + " passed execution.");
        try {
            System.out.println("before sending call, success: "+testCaseId);
            TestRailsManager.addResultForTestCase(testCaseId,TestRailsManager.TEST_CASE_FAILED_STATUS, "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (APIException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentLogger.fail(result.getThrowable().toString());
        ExtentLogger.fail(result.getMethod().getMethodName() + " failed execution.");

        try {
            testCaseId = (String) result.getInstance().getClass().getDeclaredField("testCaseId").get(result.getInstance());
            System.out.println("in success: " + testCaseId);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        try {
            System.out.println("before sending call, failure: "+testCaseId);
            TestRailsManager.addResultForTestCase(testCaseId,TestRailsManager.TEST_CASE_FAILED_STATUS, "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (APIException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onFinish(ISuite suite) {
        try {
            ExtentReport.publishReport();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
