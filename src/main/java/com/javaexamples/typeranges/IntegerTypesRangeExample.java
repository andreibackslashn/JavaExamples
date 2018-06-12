package com.javaexamples.typeranges;

/**
 * Created by andrei on 6/12/2018.
 */

public class IntegerTypesRangeExample {
    public static void main(String[] args) {

        getByteRange();
        System.out.println("Byte size in B: " +  Byte.BYTES);
        getShortRange();
        System.out.println("Short size in B: " +  Short.BYTES);
        getIntegerRange();
        System.out.println("Integer size in B: " +  Integer.BYTES);
        getLongRange();
        System.out.println("Long size in B: " +  Long.BYTES);
    }

    public static String getByteRange() {
        String returnRange = "Byte range: " + Byte.MIN_VALUE + " ... " + Byte.MAX_VALUE;
        System.out.println(returnRange);
        return returnRange;
    }

    public static String getShortRange() {
        String returnRange = "Short range: " + Short.MIN_VALUE + " ... " + Short.MAX_VALUE;
        System.out.println(returnRange);
        return returnRange;
    }

    public static String getIntegerRange() {
        String returnRange = "Integer range: " + Integer.MIN_VALUE + " ... " + Integer.MAX_VALUE;
        System.out.println(returnRange);
        return returnRange;
    }

    public static String getLongRange() {
        String returnRange = "Long range: " +  Long.MIN_VALUE + " ... " + Long.MAX_VALUE;
        System.out.println(returnRange);
        return returnRange;
    }
}
