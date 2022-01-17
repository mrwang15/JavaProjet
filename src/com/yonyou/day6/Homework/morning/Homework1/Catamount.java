package com.yonyou.day6.Homework.morning.Homework1;

/**
 * @Author 王佳鹏
 * @Date 2022/1/3 16:25
 * @Description
 *      猫科动物类
 */
public class Catamount extends Animal{
    private  String type;

    public Catamount() {
    }

    public Catamount(String name, char sex, String type) {
        super(name, sex);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String Habit(){
        return "猫科动物吃肉";
    }
}

class Cat extends Catamount{
    private String color ;

    public Cat() {
    }

    public Cat(String name, char sex, String type, String color) {
        super(name, sex, type);
        this.color = color;
    }

    public String fish(){
        return "猫爱吃鱼";
    }
}


class Tiger extends Catamount{
    private String region;

    public Tiger() {
    }

    public Tiger(String name, char sex, String type, String region) {
        super(name, sex, type);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String eat(){
        return "老虎吃肉";
    }
}
