package com.yonyou.day18.afternoon;

import java.lang.reflect.Field;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 19:15
 * @Description
 *  //获取属性  Filed
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        Field name = aClass.getDeclaredField("name");
        System.out.println(name.getName());
        System.out.println("====================");
        //给student的name属性赋值
        //因为name属性是私有的，所以需要设置取消访问检查
        name.setAccessible(true);
        name.set(student,"peng");
        String s = (String)name.get(student);
        System.out.println(s);
        System.out.println("=======================");
        //获取所有的属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        System.out.println("========================");
        //获取所有公开属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }


    }
}
