package com.mri.utils;

public final class RandomUtils {
    private RandomUtils(){}

    public static int getId()
    {
        return FakerUtils.getNumber(300,50000);
    }

    public static String getFirstName()
    {
        return FakerUtils.getFname();
    }

    public static String getLastName()
    {
        return FakerUtils.getLname();
    }


}
