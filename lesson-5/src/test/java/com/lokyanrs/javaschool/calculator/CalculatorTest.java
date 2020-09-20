package com.lokyanrs.javaschool.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void factorialTest() {
        CalculatorImpl factorial = new CalculatorImpl();
        Assert.assertEquals(factorial.calc(5), 120);
        Assert.assertEquals(factorial.calc(0), 1);
        Assert.assertEquals(factorial.calc(1), 1);
        Assert.assertEquals(factorial.calc(2), 2);
    }
}
