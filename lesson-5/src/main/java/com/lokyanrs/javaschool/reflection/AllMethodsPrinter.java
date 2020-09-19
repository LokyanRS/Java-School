package com.lokyanrs.javaschool.reflection;

import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class AllMethodsPrinter {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AllMethodsPrinter.class);

    public static void main(String[] args) {
        printMethods(C.class);
    }

    /**
     * Вывести на консоль все методы класса, включая все родительские методы
     */
    public static void printMethods(Class<?> clazz) {
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            LOGGER.info("Method from class {}: {}", clazz.getSimpleName(), declaredMethod.getName());
        }
        if (clazz.getSuperclass() != null)
            printMethods(clazz.getSuperclass());
    }


}
class A {
    public void publicMethodFromClassA(){
        // empty method
    }
    private void privateMethodFromClassA(){
        // empty method
    }
}

class B  extends  A{
    public void publicMethodFromClassB(){
        // empty method
    }

    private void privateMethodFromClassB(){
        // empty method
    }
}

class C  extends B{
    public void publicMethodFromClassC(){
        // empty method
    }

    private void privateMethodFromClassC(){
        // empty method
    }
}