package com.yonyou.day09.homework;

import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/7 16:41
 * @Description
 *      1）计算圆的面积，半径不能为零和负数否则就抛出异常
 */
public class Homework2 {
    public static final double PAI=3.1415926;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        try {
            double r = scanner.nextDouble();
            if (r<=0){
                throw new rException("输入的半径太小");
            }
            System.out.println("圆的面积是"+(PAI*r*r));
        }catch (rException e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}


class rException extends Exception{
    public rException() {
    }

    public rException(String message) {
        super(message);
    }
}

