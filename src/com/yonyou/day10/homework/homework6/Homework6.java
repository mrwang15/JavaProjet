package com.yonyou.day10.homework.homework6;

/**
 * @Author 王佳鹏
 * @Date 2022/1/8 20:59
 * @Description
 *  6.	trim方法只能去掉字符串的前后空格，如何去掉字符串当中所有的空格？请用代码实现
 */
public class Homework6 {
    public static void main(String[] args) {
        String string ="faflafldfjfla f afdaslkfa afdalkfjdal  fakslfjdskalfj fafasfla ";
        String s = string.replaceAll(" ", "");
        System.out.println(s);
    }
}
