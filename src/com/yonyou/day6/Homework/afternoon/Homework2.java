package com.yonyou.day6.Homework.afternoon;

import java.util.Objects;

/**
 * @Author 王佳鹏
 * @Date 2022/1/3 17:18
 * @Description
 *
 * 2. 重写equals方法
 * a. 创建学生类，重写Object类的equals方法，判断两个学生身份是
 * 否为同一个人（判断依据就是学号、姓名、性别、年龄全部相等）
 */
public class Homework2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.equals(student2));
    }
}

class Student{
    private String name;
    private Character sex;
    private String StuNum;
    private Integer age;

    public Student() {
    }

    public Student(String name, char sex, String stuNum, Integer age) {
        this.name = name;
        this.sex = sex;
        StuNum = stuNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getStuNum() {
        return StuNum;
    }

    public void setStuNum(String stuNum) {
        StuNum = stuNum;
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
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(StuNum, student.StuNum) &&
                Objects.equals(age, student.age);
    }

}
