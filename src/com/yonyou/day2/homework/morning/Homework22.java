package com.yonyou.day2.homework.morning;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * 输入一个字母来判断这个字母是元音字母还是辅音字母。
 * 要求：写两个答案，分别使用if版本和switch版本
 */
public class Homework22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //aeiou
        System.out.println("请输入一个字母");
        char letter = scanner.next().charAt(0);
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter+"是一个元音字母");
                break;
            default:
                System.out.println(letter+"是一个辅音字母");
        }
    }
}
