package com.yonyou.day18;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/19 15:55
 * @Description
 */
public class ConcurrentHashMapTest1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                concurrentHashMap.put(i + "", i + "");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                concurrentHashMap.put(i + "", i + "");
            }
        });
        thread.start();
        thread2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        concurrentHashMap.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
