package com.lokyanrs.javaschool.reflection;

import com.lokyanrs.javaschool.calculator.Calculator;
import com.lokyanrs.javaschool.calculator.CalculatorImpl;
import com.lokyanrs.javaschool.reflection.proxy.metric.PerformanceProxy;
import org.testng.annotations.Test;

public class PerformanceProxyTest {
    @Test
    public void performanceProxyTest() {
        Calculator calculator = PerformanceProxy.newProxyFactory(new CalculatorImpl());
        calculator.calc(1);
        calculator.calc(5);
        calculator.calc(10);
        calculator.calc(50);
    }
}
