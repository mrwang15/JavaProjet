package com.yonyou.day18;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 10:47
 * @Description
 *  AtomicBoolean： 原子更新布尔类型
 *  AtomicInteger：   原子更新整型
 *  AtomicLong：	原子更新长整型
 */
public class AtomicIntegerTest1 {
    public static void main(String[] args) {
        AtomicInteger  atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.getAndAdd(1));
        System.out.println(atomicInteger.addAndGet(1));
        System.out.println(atomicInteger.getAndSet(10));
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }
}
