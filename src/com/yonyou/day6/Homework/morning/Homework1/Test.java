package com.yonyou.day6.Homework.morning.Homework1;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/3 16:39
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        Cat cat1=null;
        Tiger tiger1=null;
        if (cat instanceof Cat){
            cat1 = (Cat) cat;
        }
        if (tiger instanceof Tiger){
            tiger1 =(Tiger)tiger;
        }
        String fish = cat1.fish();
        System.out.println(fish);
        String eat = tiger1.eat();
        System.out.println(eat);
    }
}
