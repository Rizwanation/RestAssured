package com.mri.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.mri.reports.ExtentManager.unload;

public final class ExtentReport {

    private ExtentReport() {}
    private static ExtentReports extentReport;



    //this class should have code to start extent report.
    //let's create a method for that and call that method somewhere else beforeSuite

    public static void initReport()
    {
        System.out.println("Reports initializing...");
        extentReport = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("index.html");

        extentReport.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setDocumentTitle("Rest Assured Tests Report");
        extentSparkReporter.config().setReportName("Rest Assured Tests Report");

        System.out.println("Reports initialized.");

    }


    public static void createTest(String testname)
    {
        System.out.println("Creating test and setting to threadLocal var..");
        ExtentManager.setTest(extentReport.createTest(testname));
    }


    public static void publishReport() throws IOException {
        extentReport.flush();
        unload();
       //Desktop.getDesktop().browse(new File("index.html").toURI());
    }


    public static void addAuthor(String[] authors)
    {
        for (String author : authors) {
            ExtentManager.getTestInstance().assignAuthor(author);
        }
    }

    public static void addCategory(String[] categories)
    {
        for (String category : categories) {
            ExtentManager.getTestInstance().assignCategory(category);
        }
    }

}
