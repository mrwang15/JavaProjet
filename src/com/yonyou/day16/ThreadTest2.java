package com.yonyou.day16;

/**
 * @Author ������
 * @Date 2022/1/17 10:04
 * @Description
 *      �̵߳ĵڶ��ִ�����ʽ
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());
        thread.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"��ʼ����   "+i);
        }
    }

}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"��ʼ����   "+i);
        }
    }
}
