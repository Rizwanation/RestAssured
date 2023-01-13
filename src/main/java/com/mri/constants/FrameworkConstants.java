package com.mri.constants;

import lombok.Getter;

public final class FrameworkConstants {

    private FrameworkConstants() {}

    private final @Getter static String JSON_REQUESTS_PATH = "src/test/resources/JsonRequests";
    private final @Getter static String JSON_RESPONSES_PATH = "src/test/resources/JsonResponses";

    private final @Getter static String PROPERTY_FILE_PATH = "src/test/resources/config.properties";


}
