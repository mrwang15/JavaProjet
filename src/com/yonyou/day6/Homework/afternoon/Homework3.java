package com.yonyou.day6.Homework.afternoon;

/**
 * @Author 王佳鹏
 * @Date 2022/1/3 17:37
 * @Description
 *
 * 3. 使用多态实现为宠物喂食
 * a. 宠物类有个吃东西的方法（抽象方法）
 * b. 子类实现父类的方法
 * c. 创建人类，包括一个喂宠物的方法
 * d. 编写测试类
 */
public class Homework3 {
    public static void main(String[] args) {
        ChWu dog =new Dogg("lugoudan");
        Person person= new Person("鹏哥",dog);
        person.feed();
    }
}

abstract class ChWu{
    private String ChWu_Name;

    public ChWu(String chWu_Name) {
        ChWu_Name = chWu_Name;
    }

    public ChWu() {

    }

    public String getChWu_Name() {
        return ChWu_Name;
    }

    public void setChWu_Name(String chWu_Name) {
        ChWu_Name = chWu_Name;
    }

    public abstract void eat();
}

class Dogg extends ChWu{
    public Dogg(String chWu_Name) {
        super(chWu_Name);
    }

    public Dogg() {
    }

    @Override
    public void eat() {
        System.out.println("卤狗蛋在吃");
    }
}

class Person{
    private String personName;
    private ChWu chWu;

    public Person() {
    }

    public Person(String personName, ChWu chWu) {
        this.personName = personName;
        this.chWu = chWu;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public ChWu getChWu() {
        return chWu;
    }

    public void setChWu(ChWu chWu) {
        this.chWu = chWu;
    }

    public void feed(){
        System.out.println(personName+"喂养"+chWu.getChWu_Name());
    }
}
