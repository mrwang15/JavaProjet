package com.yonyou.day12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/11 15:35
 * @Description
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<Student1> set = new HashSet<>();
        set.add(new Student1("niu",18));
        set.add(new Student1("niu",18));
        set.add(new Student1("niu",19));
        set.add(new Student1("ta",19));
        set.forEach(s-> System.out.println(s));
    }
}


class Student1{
    private  String name;
    private  Integer age;

    public Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student1() {
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
        Student1 student1 = (Student1) o;
        return Objects.equals(name, student1.name);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
