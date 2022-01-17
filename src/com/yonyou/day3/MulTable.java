package com.yonyou.day3;

public class MulTable {
    public static void main(String[] args) {
        MulTable mulTable = new MulTable();
        mulTable.Table(11);

    }

    public void Table(int line){
        for (int i =1;i<=line;i++){
            for (int i1=1;i1<=i;i1++){
                System.out.print(i1+"*"+i+"="+(i1*i)+"  ");
            }
            System.out.println();
        }
    }
}
