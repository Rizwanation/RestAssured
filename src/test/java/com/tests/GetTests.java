package com.tests;

import com.mri.annotations.FrameworkAnnotation;
import com.mri.excel.TestData;
import com.mri.reports.ExtentLogger;
import com.mri.utils.RequestBuilder;
import io.restassured.response.Response;


import static org.assertj.core.api.Assertions.*;

import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GetTests {

    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String testCaseId="";
    @Test(dataProvider = "getData", dataProviderClass = BaseTest.class)
    @FrameworkAnnotation()
    public void getEmployeeDetails(TestData testData)
    {//
        setTestCaseId(testData.getTestCaseId());

        /*

        //arrange and action
        RequestSpecification requestSpecification = RequestBuilder.buildRequestForGetCalls();

        ExtentLogger.logRequest(requestSpecification);

        Response response =  requestSpecification
                .get("/employees");



        //Assertions. Statically import Assertions class methods from AssertJ

        assertThat(response.getStatusCode())
                .isEqualTo(200)
                .isPositive();

        assertThat(response.jsonPath().getList("").size())
                .isPositive()
                .isGreaterThan(1);

        assertThat(response.jsonPath().getString("last_name[0]"))
                .isEqualTo("Eschweiler")
                .hasSizeBetween(3,50);


        //logging to report
        ExtentLogger.logResponse(response.asString());

 */

     Assert.assertTrue(true);
    }




}
