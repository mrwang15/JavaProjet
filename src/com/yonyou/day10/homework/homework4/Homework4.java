package com.yonyou.day10.homework.homework4;

import java.util.Random;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 19:21
 * @Description
 *  4.	创建一个数组，保存10个元素。生成10个随机数，随机数的范围从1到10。
 *  把每次生成的随机数放到数组当中去，要求：数组当中的每个元素不能重复。生成之后打印整个数组。
 */
public class Homework4 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random= new Random();
        for (int i=0;i<10;i++){
            int i1 = random.nextInt(10)+1;
            ints[i]=i1;
           for (int j=0;j<i;j++){
               if (ints[j]==i1){
                   i--;
                   break;
               }
           }

        }
        for (int anInt : ints) {
            System.out.print(anInt+"     ");
        }
    }
}
