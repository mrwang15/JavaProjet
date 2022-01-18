package com.yonyou.day16;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 14:55
 * @Description
 */
public class ThreadTest6 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        MyThread6 myThread7 = new MyThread6();
        myThread6.start();
        myThread7.start();
    }
}
class MyThread6 extends  Thread{
    private static int pick=100;

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
