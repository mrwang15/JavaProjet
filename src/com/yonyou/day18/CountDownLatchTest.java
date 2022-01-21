package com.yonyou.day18;

import java.util.concurrent.CountDownLatch;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 16:14
 * @Description
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        //参数是需要等待几个线程
        CountDownLatch countDownLatch = new CountDownLatch(4);
        Child child = new Child(countDownLatch);
        Child2 child2 = new Child2(countDownLatch);
        Child3 child3 = new Child3(countDownLatch);
        Mather mather = new Mather(countDownLatch);


        Child4 child4 = new Child4(countDownLatch);

        child.start();
        child2.start();
        child3.start();
        mather.start();
        child4.start();
    }
}

class Child extends  Thread{
    CountDownLatch  countDownLatch;

    public Child(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public Child() {
    }

    @Override
    public void run() {
        for (int cont = 0; cont <15 ; cont++) {
            System.out.println(Thread.currentThread().getName()+"吃了"+cont+"个饺子");
        }

        countDownLatch.countDown();
    }
}

class Child2 extends  Thread{
    CountDownLatch  countDownLatch;

    public Child2(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public Child2() {
    }

    @Override
    public void run() {
        for (int cont = 0; cont <15 ; cont++) {
            System.out.println(Thread.currentThread().getName()+"吃了"+cont+"个饺子");
        }

        countDownLatch.countDown();
    }
}

class Child3 extends  Thread {
    CountDownLatch countDownLatch;

    public Child3(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public Child3() {
    }

    @Override
    public void run() {
        for (int cont = 0; cont < 15; cont++) {
            System.out.println(Thread.currentThread().getName() + "吃了" + cont + "个饺子");
        }

        countDownLatch.countDown();
    }
}

class Child4 extends  Thread {
    CountDownLatch countDownLatch;

    public Child4(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public Child4() {
    }

    @Override
    public void run() {
        for (int cont = 0; cont < 15; cont++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "吃了" + cont + "个饺子");
        }

        countDownLatch.countDown();
    }
}

class Mather extends Thread{
    CountDownLatch countDownLatch;

    public Mather(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public Mather() {
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("收拾碗筷");

    }
}
