package com.yonyou.day10;

import sun.java2d.pipe.SpanClipRenderer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author Õıº—≈Ù
 * @Date 2022/1/10 10:42
 * @Description
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        Student zhangsan = new Student("zhangsan", 10);
        list.add(zhangsan);
        list.add(new Student("lisi",11));
        list.add(new Student("wangwu",196));
        list.add(new Student("zhaoliu",100));
        list.remove(zhangsan);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.remove(1);
        Iterator<Student> iterator2 = list.iterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());

        }
        list.removeIf(new Predicate<Student>(){
            @Override
            public boolean test(Student o) {

                return o.getAge()>10;
            }
        });

        list.removeIf((student)->{
            return student.getAge()>10;
        });

        list.removeIf(student-> student.getAge()>10);

    }
}

class Student{
    private  String name;
    private  Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
