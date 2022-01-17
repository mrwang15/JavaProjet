package com.yonyou.day7.homework7;

import javafx.scene.AmbientLight;

/**
 * @Author 王佳鹏
 * @Date 2022/1/4 19:45
 * @Description
 *   7.  声明一个动物类，包含一个抽象的eat方法，在测试类当中创建一个该抽象类的匿名内部类对象并调用这个eat方法。
 *
 */
public class Homework7 {
    public static void main(String[] args) {
        new Animal() {
            @Override
            void eat() {
                System.out.println("吃东西");
            }
        }.eat();
    }
}

abstract class Animal{
    abstract void eat();
}
