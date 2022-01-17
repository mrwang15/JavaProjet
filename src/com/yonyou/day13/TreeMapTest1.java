package com.yonyou.day13;

import sun.dc.pr.PRError;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author ������
 * @Date 2022/1/12 13:56
 * @Description
 *  :����һ��TreeMap����,����ѧ������(Student),ֵ�Ǽ���(String),ѧ����������������,��������������򲢱���
 *     Ҫ����ѧ���������������,���������ͬ����������������
 */
public class TreeMapTest1 {
    public static void main(String[] args) {
        Map<Student,String> map= new TreeMap<>();
        map.put(new Student("zhangsan",18),"�ش�");
        map.put(new Student("zhangsan2",183),"�ش�");
        map.put(new Student("zhangsan2",181),"�ش�");
        map.put(new Student("zhangsan",18),"�ش�");
        map.forEach((S,s)-> System.out.println(S+"��ס"+s));
    }

}


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
        Student student= (Student)o;
        int re =age-student.getAge();
        re= re==0?name.compareTo(student.getName()):re;
        return re;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
