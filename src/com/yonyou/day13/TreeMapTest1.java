package com.yonyou.day13;

import sun.dc.pr.PRError;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author 王佳鹏
 * @Date 2022/1/12 13:56
 * @Description
 *  :创建一个TreeMap集合,键是学生对象(Student),值是籍贯(String),学生属性姓名和年龄,按照年龄进行排序并遍历
 *     要求按照学生的年龄进行排序,如果年龄相同则按照姓名进行排序
 */
public class TreeMapTest1 {
    public static void main(String[] args) {
        Map<Student,String> map= new TreeMap<>();
        map.put(new Student("zhangsan",18),"重创");
        map.put(new Student("zhangsan2",183),"重创");
        map.put(new Student("zhangsan2",181),"重创");
        map.put(new Student("zhangsan",18),"重创");
        map.forEach((S,s)-> System.out.println(S+"家住"+s));
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
