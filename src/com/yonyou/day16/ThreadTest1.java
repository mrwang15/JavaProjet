package com.yonyou.day16;

/**
 * @Author ������
 * @Date 2022/1/17 10:00
 * @Description
 *      �����̵߳����ַ�������һ�����̳�Thread��
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"�ڹ���   " +i);
        }

    }
}

class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"�ڹ���     "+i);
        }
    }
}
