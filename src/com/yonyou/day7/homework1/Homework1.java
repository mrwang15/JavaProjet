package com.yonyou.day7.homework1;

/**
 * @Author ������
 * @Date 2022/1/4 18:39
 * @Description
 *      1.  ʹ�����������ɣ�ʵ������ι������
 *      Ҫ��ʹ�ýӿ���ɣ�Ҳ����ʵ�ο��Ա�дΪ�����ڲ������
 */
public class Homework1 {
    public static void main(String[] args) {
        Pet pet = new Pet("±����");
        Person person = new Person("������", pet);
        person.feed1(new Feed() {
            @Override
            public void feed() {
                System.out.println(person.getName()+"ι��"+pet.getName());
            }
        });
    }

}

interface Feed{
    void feed();
}

class Pet{
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Person {
    private  String name;
    private Pet pet;

    public Person() {

    }

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void feed1(Feed feed) {
        feed.feed();
    }
}