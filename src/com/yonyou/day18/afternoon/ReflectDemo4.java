package com.yonyou.day18.afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 19:33
 * @Description
 *      获取成员方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("application.properties");
        Properties properties = new Properties();

        properties.load(resourceAsStream);

        Class<?> aClass = Class.forName((String) properties.get("class"));
        //获取所有的公开的成员方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("===============");
        //获取本类所有的方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("===================");
        System.out.println(aClass.getDeclaredMethod("printt"));


        //调用
        Method print = aClass.getDeclaredMethod("printt");
        Object o = aClass.newInstance();
        print.setAccessible(true);
        print.invoke(o);


    }
}
