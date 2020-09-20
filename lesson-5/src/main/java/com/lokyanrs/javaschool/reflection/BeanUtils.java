package com.lokyanrs.javaschool.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) throws InvocationTargetException, IllegalAccessException {
        for (Method methodFrom : from.getClass().getMethods()) {
            if (isGetter(methodFrom)) {
                for (Method methodTo : to.getClass().getMethods()) {
                    if (isSetter(methodTo) &&
                            methodFrom.getName().substring(3).equals(methodTo.getName().substring(3)) &&
                            isSameClassOrSubclass(methodTo.getParameters()[0].getType(), methodFrom.getReturnType()))
                        methodTo.invoke(to, methodFrom.invoke(from));
                }
            }
        }
    }

    private static boolean isGetter(Method method) {
        return method.getName().startsWith("get") &&
                method.getParameterCount() == 0 &&
                !method.getReturnType().equals(void.class);
    }


    private static boolean isSetter(Method method) {
        return method.getName().startsWith("set") &&
                method.getParameterCount() == 1;
    }

    private static boolean isSameClassOrSubclass(Class<?> to, Class<?> from) {
        if (from.equals(to))
            return true;
        try {
            from.asSubclass(to);
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }
}
