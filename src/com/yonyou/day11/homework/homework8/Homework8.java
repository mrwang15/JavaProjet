package com.yonyou.day11.homework.homework8;

import java.util.Date;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/10 16:49
 * @Description
 * 8、	创建一个Student类，
 * 包含姓名、性别（枚举类型）、生日（Date类型）。
 * 实例化两个类的对象，并说明谁的年龄大谁的年龄小。
 * 根据生日判断这个同学那天是星期几出生的。
 */
public class Homework8 {
    public static void main(String[] args) {
        Student zhangsan = new Student("zhangsan", Sex.NAN, new Date(1998, 01, 01));
        Student lisi = new Student("lisi", Sex.NAN, new Date(1998,8,15));
        if (zhangsan.getBirthday().getTime()>lisi.getBirthday().getTime()){
            System.out.println("lisi大");
        }else if(zhangsan.getBirthday().getTime()<lisi.getBirthday().getTime()){
            System.out.println("zhangsan大");
        }else {
            System.out.println("一样大");
        }
        System.out.println(week(zhangsan.getBirthday()));
        System.out.println(week(lisi.getBirthday()));

    }

    /**
     * 0是星期四 ，1 是星期五，一次往后推
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
    NAN("男"),NV("女");
    private String name;

   private Sex(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
