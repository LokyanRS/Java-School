package com.lokyanrs.javaschool.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void factorialTest() {
        FactorialImpl factorial = new FactorialImpl();
        Assert.assertEquals(factorial.calc(5), 120);
        Assert.assertEquals(factorial.calc(0), 1);
        Assert.assertEquals(factorial.calc(1), 1);
        Assert.assertEquals(factorial.calc(2), 2);
    }
}
