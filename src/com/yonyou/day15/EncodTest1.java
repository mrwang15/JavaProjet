package com.yonyou.day15;

import java.io.*;
import java.util.Arrays;

/**
 * @Author Íõ¼ÑÅô
 * @Date 2022/1/14 9:49
 * @Description
 */
public class EncodTest1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String  s= "ÖÐ¹ú";
        //byte[] bytes = s.getBytes();    //[-42, -48, -71, -6]
        //byte[] bytes = s.getBytes("UTF-8"); //[-28, -72, -83, -27, -101, -67]
        byte[] bytes = s.getBytes("GBK");   //[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bytes));

    }
}
