package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 10:00
 * @Description
 *      创建线程的两种方法：第一个：继承Thread类
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"在工作   " +i);
        }

    }
}

class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"在工作     "+i);
        }
    }
}
