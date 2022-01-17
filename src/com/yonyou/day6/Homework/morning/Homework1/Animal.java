package com.yonyou.day6.Homework.morning.Homework1;

/**
 * @Author 王佳鹏
 * @Date 2022/1/3 16:22
 * @Description
 *  动物类
 */

public class Animal {
    private String name;
    private char sex;

    public Animal() {
    }

    public Animal(String name, char sex) {
        this.name = name;
        this.sex = sex;
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
}
