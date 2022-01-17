package com.yonyou.day13;

import jdk.nashorn.internal.ir.CallNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author ������
 * @Date 2022/1/12 13:44
 * @Description
 *  :����һ���ַ���,Ҫ��ͳ���ַ�����ÿ���ַ����ֵĴ�����
 * ����: �����ַ����ǡ�aababcabcdabcde��,�ڿ���̨���: ��a(5)b(4)c(3)d(2)e(1)��
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        Map<Character, Integer> count = count(chars);
        count.forEach((c,i)-> System.out.print(c+"("+i+")"));
    }

    public static Map<Character,Integer> count(char[] chars){
        Map<Character,Integer> map = new TreeMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                Integer integer = map.get(aChar);
                integer++;
                map.put(aChar,integer);
            }else {
                map.put(aChar,1);
            }
        }

        return map;


    }
}
