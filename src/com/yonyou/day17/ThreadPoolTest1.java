package com.yonyou.day17;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author ������
 * @Date 2022/1/18 14:08
 * @Description
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        ThreadPoolExecutor  threadPoolExecutor =new ThreadPoolExecutor(1,5,20,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(1), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy() );
        for (int i = 0; i <8 ; i++) {
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"ִ��������");
            });

        }

        threadPoolExecutor.shutdown();
    }
}
