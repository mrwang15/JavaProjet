package com.yonyou.day6.Homework.morning.Homework2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Author ������
 * @Date 2022/1/3 16:52
 * @Description
 *  ����ģʽ
 */

/*
        ����ģʽ
 */
public class Singleton1 {
    private static  Singleton1 singLeton1;
    public static Singleton1 getInstance(){
        if (singLeton1==null){
            return new Singleton1();
        }
        return singLeton1;
    }

}

/**
 * ����ģʽ1
 */
class Singleton2{
    private Singleton2(){

    }
    private static Singleton2  singleton2= new Singleton2();

    //3.�ṩ�����ľ�̬�ķ�����������Ķ���
    public static Singleton2 getInstance(){
        return singleton2;
    }
}

/**
 * ����ģʽ2
 */
class Singleton3{
    private Singleton3(){

    }
    private static Singleton3 singleton3=null;
    static {
        singleton3=new Singleton3();
    }
    public static Singleton3 getInstance(){
        return singleton3;
    }
}