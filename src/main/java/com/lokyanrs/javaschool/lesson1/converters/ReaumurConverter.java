package com.lokyanrs.javaschool.lesson1.converters;

public class ReaumurConverter implements ConverterFromCelsius {
    @Override
    public double convert(double celsius) {
        System.out.print("Reaumur: ");
        return celsius * 0.8;
    }
}
