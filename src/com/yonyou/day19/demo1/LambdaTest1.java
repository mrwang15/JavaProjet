package com.yonyou.day19.demo1;

/**
 * @Author Íõ¼ÑÅô
 * @Date 2022/1/20 16:15
 * @Description
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        String name = print1(s -> {
            System.out.println(s);
            return s;
        }, "name");
        System.out.println(name);
    }
    public static String  print1(Fun fun,String s){
        String name = fun.name(s);
        return name;
    }
}

