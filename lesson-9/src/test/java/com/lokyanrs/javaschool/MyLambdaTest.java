package com.lokyanrs.javaschool;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyLambdaTest {
    @Test
    public void myLambdaTest() {
        MyLambda<String> myLambda1 = (a, b) -> a + b;
        MyLambda<Integer> myLambda2 = (a, b) -> a + b;
        Assert.assertEquals(myLambda1.getSum("abc", "def"), "abcdef");
        Assert.assertEquals(myLambda2.getSum(1, 1), Integer.valueOf(2));
    }
}
