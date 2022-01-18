package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/18 9:32
 * @Description
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+"执行");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+"执行");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.setName("T1");
        thread2.setName("T2");
        thread.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread2.getState());
        System.out.println(thread.getState());

        System.out.println("执行完毕");
    }
}
