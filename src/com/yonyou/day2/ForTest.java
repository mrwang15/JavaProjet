package com.yonyou.day2;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("一共有几个数？");
        int leng;
        leng = scanner.nextInt();
        int[] ints= new int[leng];
        for (int i=0;i<leng;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            ints[i] = scanner.nextInt();
        }
        double avg=avg(ints);
        System.out.println("平均数为"+avg);

    }
    public static double  avg(int[] ints){
        double sum=0.0;
        double avgs=0.0;
        for (int i=0;i<ints.length;i++){
            sum+=ints[i];
        }
        return sum/ints.length;
    }
}
