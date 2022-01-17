package com.yonyou.day7.homework5;
//鸟
public class Bird extends Animal{

    private String BirdMao;

    private Wing wing;

    public Bird(){

    }

    public Bird(String name){
        super(name);
    }

    //下蛋
    @Override
    public void production() {
        System.out.println(super.getAnimalName()+"下蛋！！！！！！");
    }
}
