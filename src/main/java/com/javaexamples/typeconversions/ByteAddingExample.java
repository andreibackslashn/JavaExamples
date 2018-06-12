package com.javaexamples.typeconversions;
/**
 * Created by andrei on 6/12/2018.
 */


public class ByteAddingExample {
    public static void main (String[] args){
        byte numberToAdd1 = 1;
        byte numbertoAdd2 = 1;
//        byte resultNotCasted =  numberToAdd1 + numbertoAdd2;//Error:(8, 46) java: incompatible types: possible lossy conversion from int to byte
        byte resultCasted = (byte)(numberToAdd1 + numbertoAdd2);//2
        System.out.println(resultCasted);
    }
}
