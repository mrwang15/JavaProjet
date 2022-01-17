package com.yonyou.day10.homework.homework2;


import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 16:52
 * @Description
 * 1、编写一个Person类，使用Override注解它的toString方法
 *
 * 2、自定义一个名为“MyTiger”的注解类型，它只可以使用在方法上，带一个String类型的value属
 * 性，然后在第1题中的Person类上正确使用。
 *
 * 3、通过反射读取该注解当中的属性值
 *
 */
public class Homework2 {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();

        Class person=Person.class;
        Method method = person.getMethod("getSx");
        MyTiger annotation = method.getAnnotation(MyTiger.class);
        System.out.println(annotation);

    }
}


class Person{
    private String name;
    private  char sx;

    public Person(String name, char sx) {
        this.name = name;
        this.sx = sx;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MyTiger(value = "这个")
    public char getSx() {
        return sx;
    }


    public void setSx(char sx) {
        this.sx = sx;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sx=" + sx ;
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
 @interface MyTiger{
  String value();

}
