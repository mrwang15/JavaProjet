package com.yonyou.day7.homework5;
//大雁
public class Goose extends Bird implements Fly{

    public Goose(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(getAnimalName()+"飞！！！！");
    }

}
