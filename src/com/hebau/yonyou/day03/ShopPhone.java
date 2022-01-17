package com.hebau.yonyou.day03.shopPhone;


import java.util.Scanner;

/**
 * ��ҵ����
 * ���ֻ�����ͼ۸�
 * ���Խ�ָ�����ֻ����۵���Ȼ���ڱ�����ʱ���ܹ���ʾ�����ֻ�������״̬��
 * ���������Ѿ����۵��ֻ��۸�
 * ��������û�����۵��ֻ��۸�
 * 0δ���� 1����
 */
public class ShopPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone[] phones = new Phone[3];
        System.out.println("�������ֻ��������Ϣ��");
        for (int i = 0; i < phones.length; i++) {
            Phone phone = new Phone();
            System.out.println("�������ֻ��۸�");
            double price = scanner.nextDouble();
            phone.setPrice(price);

            System.out.println("�������ֻ����ƣ�");
            String name = scanner.next();
            phone.setName(name);

            System.out.println("�������ֻ�����״̬��");
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

        System.out.println("����˵��ֻ��۸�Ϊ��"+min);

        System.out.println("����ָ�����ֻ���");
        String phoneName = scanner.next();
        for (Phone p:phones) {
            if(p.getName().equals(phoneName)){
                p.setStatus("1");
            }
        }

        //System.out.println();
        System.out.println("���۵��ֻ���");
        for (Phone p:phones) {
            if(p.getStatus().equals("1")){
                System.out.print(" "+p.getName());
            }
        }
        System.out.println();

        System.out.println("û�����۵��ֻ���");
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