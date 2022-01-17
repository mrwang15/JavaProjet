package com.yonyou.day5.HomeworkAfternoon;

import java.util.Scanner;

/**
 * 1、封装
 * 使用封装实现电子宠物系统的企鹅类正确输入健康值和亲密度
 * 保证健康值的有效性（0-100），否则取默认值60
 * 保证亲密度的有效性（0-100），否则取默认值60
 */
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penguin penguin = new Penguin();
        System.out.println("请输入宠物姓名");
        String name = scanner.next();
        penguin.setName(name);
        System.out.println("请输入宠物健康度");
        int health = scanner.nextInt();
        penguin.setHealth(health);
        System.out.println("请输入宠物的亲密度");
        int intimacy = scanner.nextInt();
        penguin.setIntimacy(intimacy);
        System.out.println("您的宠物"+penguin.getName()+"健康度是"+penguin.getHealth()+"亲密度是"+penguin.getIntimacy());
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
            System.out.println("健康度数值错误，修改失败");

        }

        if (intimacy>=0||intimacy<=100) {
            this.health = health;
            System.out.println("亲密度数值错误，修改失败");
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
            System.out.println("健康度数值错误,修改失败");
        }
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        if (intimacy>=0&&intimacy<=100) {
            this.intimacy = intimacy;
        }else {
            System.out.println("亲密度数值错误，修改失败");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
