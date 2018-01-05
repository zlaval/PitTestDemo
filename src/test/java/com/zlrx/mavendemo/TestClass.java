package com.zlrx.mavendemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {

    private TestableClass testableClass = new TestableClass();

//    /**
//     * OK, assert the result properly.
//     */
//    @Test
//    public void testReturnWithTrueAssertResult() {
//        int result = testableClass.returnWithTwo();
//        assertEquals(2, result);
//    }

    /**
     * NOK, any number satisfy the assert
     */
    @Test
    public void testReturnWithTrue() {
        Integer result = testableClass.returnWithTwo();
        assertNotNull(result);
    }

    /**
     * NOK, edge case is not tested
     */
    @Test
    public void testPositive() {
        boolean result = testableClass.isPositive(1);
        assertTrue(result);
        boolean result2 = testableClass.isPositive(-1);
        assertFalse(result2);
    }

//    /**
//     * OK, all case are tested well
//     */
//    @Test
//    public void testPositiveAllVariation() {
//        boolean result1 = testableClass.isPositive(1);
//        assertTrue(result1);
//        boolean result2 = testableClass.isPositive(0);
//        assertTrue(result2);
//        boolean result3 = testableClass.isPositive(-1);
//        assertFalse(result3);
//    }
}
