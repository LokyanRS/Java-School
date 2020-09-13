package com.lokyanrs.javaschool.algorithms.converters;

import com.lokyanrs.javaschool.converters.ConverterFromCelsius;
import com.lokyanrs.javaschool.converters.FahrenheitConverter;
import com.lokyanrs.javaschool.converters.KelvinConverter;
import com.lokyanrs.javaschool.converters.ReaumurConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConvertersTest {
    @Test
    public void fahrenheitConverterTest() {
        double actualValue = new FahrenheitConverter().convert(100);
        Assert.assertEquals(actualValue, 212.0);
    }

    @Test
    public void kelvinConverterTest() {
        double actualValue = new KelvinConverter().convert(100);
        Assert.assertEquals(actualValue, 373.15);
    }

    @Test
    public void reaumurConverterTest() {
        double actualValue = new ReaumurConverter().convert(100);
        Assert.assertEquals(actualValue, 80.0);
    }


}
