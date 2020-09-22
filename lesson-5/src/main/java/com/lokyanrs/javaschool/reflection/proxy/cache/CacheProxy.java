package com.lokyanrs.javaschool.reflection.proxy.cache;

import com.lokyanrs.javaschool.calculator.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheProxy.class);

    private final Object object;

    private Map<Integer, Object> cache = new HashMap<>();

    public CacheProxy(Object object) {
        this.object = object;
    }

    public static <T> T newProxyFactory(Object object) {
        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                object.getClass().getInterfaces(),
                new CacheProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(Cache.class)) {
            int hashCode = Arrays.hashCode(args);
            if (cache.containsKey(hashCode)){
                LOGGER.info("Значение метода {} с аргументами {} взято из кэша", method.getName(), args);
                return cache.get(hashCode);}
            else {
                LOGGER.info("Значение метода {} с аргументами {} было посчитано и будет занесено в кэш", method.getName(), args);
                Object result = method.invoke(object, args);
                cache.put(hashCode, result);
                return result;
            }
        }
        return method.invoke(object, args);
    }
}
