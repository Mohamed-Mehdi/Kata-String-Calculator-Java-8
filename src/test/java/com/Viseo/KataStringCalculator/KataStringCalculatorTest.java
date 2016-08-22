package com.Viseo.KataStringCalculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by MSA3513 on 22/08/2016.
 */


public class KataStringCalculatorTest {

    @Test
    public void should_return_0_when_argument_null() {
        assertEquals(0, KataStringCalculator.add(null));
    }

    @Test
    public void should_return_0_when_argument_is_empty() {
        assertEquals(0, KataStringCalculator.add(""));
    }

    @Test
    public void should_return_0_when_argument_is_zero() {
        assertEquals(0, KataStringCalculator.add("0"));
    }

    @Test
    public void should_return_1_when_argument_is_1() {
        assertEquals(1, KataStringCalculator.add("1"));
    }

    @Test
    public void should_return_3_when_argument_is_1_plus_2() {
        assertEquals(3, KataStringCalculator.add("1+2"));
    }

    @Test
    public void should_return_5_when_argument_is_2_plus_4_minus_1() {
        assertEquals(5, KataStringCalculator.add("2+4-1"));
    }

    @Test
    public void should_return_minus_8_when_argument_is_minus_10plus_3_plus1_minus2() {
        assertEquals(-8, KataStringCalculator.add("-10+3+1-2"));
    }

    @Test
    public void should_return_minus_6_when_argument_is_3_plus_plus5_minus_minus_2() {
        assertEquals(6, KataStringCalculator.add("3++5--2"));
    }


}
