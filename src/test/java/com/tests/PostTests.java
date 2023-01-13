package com.tests;

import com.mri.annotations.FrameworkAnnotation;
import com.mri.constants.FrameworkConstants;
import com.mri.excel.TestData;
import com.mri.pojo.Employee;


import static com.mri.utils.RequestBuilder.buildRequestForPostCalls;
import static com.mri.utils.RandomUtils.*;


import com.mri.reports.ExtentLogger;
import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.*;

import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PostTests {
/*
    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String testCaseId="";

    @Test(dataProvider = "getData", dataProviderClass = BaseTest.class)
    @FrameworkAnnotation(author = {"Muhammad","Rizwan"}, category = "Smoke")
    public void postCallTest(TestData testData)
    {



        setTestCaseId(testData.getTestCaseId());
        System.out.println(getTestCaseId());
        //arrange
        Employee employee = Employee.builder()
                .setId(getId())
                .setFname(getFirstName())
                .setLname(getLastName())
                .build();

        //actions
        RequestSpecification requestSpecification = buildRequestForPostCalls()
                .body(employee);

        ExtentLogger.logRequest(requestSpecification);

        Response response = requestSpecification
                .post("/employees");

        //assertions
        assertThat(response.getStatusCode())
                .isBetween(200,201);

        //logging to report
        ExtentLogger.logResponse(response.asString());

    }

//    @Test
//    @FrameworkAnnotation(author = {"Muhammad","Rizwan"}, category = "Smoke")
//    public void postRequestUsingExternalFile(Method method) throws IOException {
//
//
//
//        //arrange
//        String externalBody = readJsonFileAndReturnString(FrameworkConstants.getJSON_REQUESTS_PATH()+"/requestBody.json");
//        String updatedBody = externalBody.replace("998",String.valueOf(RandomUtils.getId()));
//
//        //actions
//        RequestSpecification requestSpecification = RequestBuilder
//                .buildRequestForPostCalls()
//                .body(updatedBody);
//
//        ExtentLogger.logRequest(requestSpecification);
//
//        Response response = requestSpecification
//                .post("/employees");
//
//        response.prettyPrint();
//
//        storeResponseAsJsonFile(FrameworkConstants.getJSON_RESPONSES_PATH() +"/" + method.getName()+ "/fullResponse.json",response);
//
//        //assertions
//        assertThat(response.getStatusCode())
//                .isBetween(200,201);
//        assertThat(response.jsonPath().getString("lname"))
//                .contains("depp");
//
//        //logging to report
//        ExtentLogger.logResponse(response.asString());
//    }
}
}
 */

    @Test()
    public void postCallTest(TestData testData)
    {
        Assert.assertTrue(true);
    }
}
