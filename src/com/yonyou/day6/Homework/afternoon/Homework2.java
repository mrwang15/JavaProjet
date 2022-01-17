package com.yonyou.day6.Homework.afternoon;

import java.util.Objects;

/**
 * @Author ������
 * @Date 2022/1/3 17:18
 * @Description
 *
 * 2. ��дequals����
 * a. ����ѧ���࣬��дObject���equals�������ж�����ѧ�������
 * ��Ϊͬһ���ˣ��ж����ݾ���ѧ�š��������Ա�����ȫ����ȣ�
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
