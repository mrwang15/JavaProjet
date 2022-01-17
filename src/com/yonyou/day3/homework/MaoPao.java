package com.yonyou.day3.homework;

import com.sun.java.swing.plaf.windows.WindowsToolBarSeparatorUI;

public class MaoPao {
    public static void main(String[] args) {
        int[] paixu = paixu(new int[]{5, 7, 3, 4, 6});
        for (int i : paixu) {
            System.out.println(i+"   ");
        }
    }
    public static int[] paixu(int[] ints){
        for (int i=ints.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if (ints[j] > ints[j+1]) {
                    int temp=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=temp;
                }
            }
        }
        return ints;
    }
}
