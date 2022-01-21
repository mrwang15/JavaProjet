package com.yonyou.day19.demo2;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/20 16:30
 * @Description
 */
public class Demo2 {
    public static void main(String[] args) {
        Fun2<String> fun2 = (s)->{ System.out.println(s);
        return "aaaa";
        };
        String abc = fun2.fun("abc");


    }
    public static void print2(Fun2<String> fun2, String s){
        fun2.fun(s);
    }
}

interface Fun2 <T>{
    T fun(T t);
}
