package com.yonyou.day3;
/*
     1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ��
    1. ʹ��ѭ�������ۼӣ���1��10
    2. �ж��ۼ�ֵ�Ƿ����20
    3. �������20��������ѭ��������ӡ��ǰֵ
    *
* */

public class Test2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<+10;i++){
            sum+=i;
            if (sum>20){
                break;
            }
        }
        System.out.println(sum);
    }
}
