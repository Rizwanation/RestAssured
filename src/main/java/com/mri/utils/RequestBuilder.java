package com.mri.utils;

import com.mri.enums.PropertyTypes;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public final class RequestBuilder { //don't extend it

    public static RequestSpecification buildRequestForGetCalls()
    {
        return given()
                .baseUri(PropertyUtils.getProperty(PropertyTypes.BASEURL))
                .log()
                .all();

    }


    public static RequestSpecification buildRequestForPostCalls()
    {
        return given()
                .baseUri(PropertyUtils.getProperty(PropertyTypes.BASEURL))
                .contentType(ContentType.JSON)
                .log()
                .all();

    }

}
