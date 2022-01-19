package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/18 18:57
 * @Description
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyThread10 myThread10 = new MyThread10();
        Thread thread = new Thread(myThread10);
        Thread thread2 = new Thread(myThread10);
        thread.start();
        thread2.start();
    }
}

class MyThread10 implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}
