package com.lokyanrs.javaschool.lesson1.converters;

public class KelvinConverter implements ConverterFromCelsius{
    @Override
    public double convert(double celsius) {
        System.out.print("Kelvin: ");
        return celsius + 273.15;
    }
}
