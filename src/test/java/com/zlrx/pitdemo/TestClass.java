package com.zlrx.pitdemo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestClass {

    private TestableClass testableClass = new TestableClass();

//    /**
//     * OK, assert the result properly.
//     */
//    @Test
//    public void testReturnWithTrueAssertResult() {
//        int shouldBeTwo = testableClass.returnWithTwo();
//        assertEquals(2, shouldBeTwo);
//    }

//    /**
//     * NOK, any number satisfy the assert
//     */
//    @Test
//    public void testReturnWithTrue() {
//        Integer shouldBeTwo = testableClass.returnWithTwo();
//        assertNotNull(shouldBeTwo);
//    }

    /**
     * NOK, edge case is not tested
     */
    @Test
    public void testPositive() {
        boolean shouldBeTrue = testableClass.isPositive(1);
        assertTrue(shouldBeTrue);
        boolean shouldBeFalse = testableClass.isPositive(-1);
        assertFalse(shouldBeFalse);
    }

//    /**
//     * OK, all case are tested well
//     */
//    @Test
//    public void testPositiveAllVariation() {
//        boolean shouldBeTrue = testableClass.isPositive(1);
//        assertTrue(shouldBeTrue);
//        boolean shouldBeTrueAgain = testableClass.isPositive(0);
//        assertTrue(shouldBeTrueAgain);
//        boolean shouldBeFalse = testableClass.isPositive(-1);
//        assertFalse(shouldBeFalse);
//    }
}
