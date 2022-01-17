package com.hebau.yonyou.day03.shopPhone;


import java.util.Scanner;

/**
 * 作业二：
 * 求手机的最低价格
 * 可以将指定的手机销售掉，然后在遍历的时候能够显示出该手机的销售状态。
 * 遍历所有已经销售的手机价格
 * 遍历所有没有销售的手机价格
 * 0未出售 1出售
 */
public class ShopPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone[] phones = new Phone[3];
        System.out.println("请输入手机的相关信息：");
        for (int i = 0; i < phones.length; i++) {
            Phone phone = new Phone();
            System.out.println("请输入手机价格：");
            double price = scanner.nextDouble();
            phone.setPrice(price);

            System.out.println("请输入手机名称：");
            String name = scanner.next();
            phone.setName(name);

            System.out.println("请输入手机销售状态：");
            String status = scanner.next();
            phone.setStatus(status);

            phones[i] = phone;
        }

        double min = phones[0].getPrice();

        for (int i = 1; i <phones.length ; i++) {
            if(phones[i].getPrice()<min){
                min = phones[i].getPrice();
            }
        }

        System.out.println("最便宜的手机价格为："+min);

        System.out.println("销售指定的手机：");
        String phoneName = scanner.next();
        for (Phone p:phones) {
            if(p.getName().equals(phoneName)){
                p.setStatus("1");
            }
        }

        //System.out.println();
        System.out.println("销售的手机：");
        for (Phone p:phones) {
            if(p.getStatus().equals("1")){
                System.out.print(" "+p.getName());
            }
        }
        System.out.println();

        System.out.println("没有销售的手机：");
        for (Phone p:phones) {
            if(p.getStatus().equals("0")){
                System.out.print(" "+p.getName());
            }
        }


    }
}

class Phone{
    private double price;
    private String status;
    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}