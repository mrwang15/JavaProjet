package com.yonyou.day10.homework.homework5;

/**
 * @Author ������
 * @Date 2022/1/8 21:01
 * @Description
 *
 *  5.	ʹ���ַ����Դ���api�����ж�һ�������ʼ���ʽ�Ƿ���ȷ��Ҫ�󣺵����ʼ�����Ҫ��@���ź� . ���ţ�
 *  ����@���ź͵����֮������Ҫ��һ���ַ���
 *  @���Ų����������ַ����ĵ�һ���ַ��������Ҳ�����������ַ��������һ���ַ���
 *  ^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$
 *  Ҫ��ʹ������ͷ��������ַ�ʽ��ɡ�
 */
public class Homework5 {
    public static void main(String[] args) {
        String email="fal@fjafa.";
        if (verify2(email)){
            System.out.println("��������");
        }else {
            System.out.println("���Ǹ�ɶ��");
        }
    }

    public static boolean verify1(String email){
        return email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$");
    }

    public static boolean verify2(String email){
        return email.startsWith("@") || email.endsWith(".")||! (email.indexOf("@.")== -1)? false:true;
    }
}
