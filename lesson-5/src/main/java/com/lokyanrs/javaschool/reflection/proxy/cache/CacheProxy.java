package com.lokyanrs.javaschool.reflection.proxy.cache;

import com.lokyanrs.javaschool.calculator.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheProxy.class);

    private final Calculator calculator;

    private Map<Integer, Integer> cache = new HashMap<>();

    public CacheProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    public static <T> T newProxyFactory(Calculator calculator) {
        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                calculator.getClass().getInterfaces(),
                new CacheProxy(calculator));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(Cache.class)) {
            int argument = (int) args[0];
            if (cache.containsKey(argument)){
                LOGGER.info("Значение метода {} с аргументами {} взято из кэша", method.getName(), args);
                return cache.get(argument);}
            else {
                LOGGER.info("Значение метода {} с аргументами {} было посчитано и будет занесено в кэш", method.getName(), args);
                int result = (int) method.invoke(calculator, args);
                cache.put(argument, result);
                return result;
            }
        }
        return method.invoke(calculator, args);
    }
}
