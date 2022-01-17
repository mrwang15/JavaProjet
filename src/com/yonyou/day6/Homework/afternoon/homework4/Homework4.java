package com.yonyou.day6.Homework.afternoon.homework4;


/**
 * @Author 王佳鹏
 * @Date 2022/1/3 18:52
 * @Description
 *  4. 使用多态实现主人领养宠物并与宠物玩耍功能
 * a. 狗狗类包含玩飞碟的方法
 * b. 企鹅包括游泳的方法
 * c. 主人与狗狗或者企业玩耍后亲密度会提升
 * d. 玩飞碟和游泳是狗狗与企鹅自身特有的方法，在使用时需要注意
 * 向下转型
 */
public class Homework4 {
    public static void main(String[] args) {
        Pet dog = new Dog("付怡川", 2, 10);
        Person person1 = new Person("鹏哥", dog);
        Pet  penguin= new Penguin("卤狗蛋",2,100);
        Person person2 = new Person("鹏哥", penguin);
        person1.play();
        person2.play();
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

class Dog extends Pet {
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


    //玩飞碟
    public void ufo(){
        System.out.println(getName()+"正在玩飞碟");
    }


}

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

    //玩飞碟
    public void swim(){
        System.out.println(getName()+"正在游泳");
    }
}

class Person{
    private String personName;
    private Pet pet;

    public Person() {
    }

    public Person(String personName, Pet pet) {
        this.personName = personName;
        this.pet = pet;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void feed(){
        System.out.println(personName+"喂养"+pet.getName());
    }
    public void play(){
        if (pet instanceof Dog){
           Dog dog=  (Dog)pet;
           dog.ufo();
        }
        if (pet instanceof Penguin){
            Penguin penguin=  (Penguin)pet;
            penguin.swim();
        }
        Integer intimacy = pet.getIntimacy();
        pet.setIntimacy(++intimacy);
        pet.print();
    }
}