package com.javaexamples.typeconversions;
/**
 * Created by andrei on 6/12/2018.
 */


public class AddingExamples {
    public static void main(String[] args){
        byte byteToAdd1 = 1;
        byte byteToAdd2 = 1;
        System.out.println("Adding bytes: " + addBytes(byteToAdd1 , byteToAdd2));
        //System.out.println(addBytes((byte)(1) , (byte)(1)));

        short shortToAdd1 = 1;
        short shortToAdd2 = 1;
        System.out.println("Adding shorts: " +  addShorts(shortToAdd1 , shortToAdd2));

        int intToAdd1 = 1;
        int intToAdd2 = 1;
        System.out.println("Adding ints: " + addInts(intToAdd1 , intToAdd2));

        long longToAdd1 = 1L;
        long longToAdd2 = 1L;
        System.out.println("Adding longs: " + addLongs(longToAdd1 , longToAdd2));
    }

    private static byte addBytes(byte numberToAdd1 , byte numbertoAdd2){
        byte result = (byte)(numberToAdd1 + numbertoAdd2);
        return result;
    }

    private static short addShorts(short numberToAdd1 , short numbertoAdd2){
        short result = (short)(numberToAdd1 + numbertoAdd2);
        return result;
    }

    private static int addInts(int numberToAdd1 , int numbertoAdd2){
        //no casting needed
        int result = numberToAdd1 + numbertoAdd2;
        return result;
    }

    private static long addLongs(long numberToAdd1 , long numberToAdd2){
        long result = numberToAdd1 + numberToAdd2;
        return result;
    }
}
