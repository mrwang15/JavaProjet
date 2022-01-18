package com.yonyou.day16;

/**
 * @Author Íõ¼ÑÅô
 * @Date 2022/1/18 10:40
 * @Description
 */
public class ThreadTest8 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(thread.getState());
        thread.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(thread.getState());
        Thread.sleep(100);
        System.out.println(thread.getState());
    }


}


