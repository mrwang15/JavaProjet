package com.yonyou.day3.homework.shopPhone;

import java.util.Objects;
import java.util.Scanner;

public class ShopPhone {
    public static void main(String[] args) {
        System.out.println("�������ֻ�������:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Phone[] phones = new Phone[num];
        for(int i=0;i<num;i++){
            Phone phone= new Phone();
            System.out.println("�����ֻ�����");
            phone.setName(scanner.next());
            System.out.println("�����ֻ��۸�");
            phone.setPrice(scanner.nextDouble());
            System.out.println("�����ֻ�״̬");
            phone.setStatus(scanner.next());
            phones[i]=phone;
        }
        double min =phones[0].getPrice();
        for (int i=1;i<phones.length;i++){
            if (min>phones[i].getPrice()){
                min =phones[i].getPrice();
            }
        }
        System.out.println("��ͼ۸�Ϊ"+min);
        System.out.println("�۳����ֻ�Ϊ:");
        String shopPhone = scanner.next();
        for (int i =0;i<phones.length;i++){
            if (phones[i].getName().equals(shopPhone)){
                System.out.print(phones[i].getName()+"  ");
            }
        }

        System.out.println("δ�۳����ֻ�Ϊ:");
        for (int i=0;i<phones.length;i++){
            if ("δ�۳�".equals(phones[i].getStatus())){
                System.out.print(phones[i].getName()+"  ");
            }
        }

        System.out.println("�۳����ֻ�Ϊ:");
        for (int i=0;i<phones.length;i++){
            if ("�۳�".equals(phones[i].getStatus())){
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