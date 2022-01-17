package com.yonyou.day11.homework.homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王佳鹏
 * @Date 2022/1/10 15:59
 * @Description
 *  2、	使用ArrayList保存一组数据，编写代码将ArrayList当中重复的数据去除掉。程序运行结果如下图所示：
 */
public class Homework2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("东邪");
        list.add("东邪");
        list.add("西毒");
        list.add("南帝");
        list.add("南帝");
        list.remove("东邪");
       list = deduplication(list);
       list.forEach(s-> System.out.println(s));

    }

    public static List deduplication(List<String> list){
        List<String> list1 = new ArrayList<>();
        list.forEach(s -> {
            if(!list1.contains(s)){
                list1.add(s);
            }
        });
        return list1;
    }
}
