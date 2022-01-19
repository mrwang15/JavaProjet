package com.yonyou.day16;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/18 18:32
 * @Description
 */
public class ThreadTest9 {
    public static void main(String[] args) {
        MyThread9 myThread9 = new MyThread9();
        FutureTask futureTask = new FutureTask(myThread9);
        Thread thread =new Thread(futureTask);
        Thread thread2 =new Thread(futureTask);
        thread.start();
        thread2.start();
    }
}

class MyThread9 implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"÷¥––¡À");
        return null;
    }
}
