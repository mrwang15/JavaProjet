package com.yonyou.day3.homework;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] ints ={1,2,3,4,0};
        int[] del = del(ints, 2);
        for (int i : del) {
            System.out.println(i+"   ");
        }
    }

    /**
     *
     * @param ints ��Ҫ����������
     * @param index ��Ҫɾ����Ԫ������
     * @return
     */
    public static int[] del(int[] ints,int index){
        for(int i=index;i<ints.length-1;i++){
            ints[i] =ints[i+1];
        }
        ints[ints.length-1]=0;
        return ints;
    }
}
