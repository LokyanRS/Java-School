package com.lokyanrs.javaschool.reflection;

import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class GetterPrinter {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GetterPrinter.class);

    public static void main(String[] args) {
        Class<ClassWithGetters> clazz = ClassWithGetters.class;
        for (Method method : clazz.getMethods()) {
            if (method.getName().startsWith("get") &&
                    method.getParameterCount() == 0 &&
                    !method.getReturnType().equals(void.class))
                LOGGER.info("Getter for class {}: {}", clazz.getSimpleName(), method.getName());
        }
    }
}

class ClassWithGetters {
    int fieldOne;
    String fieldTwo;
    double fieldThree;
    float fieldFour;
    long fieldFive;

    public int getFieldOne() {
        return fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public double getFieldThree() {
        return fieldThree;
    }

    public float getFieldFour() {
        return fieldFour;
    }

    public long getFieldFive() {
        return fieldFive;
    }

    public void notGetter() {
        // empty method
    }

}
