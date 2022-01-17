package com.yonyou.day11.homework.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author 王佳鹏
 * @Date 2022/1/10 16:26
 * @Description
 *  5、	编写一个程序，使用for循环生成100个1到100之间的随机数。将不重复的数据存入List1中，将剩余的数据存入List2中。
 */
public class Homework5 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        Random random = new Random();
        for (int i = 0; i <100 ; i++) {
            int ran = random.nextInt(100)+1;
            if (!list1.contains(ran)){
                list1.add(ran);
            }else {
                list2.add(ran);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }

}
