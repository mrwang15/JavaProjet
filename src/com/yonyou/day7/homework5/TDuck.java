package com.yonyou.day7.homework5;
//唐老鸭
public class TDuck extends Duck implements Speak {

    public TDuck(String name) {
        super(name);
    }

    public void speak(){
        System.out.println(getAnimalName()+"说话！！！");
    }

}
