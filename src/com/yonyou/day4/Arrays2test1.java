package com.yonyou.day4;

/**
 * ��5�����5��ѧ��ĳ�ſγ̵ĳɼ�����μ���5������Ե�ƽ���ɼ�
 */
public class Arrays2test1 {
    public static void main(String[] args) {
        int[][] grades= {{36,56,56,45},{25,45,14},{45,14,32},{42,41,74}};
        int[] avg = avg(grades);
        for (int i=0;i<avg.length;i++){
            System.out.println("��"+(i+1)+"���༶��ƽ���ɼ�Ϊ"+avg[i]);
        }
    }

    public static int[] avg(int[][] grades){
        int[] avgs= new int[grades.length];
        for (int i=0;i<grades.length;i++){
            int sum=0;
            for (int j=0;j<grades[i].length;j++){
                sum+=grades[i][j];
            }
            avgs[i]=sum/grades[i].length;
        }
        return avgs;
    }
}
