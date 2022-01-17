package com.yonyou.day11.homework.homework8;

import java.util.Date;
import java.util.Scanner;

/**
 * @Author ������
 * @Date 2022/1/10 16:49
 * @Description
 * 8��	����һ��Student�࣬
 * �����������Ա�ö�����ͣ������գ�Date���ͣ���
 * ʵ����������Ķ��󣬲�˵��˭�������˭������С��
 * ���������ж����ͬѧ���������ڼ������ġ�
 */
public class Homework8 {
    public static void main(String[] args) {
        Student zhangsan = new Student("zhangsan", Sex.NAN, new Date(1998, 01, 01));
        Student lisi = new Student("lisi", Sex.NAN, new Date(1998,8,15));
        if (zhangsan.getBirthday().getTime()>lisi.getBirthday().getTime()){
            System.out.println("lisi��");
        }else if(zhangsan.getBirthday().getTime()<lisi.getBirthday().getTime()){
            System.out.println("zhangsan��");
        }else {
            System.out.println("һ����");
        }
        System.out.println(week(zhangsan.getBirthday()));
        System.out.println(week(lisi.getBirthday()));

    }

    /**
     * 0�������� ��1 �������壬һ��������
     * @param date
     * @return
     */
    public static int week(Date date){
        long time = date.getTime();
        int day= (int)time/(24*60*60*1000);
        return day%7;

    }
}

class Student{
    private  String name;
    private Sex sex;
    private Date birthday;

    public Student(String name, Sex sex, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

enum Sex{
    NAN("��"),NV("Ů");
    private String name;

   private Sex(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
