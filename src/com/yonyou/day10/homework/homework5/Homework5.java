package com.yonyou.day10.homework.homework5;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 21:01
 * @Description
 *
 *  5.	使用字符串自带的api功能判断一个电子邮件格式是否正确，要求：电子邮件必须要有@符号和 . 符号，
 *  并且@符号和点符号之间至少要有一个字符。
 *  @符号不能是整个字符串的第一个字符，点符号也不能是整个字符串的最后一个字符。
 *  ^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$
 *  要求使用正则和非正则两种方式完成。
 */
public class Homework5 {
    public static void main(String[] args) {
        String email="fal@fjafa.";
        if (verify2(email)){
            System.out.println("输入正常");
        }else {
            System.out.println("这是个啥啊");
        }
    }

    public static boolean verify1(String email){
        return email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$");
    }

    public static boolean verify2(String email){
        return email.startsWith("@") || email.endsWith(".")||! (email.indexOf("@.")== -1)? false:true;
    }
}
