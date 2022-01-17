package com.yonyou.day7.homework2;

/**
 * @Author 王佳鹏
 * @Date 2022/1/4 18:50
 * @Description
 * 2.  使用接口完成，软件工程师既会编写代码，也会讲业务
 *    编写代码的功能写入一个接口、将业务写入另一个接口
 */
public class homework2 {
    public static void main(String[] args) {
        IT pengge = new IT("pengge");
        pengge.speak();
        pengge.write();
    }
}

interface Write{
    void write();
}
interface  Speak{
    void speak();
}

class IT implements Write,Speak{
    private String name;

    public IT(String name) {
        this.name = name;
    }

    public IT() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void write() {
        System.out.println("架构师"+name+"会写代码");
    }

    @Override
    public void speak() {
        System.out.println("架构师"+name+"会讲逻辑");
    }
}
