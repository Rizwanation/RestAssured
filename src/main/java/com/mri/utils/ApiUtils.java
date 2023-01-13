package com.mri.utils;

import io.restassured.response.Response;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class ApiUtils {



    public static String readJsonFileAndReturnString(String filepath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filepath)));
    }

    public static void storeResponseAsJsonFile(String filename, Response response) throws IOException {
        Files.write(Paths.get(filename),response.asByteArray());
    }
}
