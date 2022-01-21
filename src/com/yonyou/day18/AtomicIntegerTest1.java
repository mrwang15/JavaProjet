package com.yonyou.day18;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author ������
 * @Date 2022/1/19 10:47
 * @Description
 *  AtomicBoolean�� ԭ�Ӹ��²�������
 *  AtomicInteger��   ԭ�Ӹ�������
 *  AtomicLong��	ԭ�Ӹ��³�����
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
