package com.yonyou.day5;

public class XingCan {
    public static void main(String[] args) {
        JiSuan jiSuan = new JiSuan();
        int sum = jiSuan.sum(10, 20);
        System.out.println(sum);
    }
}
class JiSuan{
    public int sum(int num1, int num2){
        return num1+num2;
    }
}
