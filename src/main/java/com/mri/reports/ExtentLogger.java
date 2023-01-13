package com.mri.reports;


import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.restassured.http.Header;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public final class ExtentLogger {

    public static void pass(String message)
    {
       ExtentManager.getTestInstance().pass(message);
    }

    public static void fail(String message)
    {
        ExtentManager.getTestInstance().fail(message);
    }

    public static void info(String message)
    {
        ExtentManager.getTestInstance().info(message);
    }


    public static void logResponse(String message)
    {
        ExtentManager.getTestInstance().info(MarkupHelper.createCodeBlock(message, CodeLanguage.JSON));
    }



    public static void logRequest(RequestSpecification requestSpecification)
    {
        QueryableRequestSpecification query = SpecificationQuerier.query(requestSpecification);
        info("Request body details below");
        info(String.valueOf(MarkupHelper.createCodeBlock((query.getBody()), CodeLanguage.JSON)));

        info("Request Headers details below");

        for (Header header : query.getHeaders()) {
            info(String.valueOf(MarkupHelper.createCodeBlock((header.getName()) + " : " + header.getValue(), CodeLanguage.JSON)));

        }


    }
}
