package com.yonyou.day18.afternoon;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 19:05
 * @Description
 *      获取构造方法
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> student = Class.forName("com.yonyou.day18.afternoon.Student");

        Constructor<?> constructor = student.getDeclaredConstructor(String.class);
        System.out.println(constructor);
        constructor.setAccessible(true);
        Student ss = (Student)constructor.newInstance("ss");
        ss.print();
        System.out.println("==============");
        Constructor<?>[] constructors = student.getConstructors();
        for (Constructor<?> constructor1 : constructors) {
            System.out.println(constructor1);
        }
        System.out.println("================");
        System.out.println(student.getDeclaredConstructor());
        System.out.println("=================");

        Constructor<?>[] declaredConstructors = student.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
