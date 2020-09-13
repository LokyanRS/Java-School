package com.lokyanrs.javaschool.converters;

import org.slf4j.LoggerFactory;

public class KelvinConverter implements ConverterFromCelsius{
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(KelvinConverter.class);

    @Override
    public double convert(double celsius) {
        double kelvinTemperature = celsius + 273.15;
        LOGGER.info("{} in celcius equal to {} in kelvin", celsius, kelvinTemperature);
        return kelvinTemperature;
    }
}
