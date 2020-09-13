package com.lokyanrs.javaschool.converters;

import org.slf4j.LoggerFactory;

public class FahrenheitConverter implements ConverterFromCelsius {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(FahrenheitConverter.class);

    @Override
    public double convert(double celsius) {
        double fahrenheitTemperature = celsius * 9 / 5 + 32;
        LOGGER.info("{} in celcius equal to {} in fahrenheit", celsius, fahrenheitTemperature);
        return fahrenheitTemperature;
    }
}
