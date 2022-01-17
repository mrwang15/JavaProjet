package com.yonyou.day15;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author 王佳鹏
 * @Date 2022/1/14 17:20
 * @Description
 */
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码。
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码。
        System.out.println(Arrays.toString(gbks));

        System.out.println("******************");

        String str2 = new String(bytes);//使用默认的字符集，进行解码。
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码。原因：编码集和解码集不一致！


        String str4 = new String(gbks, "gbk");
        System.out.println(str4);//没出现乱码。原因：编码集和解码集一致！

    }


}
