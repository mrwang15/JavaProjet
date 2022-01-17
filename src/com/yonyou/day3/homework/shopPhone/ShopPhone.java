package com.yonyou.day3.homework.shopPhone;

import java.util.Objects;
import java.util.Scanner;

public class ShopPhone {
    public static void main(String[] args) {
        System.out.println("请输入手机的总量:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Phone[] phones = new Phone[num];
        for(int i=0;i<num;i++){
            Phone phone= new Phone();
            System.out.println("输入手机名称");
            phone.setName(scanner.next());
            System.out.println("输入手机价格");
            phone.setPrice(scanner.nextDouble());
            System.out.println("输入手机状态");
            phone.setStatus(scanner.next());
            phones[i]=phone;
        }
        double min =phones[0].getPrice();
        for (int i=1;i<phones.length;i++){
            if (min>phones[i].getPrice()){
                min =phones[i].getPrice();
            }
        }
        System.out.println("最低价格为"+min);
        System.out.println("售出的手机为:");
        String shopPhone = scanner.next();
        for (int i =0;i<phones.length;i++){
            if (phones[i].getName().equals(shopPhone)){
                System.out.print(phones[i].getName()+"  ");
            }
        }

        System.out.println("未售出的手机为:");
        for (int i=0;i<phones.length;i++){
            if ("未售出".equals(phones[i].getStatus())){
                System.out.print(phones[i].getName()+"  ");
            }
        }

        System.out.println("售出的手机为:");
        for (int i=0;i<phones.length;i++){
            if ("售出".equals(phones[i].getStatus())){
                System.out.print(phones[i].getName()+"  ");
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