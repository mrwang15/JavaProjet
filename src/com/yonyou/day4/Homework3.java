package com.yonyou.day4;

/**
 * 1、一个景区根据游人的年龄收取不同价格的门票。请编写游人类，根据年龄段决定能够购买的门票价格并输出
 * 2、模拟实现用户密码管理：输入旧的用户名和密码，如果正确，方有权限更新；从键盘获取新的密码，进行更新
 */
public class Homework3 {
    public static void main(String[] args) {
        Guests guest1 = new Guests(10, "ludoudan");
        guest1.setprice();
        System.out.println(guest1.getPrice());
    }
}
class Guests{
    private Integer age;
    private String name;
    private Integer price;

    public Guests() {
    }

    public Guests(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
    public Guests(Integer age, String name, Integer price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public  void setprice(){
        if (age<0){
            setPrice(0);
        }else if (getAge()<3){
            setPrice(10);
        }else if (getAge()<18){
            setPrice(20);
        }else if (getAge()<60){
            setPrice(100);
        }else{
            setPrice(10);
        }
    }

}
