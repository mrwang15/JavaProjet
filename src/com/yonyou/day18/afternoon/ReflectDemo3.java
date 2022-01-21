package com.yonyou.day18.afternoon;

import java.lang.reflect.Field;

/**
 * @Author ������
 * @Date 2022/1/19 19:15
 * @Description
 *  //��ȡ����  Filed
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        Field name = aClass.getDeclaredField("name");
        System.out.println(name.getName());
        System.out.println("====================");
        //��student��name���Ը�ֵ
        //��Ϊname������˽�еģ�������Ҫ����ȡ�����ʼ��
        name.setAccessible(true);
        name.set(student,"peng");
        String s = (String)name.get(student);
        System.out.println(s);
        System.out.println("=======================");
        //��ȡ���е�����
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        System.out.println("========================");
        //��ȡ���й�������
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }


    }
}
