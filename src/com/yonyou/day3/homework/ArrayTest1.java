package com.yonyou.day3.homework;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] ints = {5,4,1,2,5};
        int[] insert = insert(ints, 10, 2);
        for (int i : insert) {
            System.out.println(i+"    ");
        }
    }

    /**
     *
     * @param ints ����������
     * @param array ���������
     * @param a  ���������
     */
    public static int[] insert(int[] ints,int array,int a){
        for (int i= ints.length-1;i>a;i--){
            ints[i]=ints[i-1];
        }
        ints[a]=array;
        return ints;
    }
}
