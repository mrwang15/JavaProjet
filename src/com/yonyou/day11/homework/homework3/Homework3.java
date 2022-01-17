package com.yonyou.day11.homework.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author ������
 * @Date 2022/1/10 16:11
 * @Description
 *  3��	ʹ��ArrayList����һ��Person���󣨰������������䣩����д���뽫��һ��������ظ�������ȥ��������ͼ��ʾ��
 */
public class Homework3 {
    public static void main(String[] args) {
    List<Person> list = new ArrayList<>();
    list.add(new Person("wang",18));
    list.add(new Person("wang",18));
    list.add(new Person("lisi",18));
        list = deduplication(list);
        System.out.println(list);

    }

    public static List deduplication(List<Person> list){
        List<Person> list1 = new ArrayList<>();
        list.forEach(person -> {
            if(!list1.contains(person)){
                list1.add(person);
            }
        });
        return list1;
    }
}

class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }


    @Override
    public String toString() {
        return  name +"    "+ age ;
    }
}
