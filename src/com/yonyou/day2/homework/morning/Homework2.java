package com.yonyou.day2.homework.morning;

import java.util.Scanner;

/**
 * 输入一个字母来判断这个字母是元音字母还是辅音字母。
 * 要求：写两个答案，分别使用if版本和switch版本
 */
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //aeiou
        System.out.println("请输入一个字母");
        char letter = scanner.next().charAt(0);
        if ('a'==letter || 'e'==letter ||'i'==letter||'o'==letter||'u'==letter ||'A'==letter ||'E'==letter ||'I'==letter||'O'==letter ||'U'==letter){
            System.out.println(letter+"是元音字母");
        }else {
            System.out.println(letter+"是辅音字母");
        }
    }
}
