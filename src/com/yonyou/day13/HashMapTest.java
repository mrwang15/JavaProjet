package com.yonyou.day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/12 10:22
 * @Description
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("peng","11");
        map.put("peng","12");
        map.put("aa","11");
        map.put("bb","11");
        map.put("cc","11");
        map.forEach((s,b)-> System.out.println(s+"  "+b));

        String peng = map.get("peng");
        System.out.println(peng);
        Set<String> strings = map.keySet();
        System.out.println(strings);
        System.out.println(map.containsKey("peng"));
        System.out.println(map.containsValue(11));

        System.out.println("=============================");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        map.forEach((k,v)-> System.out.println("k «"+k+"  v «"+v));
        map.forEach(new BiConsumer(){

            @Override
            public void accept(Object o, Object o2) {
                System.out.println(o.toString()+o2.toString());
            }
        });


    }
}
