package com.yonyou.day10.homework.homework4;

import java.util.Random;

/**
 * @Author ������
 * @Date 2022/1/8 19:21
 * @Description
 *  4.	����һ�����飬����10��Ԫ�ء�����10���������������ķ�Χ��1��10��
 *  ��ÿ�����ɵ�������ŵ����鵱��ȥ��Ҫ�����鵱�е�ÿ��Ԫ�ز����ظ�������֮���ӡ�������顣
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
