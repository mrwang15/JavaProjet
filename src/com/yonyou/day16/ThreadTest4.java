package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 14:10
 * @Description
 */
public class ThreadTest4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread4());
        Thread thread2 = new Thread(new MyThread42());
        thread2.setDaemon(true);
        thread.start();
        thread2.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println( Thread.currentThread().getName()+i);
        }
    }
}
class MyThread4 implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"运行 "+i);
        }
    }
}

class MyThread42 implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; true ; i++) {
            System.out.println(Thread.currentThread().getName()+"守护线程运行 "+i);
        }
    }
}
