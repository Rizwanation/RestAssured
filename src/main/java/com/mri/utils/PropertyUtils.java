package com.mri.utils;

import com.mri.constants.FrameworkConstants;
import com.mri.enums.PropertyTypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class PropertyUtils {
    private PropertyUtils() {
    }
    private static FileInputStream fis;
    private static Properties prop;
    private static Map<String,String> propertiesMap = new HashMap<>();

    static
    {

        try {
            fis = new FileInputStream(FrameworkConstants.getPROPERTY_FILE_PATH());
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        prop.entrySet().forEach(pair->propertiesMap.put(String.valueOf(pair.getKey()),String.valueOf(pair.getValue())));

    }

    public static String getProperty(PropertyTypes key)
    {
        return propertiesMap.get(key.name().toLowerCase());
    }

}
