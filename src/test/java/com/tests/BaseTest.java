package com.tests;

import com.mri.excel.ExcelReader;
import org.testng.annotations.*;
import java.lang.reflect.Method;



public class BaseTest {

    @DataProvider
    public static Object[] getData(Method method) {


        return ExcelReader
                .getTestDataList()
                .stream()
                .filter(e->e.getTestCaseName().equalsIgnoreCase(method.getName()))
                .toArray();
    };

}