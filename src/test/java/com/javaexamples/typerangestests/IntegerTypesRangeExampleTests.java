package com.javaexamples.typerangestests;

/**
 * Created by andrei on 6/12/2018.
 */
import com.javaexamples.typeranges.IntegerTypesRangeExample;
import org.junit.Test;
import static org.junit.Assert.*;


public class IntegerTypesRangeExampleTests {
    @Test
    public void testGetByteRange(){
        int actualByteLowerMinValue = -(int)(Math.pow(2 , 7));
        int actualByteLowerMaxValue = (int)(Math.pow(2 , 7)) - 1;

        assertEquals("Byte range: "+String.valueOf(actualByteLowerMinValue)+" ... " +actualByteLowerMaxValue,
                IntegerTypesRangeExample.getByteRange());
    }

    @Test
    public void testGetShortRange(){
        int actualShortLowerMinValue = -(int)(Math.pow(2 , 15));
        int actualShortLowerMaxValue = (int)(Math.pow(2 , 15)) - 1;

        assertEquals("Short range: "+String.valueOf(actualShortLowerMinValue)+" ... " +actualShortLowerMaxValue,
                IntegerTypesRangeExample.getShortRange());
    }

    @Test
    public void testGetIntegerRange(){
        long actualIntLowerMinValue = -(long) (Math.pow(2 , 31));
        long actualIntLowerMaxValue = (long) (Math.pow(2 , 31)) - 1;

        assertEquals("Integer range: " + String.valueOf(actualIntLowerMinValue) + " ... " + actualIntLowerMaxValue,
                IntegerTypesRangeExample.getIntegerRange());
    }

    @Test
    public void testGetLongRange(){
        long actualLongLowerMinValue = -9223372036854775808L;
        long actualLongLowerMaxValue = 9223372036854775807L;

        assertEquals("Long range: " + String.valueOf(actualLongLowerMinValue) + " ... " + actualLongLowerMaxValue,
                IntegerTypesRangeExample.getLongRange());
    }
}
