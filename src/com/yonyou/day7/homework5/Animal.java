package com.yonyou.day7.homework5;

public abstract class Animal {

    //名称
    private String animalName;

    //生命
    private int animalLife;
    //繁殖
    public abstract void production();
    //氧气
    private Oxygen oxygen;
    //水
    private Water water;

    public Animal(){

    }

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }
}
