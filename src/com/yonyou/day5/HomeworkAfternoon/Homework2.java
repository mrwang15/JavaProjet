package com.yonyou.day5.HomeworkAfternoon;

import java.util.Scanner;

/**
 * 1����װ
 * ʹ�÷�װʵ�ֵ��ӳ���ϵͳ���������ȷ���뽡��ֵ�����ܶ�
 * ��֤����ֵ����Ч�ԣ�0-100��������ȡĬ��ֵ60
 * ��֤���ܶȵ���Ч�ԣ�0-100��������ȡĬ��ֵ60
 */
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penguin penguin = new Penguin();
        System.out.println("�������������");
        String name = scanner.next();
        penguin.setName(name);
        System.out.println("��������｡����");
        int health = scanner.nextInt();
        penguin.setHealth(health);
        System.out.println("�������������ܶ�");
        int intimacy = scanner.nextInt();
        penguin.setIntimacy(intimacy);
        System.out.println("���ĳ���"+penguin.getName()+"��������"+penguin.getHealth()+"���ܶ���"+penguin.getIntimacy());
    }

}
class Penguin{
    private String name;
    private int health=60;
    private int intimacy=60;

    public Penguin(String name, int health, int intimacy) {
        this.name =name;
        if (health>=0||health<=100) {
            this.health = health;
        }else {
            System.out.println("��������ֵ�����޸�ʧ��");

        }

        if (intimacy>=0||intimacy<=100) {
            this.health = health;
            System.out.println("���ܶ���ֵ�����޸�ʧ��");
        }
    }

    public Penguin() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>=0&&health<=100) {
            this.health = health;
        }else {
            System.out.println("��������ֵ����,�޸�ʧ��");
        }
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        if (intimacy>=0&&intimacy<=100) {
            this.intimacy = intimacy;
        }else {
            System.out.println("���ܶ���ֵ�����޸�ʧ��");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
