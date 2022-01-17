package com.yonyou.day6.Homework.afternoon.homework5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author 王佳鹏
 * @Date 2022/1/3 19:11
 * @Description
 *
 * 5. 打印商品价格
 * a. 创建商品类，包含打印商品价格的方法
 * b. 创建电视类，继承自商品类
 * c. 创建食品类，继承自商品类
 * d. 创建工厂类，根据传递的字符串返回对应的类型
 * e. 创建测试类，打印不同商品的价格
 */
public class Homework5 {
    public static void main(String[] args) {
        Shop haier = new TV("haier", 1222.12);
        haier.printPrice();
        Shop food = new Food("好吃点", 100);
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
        System.out.println(shopName+"的价格是"+price);
    }
}

/*
* 创建电视类，继承自商品类
* */
class TV extends Shop{
    public TV() {
    }

    public TV(String shopName, double price) {
        super(shopName, price);
    }

    @Override
    public void printPrice() {
        System.out.println("电视机"+getShopName()+"的价格是"+getPrice());
    }
}

//创建食品类，继承自商品类
class Food extends Shop{
    public Food() {
    }

    public Food(String shopName, double price) {
        super(shopName, price);
    }

    @Override
    public void printPrice() {
        System.out.println("食品"+getShopName()+"的价格是"+getPrice());
    }
}

//创建工厂类，根据传递的字符串返回对应的类型
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
            System.out.println("Food类型");
        }else if(shop instanceof TV){
            System.out.println("TV类型");
        }
    }
}