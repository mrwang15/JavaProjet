package com.yonyou.day7.homework3;

import java.io.CharArrayReader;

/**
 * @Author ������
 * @Date 2022/1/4 19:03
 * @Description
 *
 * 3.  ʹ�ó�����ͳ��󷽷���ɣ����㳵���������ϰ��
 *    1����д�����࣬ӵ��һ�����������ĳ��󷽷�
 *    2����д�ͳ��࣬�̳������࣬�����ؿ����ͳ����������������
 *    3����д�����࣬�����ػ��Ķ�λ�ͳ����������������
 *    4����д�����࣬������м���
 */
public class Homework3 {
    public static void main(String[] args) {
        Car bus = new Bus("��ͳ�");
        double calc = bus.calc(5, 5);
        System.out.println(bus.getName()+"���Ϊ"+calc);

        Car truck = new Truck("����");
        double calc1 = truck.calc(2.4, 5);
        System.out.println(truck.getName()+"���Ϊ"+calc1);
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
