package com.lokyanrs.javaschool.reflection;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ConstantsTest {

    @Test
    public void constantsValueTest() throws IllegalAccessException {
        List<Field> constants = getConstantFields(Constants.class);
        SoftAssert softAssert = new SoftAssert();
        for (Field constant : constants) {
            softAssert.assertEquals(constant.get(Constants.class), constant.getName(),
                    "Имя константы не соответствует значению");
        }
        softAssert.assertAll();
    }

    private List<Field> getConstantFields(Class<?> clazz) {
        List<Field> fields = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) &&
                    Modifier.isFinal(field.getModifiers()))
                fields.add(field);
        }
        return fields;
    }

}