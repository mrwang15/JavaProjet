package com.yonyou.day18;

import java.util.HashMap;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/19 10:52
 * @Description
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>(4);
        new Thread(()->{
            for (int i=0;i<50;i++) {
                hashMap.put(i+"",i+"");
            }
        }).start();

        new Thread(()->{
            for (int i=0;i<100;i++) {
                hashMap.put(i+"",i+"");
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       hashMap.forEach((s,b)->{
           System.out.println(s+"    "+b);
       });
    }
}
