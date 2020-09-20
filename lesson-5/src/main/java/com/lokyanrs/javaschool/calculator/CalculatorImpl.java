package com.lokyanrs.javaschool.calculator;

public class CalculatorImpl implements Calculator {
    @Override
    public int calc(int number) {
        switch (number) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return calc(number - 1) * number;
        }
    }
}
