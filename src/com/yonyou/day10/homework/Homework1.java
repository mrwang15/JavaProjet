package com.yonyou.day10.homework;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 16:41
 * @Description
 *
 * 题目：为java岗位定义三个阶段的学习目标，三个阶段分别用L1、L2、L3表示
 * L1：初级java工程师、L2：中级java工程师、L3：高级java工程师
 */
public class Homework1 {
    public static void main(String[] args) {
        System.out.println(Stage.L2);
        new Person("卤狗蛋",Stage.L2.getStage());
    }
}

class Person{
    private String name;
    private String stage;

    public Person(String name, String stage) {
        this.name = name;
        this.stage = stage;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
