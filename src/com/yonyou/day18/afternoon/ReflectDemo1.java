package com.yonyou.day18.afternoon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 18:56
 * @Description
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        Method print11 =null;
        try {
             print11 = studentClass.getMethod("print",String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            Student student = studentClass.newInstance();
            print11.invoke(student,"niuniu");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

class Student{
    private String name;
    Integer age;
    public String sex;

    private Student(String name) {
        this.name = name;
    }

    private Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    protected Student(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void print(){
        System.out.println(name+"正在学习");
    }
    public void print(String ne){
        System.out.println(ne+"正在学习");
    }
    private void printt(){
        System.out.println("成功了成功了");
    }
}
