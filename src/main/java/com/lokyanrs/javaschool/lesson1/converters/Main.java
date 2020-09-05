package com.lokyanrs.javaschool.lesson1.converters;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ConverterFromCelsius> converters= new ArrayList<>();
        converters.add(new FahrenheitConverter());
        converters.add(new KelvinConverter());
        converters.add(new ReaumurConverter());

        double celsiusValue = 100;
        System.out.println("Celsius value = " + celsiusValue);
        for (ConverterFromCelsius converter : converters) {
            System.out.println(converter.convert(celsiusValue));
        }
    }
}
