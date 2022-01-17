package com.yonyou.day10.homework.homework2;


import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @Author ������
 * @Date 2022/1/8 16:52
 * @Description
 * 1����дһ��Person�࣬ʹ��Overrideע������toString����
 *
 * 2���Զ���һ����Ϊ��MyTiger����ע�����ͣ���ֻ����ʹ���ڷ����ϣ���һ��String���͵�value��
 * �ԣ�Ȼ���ڵ�1���е�Person������ȷʹ�á�
 *
 * 3��ͨ�������ȡ��ע�⵱�е�����ֵ
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

    @MyTiger(value = "���")
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
