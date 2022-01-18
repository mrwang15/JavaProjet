package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 14:17
 * @Description
 */
public class ThreadTest5 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread5());
        Thread thread2 = new Thread(new MyThread5());
        thread.start();
        thread2.start();

    }
}

class MyThread5 implements  Runnable{
    private int pick=100;

    @Override
    public void run() {
        while(true) {
            synchronized ("abc") {
                if (pick > 0) {
                    pick--;
                    System.out.println(Thread.currentThread().getName() + "正在卖票" + "还剩下" + pick);
                }else {
                    break;
                }
            }
        }
    }
}
