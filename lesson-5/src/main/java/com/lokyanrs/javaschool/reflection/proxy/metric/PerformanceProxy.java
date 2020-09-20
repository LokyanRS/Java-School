package com.lokyanrs.javaschool.reflection.proxy.metric;

import com.lokyanrs.javaschool.calculator.Calculator;
import com.lokyanrs.javaschool.reflection.proxy.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PerformanceProxy implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceProxy.class);

    private final Object delegate;

    public PerformanceProxy(Object delegate) {
        this.delegate = delegate;
    }

    public static <T> T newProxyFactory(Calculator calculator) {
        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                calculator.getClass().getInterfaces(),
                new PerformanceProxy(calculator));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(Metric.class)) {
            long start = System.nanoTime();
            Object object = method.invoke(this.delegate, args);
            long end = System.nanoTime();
            LOGGER.info("Время работы метода: {} наносекунд", end - start);
            return object;
        }
        return method.invoke(this.delegate, args);
    }
}
