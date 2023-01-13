package com.mri.rails;


import com.gurock.java.APIClient;
import com.gurock.java.APIException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestRailsManager {

    public static String TEST_RUN_ID = "1";
    public static String TEST_RAIL_USERNAME = "m.rizwan07@gmail.com";
    public static String TEST_RAIL_PASSWORD = "vJoey0GY.ocpwoIKVxn1-RCqZtg9GunsRvsO0JoGv";
    public static String RAILS_ENGINE_URL = "https://mricorp.testrail.io/";
    public static final int TEST_CASE_PASSED_STATUS = 1;
    public static final int TEST_CASE_FAILED_STATUS = 5;


    public static void addResultForTestCase(String testCaseId,int status, String error) throws IOException, APIException
    {
        String testRunId = TEST_RUN_ID;
        APIClient apiClient = new APIClient(RAILS_ENGINE_URL);

        apiClient.setUser(TEST_RAIL_USERNAME);
        apiClient.setPassword(TEST_RAIL_PASSWORD);

        Map data = new HashMap();
        data.put("status_id",status);
        data.put("comment","New Comments");

        System.out.println("add_result_for_case/" +testRunId+"/"+testCaseId+ " " +data );

        apiClient.sendPost("add_result_for_case/"+testRunId+"/"+testCaseId+"",data );

        //URL: https://mricorp.testrail.io/add_result_for_case/1/1
        //Body: {status_id:pass comment:"any comment"}

    }

}
