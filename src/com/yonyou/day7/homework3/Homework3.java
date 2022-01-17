package com.yonyou.day7.homework3;

import java.io.CharArrayReader;

/**
 * @Author 王佳鹏
 * @Date 2022/1/4 19:03
 * @Description
 *
 * 3.  使用抽象类和抽象方法完成，计算车的总租金练习题
 *    1）编写汽车类，拥有一个计算总租金的抽象方法
 *    2）编写客车类，继承汽车类，根据载客量和出租天数计算总租金
 *    3）编写货车类，根据载货的吨位和出租天数计算总租金
 *    4）编写测试类，对其进行计算
 */
public class Homework3 {
    public static void main(String[] args) {
        Car bus = new Bus("大巴车");
        double calc = bus.calc(5, 5);
        System.out.println(bus.getName()+"租金为"+calc);

        Car truck = new Truck("货车");
        double calc1 = truck.calc(2.4, 5);
        System.out.println(truck.getName()+"租金为"+calc1);
    }

}

abstract class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double calc(double liang, double day);
}

class Bus extends Car{
    private String name;

    public Bus(String name) {
        this.name = name;
    }

    public Bus() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calc(double count, double day) {
       int count1= (int)count;
        return count1*day;
    }
}

class Truck extends Car{
    private String name;

    public Truck(String name) {
        this.name = name;
    }

    public Truck() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calc(double liang, double day) {
        return liang*day;
    }
}
