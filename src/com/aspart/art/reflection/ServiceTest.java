package com.aspart.art.reflection;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ServiceTest {

        @SuppressWarnings({ "rawtypes", "unchecked" })
        public static void main(String[] args) throws FileNotFoundException, IOException,
                        ClassNotFoundException, NoSuchMethodException, SecurityException,
                        InstantiationException, IllegalAccessException,
                        IllegalArgumentException, InvocationTargetException {
                File spring = new File("D:\\workspace\\learn\\src\\spring.txt");
                Properties springConfig = new Properties();
                springConfig.load(new FileInputStream(spring));
                String className = (String) springConfig.get("class");
                String methodName = (String) springConfig.get("method");

                Class clazz = Class.forName(className);
                Method m = clazz.getMethod(methodName);
                Constructor c = clazz.getConstructor();
                Object service = c.newInstance();
                m.invoke(service);
        }
}
