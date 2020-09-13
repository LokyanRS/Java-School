package com.lokyanrs.javaschool.converters;

import org.slf4j.LoggerFactory;

public class ReaumurConverter implements ConverterFromCelsius {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ReaumurConverter.class);

    @Override
    public double convert(double celsius) {
        double reamurTemperature = celsius *0.8;
        LOGGER.info("{} in celcius equal to {} in reamur", celsius, reamurTemperature);
        return reamurTemperature;
    }
}
