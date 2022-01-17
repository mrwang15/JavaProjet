package com.yonyou.day16;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author 王佳鹏
 * @Date 2022/1/17 10:45
 * @Description
 *      创建线程的第三中方法
 */
public class ThreadTest3{
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new MyThread3());
        Thread thread = new Thread(futureTask);
        thread.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("我是"+Thread.currentThread().getName());
        }
        try {
            System.out.println(futureTask.get());
            System.out.println(thread.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyThread3 implements Callable  {

    @Override
    public String call() throws Exception {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return "计算结果为:"+sum;
    }
}
