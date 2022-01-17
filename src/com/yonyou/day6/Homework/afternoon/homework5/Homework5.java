package com.yonyou.day6.Homework.afternoon.homework5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author ������
 * @Date 2022/1/3 19:11
 * @Description
 *
 * 5. ��ӡ��Ʒ�۸�
 * a. ������Ʒ�࣬������ӡ��Ʒ�۸�ķ���
 * b. ���������࣬�̳�����Ʒ��
 * c. ����ʳƷ�࣬�̳�����Ʒ��
 * d. ���������࣬���ݴ��ݵ��ַ������ض�Ӧ������
 * e. ���������࣬��ӡ��ͬ��Ʒ�ļ۸�
 */
public class Homework5 {
    public static void main(String[] args) {
        Shop haier = new TV("haier", 1222.12);
        haier.printPrice();
        Shop food = new Food("�óԵ�", 100);
        food.printPrice();
        Factory factory = new Factory(haier);
        Factory factory1 = new Factory(food);
        factory.leiXing();
        factory1.leiXing();

    }
}
class Shop{
    private String shopName;
    private double price;

    public Shop(String shopName, double price) {
        this.shopName = shopName;
        this.price = price;
    }

    public Shop() {
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printPrice(){
        System.out.println(shopName+"�ļ۸���"+price);
    }
}

/*
* ���������࣬�̳�����Ʒ��
* */
class TV extends Shop{
    public TV() {
    }

    public TV(String shopName, double price) {
        super(shopName, price);
    }

    @Override
    public void printPrice() {
        System.out.println("���ӻ�"+getShopName()+"�ļ۸���"+getPrice());
    }
}

//����ʳƷ�࣬�̳�����Ʒ��
class Food extends Shop{
    public Food() {
    }

    public Food(String shopName, double price) {
        super(shopName, price);
    }

    @Override
    public void printPrice() {
        System.out.println("ʳƷ"+getShopName()+"�ļ۸���"+getPrice());
    }
}

//���������࣬���ݴ��ݵ��ַ������ض�Ӧ������
class Factory{
    private Shop shop;

    public Factory(Shop shop) {
        this.shop = shop;
    }

    public Factory() {
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void leiXing(){
        if (shop instanceof Food){
            System.out.println("Food����");
        }else if(shop instanceof TV){
            System.out.println("TV����");
        }
    }
}