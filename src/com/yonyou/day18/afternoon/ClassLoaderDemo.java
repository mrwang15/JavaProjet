package com.yonyou.day18.afternoon;

/**
 * @Author 王佳鹏
 * @Date 2022/1/19 17:08
 * @Description
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取系统类加载器的父加载器 --- 平台类加载器
        ClassLoader parent = systemClassLoader.getParent();
        //获取平台类加载器的父加载器 --- 启动类加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println("系统类加载器"+systemClassLoader);
        System.out.println("平台类加载器"+parent);
        System.out.println("启动类加载器"+parent1);


    }
}
