package com.yonyou.day18.afternoon;

/**
 * @Author ������
 * @Date 2022/1/19 17:08
 * @Description
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        //��ȡϵͳ�������
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //��ȡϵͳ��������ĸ������� --- ƽ̨�������
        ClassLoader parent = systemClassLoader.getParent();
        //��ȡƽ̨��������ĸ������� --- �����������
        ClassLoader parent1 = parent.getParent();
        System.out.println("ϵͳ�������"+systemClassLoader);
        System.out.println("ƽ̨�������"+parent);
        System.out.println("�����������"+parent1);


    }
}
