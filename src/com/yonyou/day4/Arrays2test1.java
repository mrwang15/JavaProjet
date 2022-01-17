package com.yonyou.day4;

/**
 * 有5个班各5名学生某门课程的成绩，如何计算5个班各自的平均成绩
 */
public class Arrays2test1 {
    public static void main(String[] args) {
        int[][] grades= {{36,56,56,45},{25,45,14},{45,14,32},{42,41,74}};
        int[] avg = avg(grades);
        for (int i=0;i<avg.length;i++){
            System.out.println("第"+(i+1)+"个班级的平均成绩为"+avg[i]);
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
