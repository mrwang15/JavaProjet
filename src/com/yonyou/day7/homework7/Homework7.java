package com.yonyou.day7.homework7;

import javafx.scene.AmbientLight;

/**
 * @Author ������
 * @Date 2022/1/4 19:45
 * @Description
 *   7.  ����һ�������࣬����һ�������eat�������ڲ����൱�д���һ���ó�����������ڲ�����󲢵������eat������
 *
 */
public class Homework7 {
    public static void main(String[] args) {
        new Animal() {
            @Override
            void eat() {
                System.out.println("�Զ���");
            }
        }.eat();
    }
}

abstract class Animal{
    abstract void eat();
}
