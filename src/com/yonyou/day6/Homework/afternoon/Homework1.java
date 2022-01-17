package com.yonyou.day6.Homework.afternoon;

/**
 * @Author 王佳鹏
 * @Date 2022/1/3 17:09
 * @Description
 * 1. 使用重写优化电子宠物系统
 * a. 创建宠物类，包含昵称、健康值（0~100之间）和主人的亲密度
 * （0~100）包含一个print方法，打印宠物信息
 * b. 创建狗狗类，继承宠物类，通过构造方法初始化狗狗的信息，重
 * 写print方法，打印宠物和狗狗自身的特征。
 * c. 创建切类，继承宠物类。通过构造方法初始化企业的信息，重写
 * print方法，打印宠物和企业的信息。
 * d. 创建测试类，完成对上述功能的测试
 */
public class Homework1 {
    public static void main(String[] args) {
        Pet dog =new Dog("付怡川",1,200);
        Pet penguin= new Penguin("卤狗蛋",2,100);
        dog.print();
        penguin.print();
    }
}
class Pet{
    private String name;
    private Integer health;
    private Integer intimacy;

    public Pet() {
    }

    public Pet(String name, Integer health, Integer intimacy) {
        this.name = name;
        this.health = health;
        this.intimacy = intimacy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Integer intimacy) {
        this.intimacy = intimacy;
    }
    //打印宠物信息
    public  void print(){
        System.out.println("你的宠物"+name+"的健康度是"+health+"和您的亲密度是"+intimacy);
    }

}

class Dog extends Pet{
    public Dog() {

    }

    public Dog(String name, Integer health, Integer intimacy) {
        super(name, health, intimacy);
    }
    //重写

    @Override
    public void print() {
        System.out.println("您的狗"+getName()+"的健康度是"+getHealth()+"和您的亲密度是"+getIntimacy());
    }



}

/**
 * c. 创建切类，继承宠物类。通过构造方法初始化企业的信息，重写
 *  * print方法，打印宠物和企业的信息。
 */
class Penguin extends Pet {
    public Penguin() {
    }

    public Penguin(String name, Integer health, Integer intimacy) {
        super(name, health, intimacy);
    }

    @Override
    public void print() {
        System.out.println("您的企鹅"+getName()+"的健康度是"+getHealth()+"和您的亲密度是"+getIntimacy());
    }
}
