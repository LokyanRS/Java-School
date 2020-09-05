package com.lokyanrs.javaschool.lesson1.converters;

public class FahrenheitConverter implements ConverterFromCelsius {
    @Override
    public double convert(double celsius) {
        System.out.print("Fahrenheit: ");
        return celsius * 9 / 5 + 32;
    }
}
