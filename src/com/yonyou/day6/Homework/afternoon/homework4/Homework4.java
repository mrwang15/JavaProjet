package com.yonyou.day6.Homework.afternoon.homework4;


/**
 * @Author ������
 * @Date 2022/1/3 18:52
 * @Description
 *  4. ʹ�ö�̬ʵ�������������ﲢ�������ˣ����
 * a. �����������ɵ��ķ���
 * b. ��������Ӿ�ķ���
 * c. �����빷��������ҵ��ˣ�����ܶȻ�����
 * d. ��ɵ�����Ӿ�ǹ���������������еķ�������ʹ��ʱ��Ҫע��
 * ����ת��
 */
public class Homework4 {
    public static void main(String[] args) {
        Pet dog = new Dog("������", 2, 10);
        Person person1 = new Person("����", dog);
        Pet  penguin= new Penguin("±����",2,100);
        Person person2 = new Person("����", penguin);
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
    //��ӡ������Ϣ
    public  void print(){
        System.out.println("��ĳ���"+name+"�Ľ�������"+health+"���������ܶ���"+intimacy);
    }


}

class Dog extends Pet {
    public Dog() {

    }

    public Dog(String name, Integer health, Integer intimacy) {
        super(name, health, intimacy);
    }
    //��д

    @Override
    public void print() {
        System.out.println("���Ĺ�"+getName()+"�Ľ�������"+getHealth()+"���������ܶ���"+getIntimacy());
    }


    //��ɵ�
    public void ufo(){
        System.out.println(getName()+"������ɵ�");
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
        System.out.println("�������"+getName()+"�Ľ�������"+getHealth()+"���������ܶ���"+getIntimacy());
    }

    //��ɵ�
    public void swim(){
        System.out.println(getName()+"������Ӿ");
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
        System.out.println(personName+"ι��"+pet.getName());
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