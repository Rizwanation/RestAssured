package com.mri.utils;

import com.github.javafaker.Faker;

public final class FakerUtils {

    private FakerUtils(){}

    private static final Faker faker = new Faker();

    static int getNumber(int startValue,int endValue)
    {
        return faker.number().numberBetween(startValue,endValue);
    }


    static String getFname()
    {
        return faker.name().firstName();
    }

    static String getLname()
    {
        return faker.name().lastName();
    }




}
