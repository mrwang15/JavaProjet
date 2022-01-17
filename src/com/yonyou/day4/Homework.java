package com.yonyou.day4;

import java.util.Arrays;
import java.util.Collections;

/**
 * 创建一个二维的整型数组，奇数行升序排列，偶数行降序排列，遍历并打印这个二维数组
 */

public class Homework {
    public static void main(String[] args) {
        sortArray2(new Integer[][]{{1,5,4,2},{5,4,3,9,4},{2,5,7,6}});
    }
    public static  void sortArray2(Integer[][] ints){
        for(int i=0;i<ints.length;i++){
            if (i%2==0){
                Arrays.sort(ints[i]);
            }else {
                Arrays.sort(ints[i], Collections.reverseOrder());
            }
        }
        for(int i=0;i<ints.length;i++){
            for (int j=0;j<ints[i].length;j++){
                System.out.print(ints[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
