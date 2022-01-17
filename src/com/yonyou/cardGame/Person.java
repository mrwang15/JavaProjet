package com.yonyou.cardGame;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王佳鹏
 * @Date 2022/1/6 11:28
 * @Description
 *      所有玩家的玩的信息
 *
 */
public  class Person {
    private String name; //名字
    private Double money=1000.0;    //所剩下的赌资
    private int count;      //手中点数
    private List<Car> cars = new  ArrayList(); //手中所有的牌
    private Double zhu;     //下的赌注

    public Person(String name,Double zhu) {
        this.name =name;
        this.zhu=zhu;
    }

    public Person() {
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getZhu() {
        return zhu;
    }

    public void setZhu(Double zhu) {
        this.zhu = zhu;
    }

    /**
     * 要牌
     * @param car
     */
    public  void wantCar( Car car){
        cars.add(car);
        if (car.getNum().equals("A")){
            if (count<10){
                count +=11;
            }else {
                count +=1;
            }
        }else if (car.getNum().equals("J") || car.getNum().equals("Q") || car.getNum().equals("K")){
            count +=10;
        }else {
            count +=Integer.parseInt(car.getNum());
        }
    }

    /**
     * 计算点数
     */
    public void jiSuan(){
        if (count>21){
            count =0;
        }
    }





}

