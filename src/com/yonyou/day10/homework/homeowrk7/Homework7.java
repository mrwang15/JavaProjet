package com.yonyou.day10.homework.homeowrk7;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 20:55
 * @Description
 *  7.	编写代码查找“我爱你中国，我爱你故乡”当中有几个“爱”字。
 */
public class Homework7 {
    public static void main(String[] args) {
        int count=0;
        String sdaf="我爱你中国，我爱你故乡";
        char[] chars = sdaf.toCharArray();
        for (char aChar : chars) {
            if (aChar=='爱'){
                count++;
            }
        }
        System.out.println("\"爱\"的字数为"+count);
    }

}
