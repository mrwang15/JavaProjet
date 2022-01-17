package com.yonyou.day15;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author ������
 * @Date 2022/1/14 17:20
 * @Description
 */
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "abc123�й�";
        byte[] bytes = str1.getBytes();//ʹ��Ĭ�ϵ��ַ��������б��롣
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//ʹ��gbk�ַ������б��롣
        System.out.println(Arrays.toString(gbks));

        System.out.println("******************");

        String str2 = new String(bytes);//ʹ��Ĭ�ϵ��ַ��������н��롣
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//�������롣ԭ�򣺱��뼯�ͽ��뼯��һ�£�


        String str4 = new String(gbks, "gbk");
        System.out.println(str4);//û�������롣ԭ�򣺱��뼯�ͽ��뼯һ�£�

    }


}
