package com.yonyou.day6.Homework.afternoon;

/**
 * @Author ������
 * @Date 2022/1/3 17:09
 * @Description
 * 1. ʹ����д�Ż����ӳ���ϵͳ
 * a. ���������࣬�����ǳơ�����ֵ��0~100֮�䣩�����˵����ܶ�
 * ��0~100������һ��print��������ӡ������Ϣ
 * b. ���������࣬�̳г����࣬ͨ�����췽����ʼ����������Ϣ����
 * дprint��������ӡ����͹��������������
 * c. �������࣬�̳г����ࡣͨ�����췽����ʼ����ҵ����Ϣ����д
 * print��������ӡ�������ҵ����Ϣ��
 * d. ���������࣬��ɶ��������ܵĲ���
 */
public class Homework1 {
    public static void main(String[] args) {
        Pet dog =new Dog("������",1,200);
        Pet penguin= new Penguin("±����",2,100);
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
    //��ӡ������Ϣ
    public  void print(){
        System.out.println("��ĳ���"+name+"�Ľ�������"+health+"���������ܶ���"+intimacy);
    }

}

class Dog extends Pet{
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



}

/**
 * c. �������࣬�̳г����ࡣͨ�����췽����ʼ����ҵ����Ϣ����д
 *  * print��������ӡ�������ҵ����Ϣ��
 */
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
}
