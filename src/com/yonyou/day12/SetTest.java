package com.yonyou.day12;

import java.util.*;

/**
 * @Author 王佳鹏
 * @Date 2022/1/11 11:35
 * @Description
 */
public class SetTest {

    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("zhangsan",18));
        set.add(new Student("lisi",18));
        set.add(new Student("lisi",20));
        set.forEach(student -> System.out.println(student));

        new TreeSet<>();
    }


}


//自然排序
class Student implements Comparable{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Object o) {
        Student student =null;
        if (o instanceof Student){
             student= (Student)o;
        }
        int re= age-student.age;
        re= re==0?name.compareTo(student.name):re;
        return re;
    }

    @Override
    public String toString() {
        return  name  +"   "+ age ;
    }
}


//比较器
class MyComperator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {


        return ((Student) o1).getAge()-((Student) o2).getAge();
    }
}
