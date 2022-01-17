package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 10:04
 * @Description
 *      线程的第二种创建方式
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());
        thread.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"开始运行   "+i);
        }
    }

}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"开始运行   "+i);
            System.out.println(Thread.currentThread().getName()+"开始运行   "+i);
            
        }
    }
}
