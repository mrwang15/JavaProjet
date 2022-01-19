package com.yonyou.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 王佳鹏
 * @Date 2022/1/18 16:28
 * @Description
 *  线程池-Executors默认线程池
 *  ExecutorService executorService = Executors.newCachedThreadPool();
 */
public class ThreadPollTest2 {
    public static void main(String[] args) {
        //1,创建一个默认的线程池对象.池子中默认是空的.默认最多可以容纳int类型的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });

        executorService.shutdown();

    }
}
