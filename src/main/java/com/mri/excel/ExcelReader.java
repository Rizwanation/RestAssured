package com.mri.excel;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public class ExcelReader {

    private static List<TestData> testDataList = null;

    static {
        testDataList = Reader.of(TestData.class)
                .from(new File("src/test/resources/TestData.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();
    }

    public static List<TestData> getTestDataList() {
        return testDataList;
    }

    //this class is complete, Its purpose is to read the data and store it in a static variable.
    //we'll use that variable with a getter.

}





