package com.mri.demo;

import org.testng.annotations.Test;

public class Problems {


    public static String convertToBinary(long n)
    {
        String binary = "";
        long a = 0;
        while (n>0)
        {
            long remainder = n%2;
            n = n/2;
            binary = remainder + binary;
        }

        System.out.println("binary initial. input: "+n + " output: " + binary);
        while(binary.length() < 32)
        {
            binary = "0" + binary;
        }
        return binary;
    }

    public static long flippingBits(long n) {

        String binary = convertToBinary(n);
        String inverted = "";
        char t;

        System.out.println(binary);

        for (int i = 0;i<32;i++)
        {
            if (binary.charAt(i)=='1')
            {
                t='0';
            }
            else
            {
                t='1';
            }

            inverted = inverted + t;

        }

        System.out.println(inverted + " " + "length: " +inverted.length());

        long finalResult = 0;

        for (int power = 31;power > -1;power--)
        {
            long ab = inverted.charAt(31-power) - 48;
            long twoFactor = (long) Math.pow(2,power);
            finalResult = finalResult + (twoFactor * ab);
        }

        return finalResult;




    }

    @Test
    public static void binaryTest()
    {
        System.out.println(flippingBits(4));
    }
}
