package com.yonyou.day13;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/12 14:30
 * @Description
 */
public class KeBianTest {
    public static void main(String[] args) {
       num("aaa",11,"aaa","ccc","cafz","cagfa","afofjai");


        String[] aa ={"aa","bb","cc","dd"};
        for (String s : aa) {
            System.out.println(s);
        }
    }

    public static void num(String a,Integer b ,String ... c){
        String niniji="";
        for (String s : c) {
            System.out.println(s);
            niniji= niniji;
        }
        System.out.println(a+b+niniji);
    }
}
