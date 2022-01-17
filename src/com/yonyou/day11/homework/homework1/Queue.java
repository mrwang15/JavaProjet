package com.yonyou.day11.homework.homework1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 王佳鹏
 * @Date 2022/1/10 15:36
 * @Description
 *  队列
 */
public class Queue {
    public void  queue(){
            LinkedList<String> list = new LinkedList<>();
            list.addFirst("入列朱雀");
            list.addFirst("入列玄武");
            list.addFirst("入列青龙");
            list.addFirst("入列白虎");
        Iterator<String> iterator = list.iterator();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String string = list.removeFirst();
            System.out.println(string);
        }

    }
}


class Stack{
    public void stack(){
        List<String> list = new ArrayList<>();
        list.add("压栈东邪");
        list.add("压栈西毒");
        list.add("压栈南帝");
        list.add("压栈北丐");
        list.forEach(string -> System.out.println(string));
    }
}