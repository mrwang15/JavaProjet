package com.yonyou.day10.homework;

/**
 * @Author ������
 * @Date 2022/1/8 16:41
 * @Description
 *
 * ��Ŀ��Ϊjava��λ���������׶ε�ѧϰĿ�꣬�����׶ηֱ���L1��L2��L3��ʾ
 * L1������java����ʦ��L2���м�java����ʦ��L3���߼�java����ʦ
 */
public class Homework1 {
    public static void main(String[] args) {
        System.out.println(Stage.L2);
        new Person("±����",Stage.L2.getStage());
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
