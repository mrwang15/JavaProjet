package com.yonyou.day09.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/7 16:31
 * @Description
 *  按照控制台提示输入1～3之间任一个数字，程序将输出相应的课程名称
 *  根据键盘输入进行判断。如果输入正确，输出对应课程名称。如果输入错误，给出错误提示
 *  不管输入是否正确，均输出“欢迎提出建议！”语句
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入选择的课程，1.语文   2.数学    3.英语");
        try {
            int i = scanner.nextInt();
            if (i==1){
                System.out.println("语文");
            }else if(i==2){
                System.out.println("数学");
            }else if (i==3){
                System.out.println("英语");
            }else {
                System.out.println("您输入的课程不存在");
            }
        }catch (InputMismatchException e){
            System.out.println("你输入的不是数字");
        }finally {
            System.out.println("欢迎提出建议！！");
        }
    }
}
