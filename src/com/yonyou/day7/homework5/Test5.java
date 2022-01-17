package com.yonyou.day7.homework5;

public class Test5 {
    public static void main(String[] args) {
        Animal duck = new Duck("鸭子");
        duck.production();
        Animal tduck = new TDuck("唐老鸭");
        tduck.production();
        ((TDuck)tduck).speak();
        Bird penguin = new Penguin("企鹅");
        penguin.production();

        Bird goose = new Goose("大雁");
        ((Goose)goose).fly();


    }
}
