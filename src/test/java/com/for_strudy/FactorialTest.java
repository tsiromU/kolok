package com.for_strudy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void simpleTest1(){
        try{
        ArrayList<BigDecimal> result = Factorial.calculateFactorial(3);
        assertEquals(BigDecimal.ONE, result.get(0));
        assertEquals(BigDecimal.ONE, result.get(1));
        assertEquals(BigDecimal.valueOf(2), result.get(2));

        assertEquals(3, result.size());

        } catch(IOException e) {
            assertTrue(false);
        }
    }

    @Test
    public void simpleTest2(){
        try{
        ArrayList<BigDecimal> actualResult = Factorial.calculateFactorial(0);
        ArrayList<BigDecimal> expectedResult = new ArrayList<BigDecimal>();
        expectedResult.add(BigDecimal.ONE);

        assertEquals(expectedResult, actualResult);

        } catch(IOException e) {
            assertTrue(false);
        }
    }

    //should throw exception
    @Test
    public void IOExceptionTest1(){
        boolean wasThrown = false;
        try{
            ArrayList<BigDecimal> result = Factorial.calculateFactorial(-1);
        
        } catch(IOException e) {
            wasThrown = true;
        }
        assertTrue(wasThrown);;
    }

}
