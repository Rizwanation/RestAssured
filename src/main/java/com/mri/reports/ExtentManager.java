package com.mri.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
    private ExtentManager() {}

    static ThreadLocal<ExtentTest> testThreadManager = new ThreadLocal();

    public static void setTest(ExtentTest test)
    {
        testThreadManager.set(test);
    }

    public static ExtentTest getTestInstance()
    {
        return testThreadManager.get();
    }

    public static void unload()
    {
        testThreadManager.remove();
    }
}
