package com.yonyou.day14.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 王佳鹏
 * @Date 2022/1/13 18:33
 * @Description
 *  1、	使用字节流编写一段Java代码，
 */
public class Homework {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream= new FileOutputStream("C:\\Users\\24954\\Desktop\\io\\Helloworld.java");
            fileOutputStream.write("public class Helloworld{".getBytes());
            fileOutputStream.write("\r\n".getBytes());
            fileOutputStream.write("\tpublic static void main(String[] args){".getBytes());
            fileOutputStream.write("\r\n".getBytes());
            fileOutputStream.write("\t\tSystem.out.println(\"Hello world\");".getBytes());
            fileOutputStream.write("\r\n".getBytes());
            fileOutputStream.write("\t}".getBytes());
            fileOutputStream.write("\n".getBytes());
            fileOutputStream.write("}".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
